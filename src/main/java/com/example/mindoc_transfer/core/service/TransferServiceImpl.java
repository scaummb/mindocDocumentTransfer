package com.example.mindoc_transfer.core.service;

import com.everhomes.tachikoma.commons.util.bean.ConvertHelper;
import com.everhomes.tachikoma.gogs.GogsConflictException;
import com.everhomes.tachikoma.gogs.GogsNotExistException;
import com.everhomes.tachikoma.gogs.pojo.GogsCommit;
import com.everhomes.tachikoma.gogs.pojo.GogsRawFileParam;
import com.everhomes.tachikoma.gogs.pojo.GogsRepo;
import com.everhomes.tachikoma.gogs.pojo.GogsRepoType;
import com.everhomes.util.RuntimeErrorException;
import com.example.mindoc_transfer.core.bean.*;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.core.constants.business.DraftFlag;
import com.example.mindoc_transfer.core.constants.business.ErrorCodes;
import com.example.mindoc_transfer.core.constants.business.HelpCenterFixType;
import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;
import com.example.mindoc_transfer.core.provider.*;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:17
 */
@Component
public class TransferServiceImpl implements TransferService {

	private final static Logger LOGGER = LoggerFactory.getLogger(TransferServiceImpl.class);

	@Autowired
	private MdBookProvider mdBookProvider;

	@Autowired
	private MdAttachmentsProvider mdAttachmentsProvider;

	@Autowired
	private MdDocumentProvider mdDocumentProvider;

	@Autowired
	private HelpCenterDocumentProvider helpCenterDocumentProvider;

	@Autowired
	private HelpCenterFolderProvider helpCenterFolderProvider;

	@Autowired
	private HelpCenterAttachmentProvider helpCenterAttachmentProvider;

	@Autowired
	private UserService userService;

	@Autowired
	private TransferGogsService gogsService;

	@Override
	public TransferResponse transfer(TransferCommand command) {
		if (StringUtils.isBlank(command.getBookIds())){
			LOGGER.error("bookIds is blank!!");
			System.exit(0);
		}

		UserLogon userLogon = userService.logon(TransferConstants.IDENTIFY, TransferConstants.PASSWORD);

		String[] bookIds = command.getBookIds().split(",");
		List<Integer> ids = Arrays.stream(bookIds).map(id -> Integer.valueOf(id)).collect(Collectors.toList());
		List<MindocBooks> mindocBooks = mdBookProvider.listBooksByIds(ids);
		return batchTransferBooks(userLogon, mindocBooks);
	}

	@Override
	public void testUploadPic() {
		UserLogon userLogon = userService.logon(TransferConstants.IDENTIFY, TransferConstants.PASSWORD);
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(TransferConstants.UPLOAD_PICTURE_URL + "?token=" + userLogon.getLoginToken());//建立HttpPost对象,改成自己的地址
		File file = new File("C:\\Users\\zuolin\\Desktop\\11.png");//相对路径使用不了的话,使用图片绝对路径
		if(!file.exists()){//判断文件是否存在
			System.out.print("文件不存在");
			return;
		}
		FileBody bin = new FileBody(file, ContentType.create("image/png", Consts.UTF_8));//创建图片提交主体信息
		HttpEntity entity = MultipartEntityBuilder
				.create()
				.setCharset(Charset.forName("utf-8"))
				.addPart("upload_file", bin)//添加到请求
				.build();
		httpPost.setEntity(entity);
		HttpResponse response= null;//发送Post,并返回一个HttpResponse对象
		try {
			response = httpClient.execute(httpPost);
			LOGGER.info("response = "+ response);
			if(response.getStatusLine().getStatusCode()==200) {//如果状态码为200,就是正常返回
				String result = EntityUtils.toString(response.getEntity());
				System.out.print(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void testGogs() {
		try {
			// 1.gogs存储帮助文档与提交脚本
			GogsRepo repo = gogsRepo(TransferConstants.DEFAULT_NAMESPACE_ID, TransferConstants.DEFAULT_DOCUMENT_GOGS_MODULE_TYPE, TransferConstants.DEFAULT_MODULE_ID, TransferConstants. DEFAULT_DOCUMENT_GOGS_OWNER_TYPE, TransferConstants.DEFAULT_DOCUMENT_GOGS_OWNER_ID);
			GogsCommit commit = gogsCommitScript(repo, "0", "", "test", true);
			LOGGER.info("commit = {}", commit);
		} catch (GogsConflictException e) {
			throwHelpCenterInnerError(null,"This file already exists in gogs! " + e.toString());
		} catch (GogsNotExistException e) {
			throwHelpCenterInnerError(null,"This file is not exist in gogs! " + e.toString());
		} catch (Exception e){
			throwHelpCenterInnerError(null,"Create document exception! " + e.toString());
		}
	}

	@Override
	public void testDB() {
		MindocBooks book = mdBookProvider.findBookById(1);
		LOGGER.info("book = {}", book);
	}

	/**
	 * <p>异常抛出</p>
	 */
	private Exception throwHelpCenterInnerError(String obj, String description) {
		LOGGER.error("throwHelpCenterInnerError : obj = {}, description = {}", obj, description);
		throw RuntimeErrorException.errorWith(ErrorCodes.SCOPE_GENERAL, ErrorCodes.ERROR_GENERAL_EXCEPTION,
				obj + " : "+ description);
	}

	/**
	 * <p>批量迁移books</p>
	 */
	private TransferResponse batchTransferBooks(UserLogon userLogon, List<MindocBooks> mindocBooks) {
		List<Integer> successBooks = new ArrayList<>();
		List<Integer> failBooks = new ArrayList<>();

		//遍历books
		if (!CollectionUtils.isEmpty(mindocBooks)){
			for (MindocBooks book : mindocBooks) {
				Boolean result = transferBook(book);
				if (result){
					successBooks.add(book.getBookId());
				} else {
					failBooks.add(book.getBookId());
				}
			}
		}

		TransferResponse response = new TransferResponse();
		response.setFailBookList(StringUtils.join(failBooks, ","));
		response.setSuccessBookList(StringUtils.join(successBooks, ","));
		return response;
	}

	private Boolean transferBook(MindocBooks book) {
		// todo 迁移book
		HelpCenterFolder folder = new HelpCenterFolder();
		folder.setFileName(book.getBookName());
		folder.setFileType(DraftFlag.DRAFT.getCode());
		folder.setParentId(TransferConstants.DEFAULT_PARENT_ID);
		folder.setSortNum(0);
		folder.setNamespaceId(TransferConstants.DEFAULT_NAMESPACE_ID);
		folder.setLevel(1);
		folder.setFixedFlag(HelpCenterFixType.UNFIXED.getCode());
		folder.setCategoryId(TransferConstants.DEFAULT_CATEGORY_ID);
		helpCenterFolderProvider.createFolder(TransferConstants.DEFAULT_PATH, folder);

		//todo 遍历上传book的文档与图片
		MindocDocuments mindocDocument = mdDocumentProvider.findDocumentByParentIdAndBookId(book.getBookId(), TransferConstants.DEFAULT_PARENT_ID);
		if (!ObjectUtils.isEmpty(mindocDocument)){
			buildHelpCenterDocument(mindocDocument, folder.getId(), TransferConstants.DEFAULT_PARENT_ID);
		}

//		getMindocDocumentTree();


		//todo 整合帮助中心
		Pattern p = Pattern.compile(TransferConstants.PICTURE_FILTER_REGEX);
		Matcher m = p.matcher("");
		while (m.find()){
			System.out.println("Match " + m.group() + " , at positions " + m.start() + " - " + (m.end() - 1));
		}

		//todo 遍历上传book的对应附件
		List<MindocAttachments> bookAttachments = mdAttachmentsProvider.listAttachmentsByBookId(book.getBookId());
		if (!CollectionUtils.isEmpty(bookAttachments)){
			transferAttachments(bookAttachments);
		}
		return false;
	}

	private void buildHelpCenterDocument(MindocDocuments mindocDocument, Long folderStructureId, Long parentId) {
//		HelpCenterDocument document = new HelpCenterDocument();
//		document.setId(id);
//		document.setParentId(parentId);
//		document.setSortNum(1);
//		document.setFolderStructureId(folderStructureId);
//		document.setFileName(mindocDocument.getDocumentName());
//		document.setPath(parentDocument.getPath().concat("/").concat(id.toString()));
//		document.setLevel(parentDocument.getLevel()+1);
	}

	private void transferAttachments(List<MindocAttachments> bookAttachments) {
		if (!CollectionUtils.isEmpty(bookAttachments)){
			bookAttachments.stream().map(r -> convertToHelpcenterAttachment(r)).collect(Collectors.toList());


		}

	}

	private HelpCenterAttachments convertToHelpcenterAttachment(MindocAttachments mindocAttachment) {
		HelpCenterAttachments helpCenterAttachment = ConvertHelper.convert(mindocAttachment, HelpCenterAttachments.class);
		return helpCenterAttachment;
	}

	/**
	 * <p>获取仓库</p>
	 * @param namespaceId
	 * @param ownerId
	 * @param ownerType
	 * @param moduleId
	 * @param moduleType
	 */
	private GogsRepo gogsRepo(Integer namespaceId, String moduleType, Long moduleId, String ownerType, Long ownerId) {
		GogsRepo repo = gogsService.getAnyRepo(namespaceId, moduleType, moduleId, ownerType, ownerId, TransferConstants.DEFAULT_DOCUMENT_GOGS_NAME);
		if (repo == null) {
			repo = new GogsRepo();
			repo.setName(TransferConstants.DEFAULT_DOCUMENT_GOGS_NAME);
			repo.setNamespaceId(namespaceId);
			repo.setModuleType(moduleType);
			repo.setModuleId(moduleId);
			repo.setOwnerType(ownerType);
			repo.setOwnerId(ownerId);
			repo.setRepoType(GogsRepoType.NORMAL.name());
			repo = gogsService.createRepo(repo);
		}
		return repo;
	}

	/**
	 * <p>获取仓库文本</p>
	 * @param repo
	 * @param path
	 * @param lastCommit
	 * @return String
	 */
	private String gogsGet(GogsRepo repo, String path, String lastCommit) {
		byte[] file = gogsService.getFile(repo, handlePath(path), lastCommit);
		return new String(file, Charset.forName("UTF-8"));
	}

	/**
	 * <p>提交文档到仓库</p>
	 * @param repo
	 * @param path
	 * @param lastCommit
	 * @param content
	 * @param isNewFile
	 * @return GogsCommit
	 */
	private GogsCommit gogsCommitScript(GogsRepo repo, String path, String lastCommit, String content, boolean isNewFile) {
		GogsRawFileParam param = new GogsRawFileParam();
		param.setCommitMessage(gogsCommitMessage());
		param.setNewFile(isNewFile);
		param.setContent(content);
		param.setLastCommit(lastCommit);
		return gogsService.commitFile(repo, handlePath(path), param);
	}

	/**
	 * <p>统一处理文件路径，添加后缀名.txt</p>
	 */
	private String handlePath(String path) {
		return path + TransferConstants.DEFAULT_FILE_SUFFIX;
	}
	/**
	 * <p>设置提交用户信息</p>
	 */
	private String gogsCommitMessage() {
		return String.format("Author: %s\n UID: %s\n Identifier: %s", "transfer", "1", "18819467607");
	}
}
