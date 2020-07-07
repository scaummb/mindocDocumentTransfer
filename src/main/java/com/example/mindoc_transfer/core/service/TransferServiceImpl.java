package com.example.mindoc_transfer.core.service;

import com.everhomes.tachikoma.commons.util.bean.ConvertHelper;
import com.everhomes.tachikoma.gogs.GogsConflictException;
import com.everhomes.tachikoma.gogs.GogsNotExistException;
import com.everhomes.tachikoma.gogs.pojo.GogsCommit;
import com.everhomes.tachikoma.gogs.pojo.GogsRawFileParam;
import com.everhomes.tachikoma.gogs.pojo.GogsRepo;
import com.everhomes.tachikoma.gogs.pojo.GogsRepoType;
import com.everhomes.util.DateHelper;
import com.everhomes.util.RuntimeErrorException;
import com.example.mindoc_transfer.core.bean.*;
import com.example.mindoc_transfer.core.constants.ContentTypeEnum;
import com.example.mindoc_transfer.core.constants.TableName;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.core.constants.business.DraftFlag;
import com.example.mindoc_transfer.core.constants.business.ErrorCodes;
import com.example.mindoc_transfer.core.constants.business.FileType;
import com.example.mindoc_transfer.core.constants.business.HelpCenterFixType;
import com.example.mindoc_transfer.core.controller.FileUploadResponse;
import com.example.mindoc_transfer.core.controller.TransferBookCommand;
import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;
import com.example.mindoc_transfer.core.provider.*;
import com.example.mindoc_transfer.core.utils.HttpUtils;
import com.example.mindoc_transfer.core.utils.IdFactory;
import com.example.mindoc_transfer.core.utils.RestPostUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.util.*;
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
	public TransferResponse batchTransfer(TransferCommand command) {
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

		File file = new File("C:\\Users\\zuolin\\Desktop\\11.png");//相对路径使用不了的话,使用图片绝对路径
		uploadPic(userLogon.getLoginToken(), file);

	}

	@Override
	public void testUploadFile() {
		UserLogon userLogon = userService.logon(TransferConstants.IDENTIFY, TransferConstants.PASSWORD);
		File file = new File("I:\\mindoc_windows_amd64\\uploads\\202006\\attach_161acebdd9e82efc.png");//相对路径使用不了的话,使用图片绝对路径
		FileUploadResponse fileUploadResponse = uploadFile(file, userLogon.getLoginToken(), ".png");
		LOGGER.info("testUploadFile, fileUploadResponse = {}", fileUploadResponse);
	}

	/**
	 * 上传图片到contentserver
	 * @param file
	 * @param loginToken
	 * @param fileExt
	 */
	private FileUploadResponse uploadFile(File file, String loginToken, String fileExt) {
		try {
			//建立HttpPost对象
			HttpPost httpPost = new HttpPost(TransferConstants.UPLOAD_FILE_URL + "?token=" + loginToken);
			MultipartEntity reqEntity = new MultipartEntity();
			reqEntity.addPart("upload_file", new FileBody(file));
			httpPost.setEntity(reqEntity);
			//发送Post,并返回一个HttpResponse对象
			HttpResponse response= null;
			response = HttpUtils.getHttpClient().execute(httpPost);
			if(response.getStatusLine().getStatusCode()==200) {
				//如果状态码为200,就是正常返回
				String result = EntityUtils.toString(response.getEntity());
				System.out.print(result);
				return  (FileUploadResponse) RestPostUtils.parseResponseToPojo(result, FileUploadResponse.class);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 获取上传文件的请求MIME类型
	 */
	private String getContentType(String fileExt) {
		return ContentTypeEnum.fromCode(fileExt).getContentType();
	}

	/**
	 * 上传图片到contentserver
	 */
	private void uploadPic(String loginToken, File file) {
		//建立HttpPost对象,改成自己的地址
		HttpPost httpPost = new HttpPost(TransferConstants.UPLOAD_PICTURE_URL + "?token=" + loginToken);
		//判断文件是否存在
		if(!file.exists()){
			System.out.print("文件不存在");
			return;
		}
		//创建图片提交主体信息
		FileBody bin = new FileBody(file, ContentType.create("image/png", Consts.UTF_8));
		//添加到请求
		HttpEntity entity = MultipartEntityBuilder
				.create()
				.setCharset(Charset.forName("utf-8"))
				.addPart("upload_file", bin)
				.build();
		httpPost.setEntity(entity);
		//发送Post,并返回一个HttpResponse对象
		HttpResponse response= null;
		try {
			response = HttpUtils.getHttpClient().execute(httpPost);
			LOGGER.info("response = "+ response);
			if(response.getStatusLine().getStatusCode()==200) {
				//如果状态码为200,就是正常返回
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

	@Override
	public TransferResponse transferBook(TransferBookCommand command) {
		UserLogon userLogon = userService.logon(TransferConstants.IDENTIFY, TransferConstants.PASSWORD);

		MindocBooks book = mdBookProvider.findBookById(Integer.valueOf(command.getBookId()));
		// 1.迁移book至folder
		HelpCenterFolder folder = buildHelpCenterFolder(book);
		helpCenterFolderProvider.createFolder(TransferConstants.DEFAULT_PATH, folder);

		if (!ObjectUtils.isEmpty(book)){
			// 2.迁移documents至files
			List<MindocDocuments> documents = mdDocumentProvider.listDocumentsByParentIdAndBookId(book.getBookId(), TransferConstants.DEFAULT_PARENT_ID);
			// 迁移mindoc根节点
			MindocDocuments rootMindocDocument = documents.get(0);
			HelpCenterDocument rootDocument = buildHelpCenterDocument(rootMindocDocument, folder.getId());
			rootDocument = buildAndCreateDocumentWithNewParentIdAndPath(TransferConstants.DEFAULT_PATH, TransferConstants.DEFAULT_PARENT_ID.longValue(), rootDocument, rootMindocDocument.getMarkdown(), userLogon.getLoginToken());

			// 发现mindoc的下节点数据
			List<MindocDocuments> subMindocDocuments = mdDocumentProvider.listDocumentsByParentIdAndBookId(book.getBookId(), rootMindocDocument.getDocumentId());
			if (!CollectionUtils.isEmpty(subMindocDocuments)){
				for (MindocDocuments subMindocDocument : subMindocDocuments){

					// 递归迁移mindoc余下节点数据
					HelpCenterDocument subDocument = buildHelpCenterDocument(subMindocDocument, folder.getId());
					buildAndCreateDocumentWithNewParentIdAndPath(rootDocument.getPath(), rootDocument.getId(), subDocument, subMindocDocument.getMarkdown(), userLogon.getLoginToken());
					transferSubMindocDocument(book.getBookId(), subMindocDocument.getDocumentId(), subDocument.getFolderStructureId(),subDocument.getPath(),subDocument.getId(), userLogon.getLoginToken());
				}

			}

			// 3.迁移attachments至帮助中心附件表
			List<MindocAttachments> mindocAttachments = mdAttachmentsProvider.listAttachmentsByBookId(book.getBookId());
			if (!CollectionUtils.isEmpty(mindocAttachments)){
				List<HelpCenterAttachments> helpCenterAttachments = batchBuildHelpCenterAttachments(mindocAttachments, folder.getId(), userLogon.getLoginToken());
				helpCenterAttachmentProvider.batchCreateAttachments(helpCenterAttachments);
			}
		}

		TransferResponse response = new TransferResponse();
		return response;
	}

	/**
	 * <p>批量构造帮助中心的附件</p>
	 */
	private List<HelpCenterAttachments> batchBuildHelpCenterAttachments(List<MindocAttachments> mindocAttachments, Long folderId, String loginToken) {
		if (!CollectionUtils.isEmpty(mindocAttachments)){
			mindocAttachments.stream().map(mindocAttachment -> convertToHelpCenterAttachments(mindocAttachment, folderId, loginToken)).collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	/**
	 * <p>构造帮助中心附件</p>
	 */
	private HelpCenterAttachments convertToHelpCenterAttachments(MindocAttachments mindocAttachment, Long folderId, String loginToken) {
		HelpCenterAttachments helpCenterAttachment = ConvertHelper.convert(mindocAttachment, HelpCenterAttachments.class);
		helpCenterAttachment.setId(IdFactory.getNextId(TableName.ATTACHMENT.getName()).intValue());
		helpCenterAttachment.setFolderStructureId(folderId);
		helpCenterAttachment.setFileStructureId(null);
		helpCenterAttachment.setFileUrl(getCSFileUrl(mindocAttachment, loginToken));
		return helpCenterAttachment;
	}

	/**
	 * <p>上传并返回文件服务器URL</p>
	 */
	private String getCSFileUrl(MindocAttachments mindocAttachment, String loginToken) {
		File file = new File(TransferConstants.DEFAULT_TRANSFER_ATTACHMENT_PATH + mindocAttachment.getFilePath());
		FileUploadResponse fileUploadResponse = uploadFile(file, loginToken, mindocAttachment.getFileExt());
		if (!ObjectUtils.isEmpty(fileUploadResponse)){
			return fileUploadResponse.getUrl();
		}
		return null;
	}

	/**
	 * <p>递归迁移mindoc子节点的文档数据至帮助中心</p>
	 */
	private void transferSubMindocDocument(Integer mindocBookId, Integer mindocParantDocumentId, Long folderStructureId, String parentHelpcenterDocumentPath, Long parentHelpcenterDocumentId, String loginToken) {
		List<MindocDocuments> subMindocDocuments = mdDocumentProvider.listDocumentsByParentIdAndBookId(mindocBookId, mindocParantDocumentId);
		if (!CollectionUtils.isEmpty(subMindocDocuments)){
			for (MindocDocuments subMindocDocument : subMindocDocuments){
				// 迁移mindoc节点数据
				HelpCenterDocument subDocument = buildHelpCenterDocument(subMindocDocument, folderStructureId);
				buildAndCreateDocumentWithNewParentIdAndPath(parentHelpcenterDocumentPath, parentHelpcenterDocumentId, subDocument, subMindocDocument.getMarkdown(), loginToken);
				transferSubMindocDocument(mindocBookId, subMindocDocument.getDocumentId(), folderStructureId, subDocument.getPath(), subDocument.getParentId(), loginToken);
			}
		}
	}


	/**
	 * <p>构造帮助中心章节文档</p>
	 */
	private HelpCenterDocument buildHelpCenterDocument(MindocDocuments rootMindocDocument, Long folderId) {
		HelpCenterDocument document = new HelpCenterDocument();
		document.setFolderStructureId(folderId);
		document.setLevel(TransferConstants.DEFAULT_LEVEL);
		document.setSortNum(TransferConstants.SORT_NUM);
		document.setNamespaceId(TransferConstants.DEFAULT_NAMESPACE_ID);
		document.setFileName(rootMindocDocument.getDocumentName());
		document.setDraftFlag(DraftFlag.DRAFT.getCode());
		return document;
	}

	/**
	 * <p>迁移book到folder</p>
	 */
	private HelpCenterFolder buildHelpCenterFolder(MindocBooks book) {
		HelpCenterFolder folder = new HelpCenterFolder();
		folder.setCategoryId(TransferConstants.DEFAULT_CATEGORY_ID);
		folder.setCreateTime(new Timestamp(DateHelper.currentGMTTime().getTime()));
		folder.setFileName(book.getBookName());
		folder.setFileType(FileType.FILE.getCode());
		folder.setParentId(TransferConstants.DEFAULT_PARENT_ID.longValue());
		folder.setSortNum(TransferConstants.SORT_NUM);
		folder.setNamespaceId(TransferConstants.DEFAULT_NAMESPACE_ID);
		folder.setLevel(TransferConstants.DEFAULT_LEVEL);
		folder.setFixedFlag(HelpCenterFixType.UNFIXED.getCode());
		return folder;
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
		folder.setParentId(TransferConstants.DEFAULT_PARENT_ID.longValue());
		folder.setSortNum(0);
		folder.setNamespaceId(TransferConstants.DEFAULT_NAMESPACE_ID);
		folder.setLevel(1);
		folder.setFixedFlag(HelpCenterFixType.UNFIXED.getCode());
		folder.setCategoryId(TransferConstants.DEFAULT_CATEGORY_ID);
		helpCenterFolderProvider.createFolder(TransferConstants.DEFAULT_PATH, folder);

		//todo 遍历上传book的文档与图片
		List<MindocDocuments> documents = mdDocumentProvider.listDocumentsByParentIdAndBookId(book.getBookId(), TransferConstants.DEFAULT_PARENT_ID);
		if (CollectionUtils.isEmpty(documents)){
//			buildAndCreateDocumentWithNewParentIdAndPath();
//			buildHelpCenterDocument(mindocDocument, folder.getId(), TransferConstants.DEFAULT_PARENT_ID.longValue());
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


	/**
	 * <p>构造新的帮助中心文档，并更新id/path/parentId/lastcommit</p>
	 */
	private HelpCenterDocument buildAndCreateDocumentWithNewParentIdAndPath(String parentPath, Long parentId, HelpCenterDocument helpCenterDocument, String markdown, String loginToken) {
		Long id = IdFactory.getNextId(TableName.FILE.getName());
		helpCenterDocument.setId(id);
		helpCenterDocument.setPath(parentPath.concat("/").concat(id.toString()));
		helpCenterDocument.setParentId(parentId);
		try{
			GogsRepo repo = gogsRepo(TransferConstants.DEFAULT_NAMESPACE_ID, TransferConstants.DEFAULT_DOCUMENT_GOGS_MODULE_TYPE, TransferConstants.DEFAULT_MODULE_ID, TransferConstants. DEFAULT_DOCUMENT_GOGS_OWNER_TYPE, TransferConstants.DEFAULT_DOCUMENT_GOGS_OWNER_ID);
			String markDownContent = handleMindocMarkDownContent(markdown, loginToken);
			GogsCommit commit = gogsCommitScript(repo, helpCenterDocument.getPath(), "", markDownContent, true);
			helpCenterDocument.setLastCommit(commit.getId());
		} catch (Exception e){
			throwHelpCenterInnerError(
					String.format("id=/%s,parentId=/%s,folderStructureId=/%s", helpCenterDocument.getId(), helpCenterDocument.getParentId(), helpCenterDocument.getFolderStructureId()),
					"Create document content error, gogs报错: " + e.toString());
		}
		return helpCenterDocumentProvider.createSingleDocument(helpCenterDocument);
	}

	/**
	 * <p>处理mindoc的markdown语法文本，匹配图片路径并上传到contentserver</p>
	 */
	private String handleMindocMarkDownContent(String markdown, String loginToken) {
		Pattern p = Pattern.compile(TransferConstants.PICTURE_FILTER_REGEX);
		Matcher m = p.matcher(markdown);
		ArrayList<String> keywordList = new ArrayList();
		// 全文本关键字匹配
		while (m.find()) {
			keywordList.add(m.group(0));
		}
		LOGGER.info("handleMindocMarkDownContent: keywordList = {}", keywordList);
		// 文本图片迁移
		HashMap<String, String> keywordToContentServerUrlMap = handleKeyWordList(keywordList, loginToken);
		// 全文本替换原来的关键字
		String content = replaceAllKeyWord(markdown, keywordToContentServerUrlMap);
		return content;
	}

	/**
	 * <p>全文本替换所有的关键字</p>
	 */
	private String replaceAllKeyWord(String markdown, HashMap<String,String> keywordToContentServerUrlMap) {
		if (!CollectionUtils.isEmpty(keywordToContentServerUrlMap)){
			Iterator<String> iterator = keywordToContentServerUrlMap.keySet().iterator();
			while (iterator.hasNext()){
				String keyword = iterator.next();
				markdown = markdown.replaceAll(handleKey(keyword), handleValue(keywordToContentServerUrlMap.get(keyword)));
			}
		}
		return markdown;
	}

	/**
	 * <p>
	 *     文本图片迁移:key=mindoc原图片地址，value=ContentServer地址
	 * </p>
	 */
	private HashMap<String,String> handleKeyWordList(ArrayList<String> keywordList, String loginToken) {
		if (CollectionUtils.isEmpty(keywordList)){
			return new HashMap<>();
		}

		HashMap<String, String> keywordToContentServerUrlMap = new HashMap<>();
		keywordList.stream().forEach(keyword -> {
			try {
				keywordToContentServerUrlMap.putIfAbsent(keyword, getTransferCSUrl(keyword, loginToken));
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		});

		return keywordToContentServerUrlMap;
	}

	/**
	 * <p>获取图片服务器的图片资源定位符</p>
	 */
	private String getTransferCSUrl(String keyword, String loginToken) throws URISyntaxException {
		// 图片链接配置了域名
		if (keyword.startsWith("http://s.a.com/") || keyword.startsWith("http://serverdoc.lab.everhomes.com/")){
			File file = null;//相对路径使用不了的话,使用图片绝对路径
			try {
				file = new File(new URL(keyword).toURI());
				uploadPic(loginToken, file);
			} catch (Exception e) {
				LOGGER.error("getTransferCSUrl(http://s.a.com/ or http://serverdoc.lab.everhomes.com/): e = {}", e);
			}
		} else {
			//相对路径使用不了的话,使用图片绝对路径,为了方便已经提前将全部附件导出到本地
			File file = new File(TransferConstants.DEFAULT_TRANSFER_ATTACHMENT_PATH + keyword);
			try {
				uploadPic(loginToken, file);
			} catch (Exception e) {
				LOGGER.error("getTransferCSUrl of relative path : e = {}", e);
			}
		}

		return null;
	}

	private URLConnection connect(URL url) {
		URLConnection connection = null;
		try {
			connection = url.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			// 建立实际的连接
			connection.connect();
		} catch (IOException e) {
			LOGGER.error("msg",e);
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * <p>处理文本key值</p>
	 */
	private static String handleKey(String key) {
		key = key.replaceAll("\\!","\\\\\\!");
		key = key.replaceAll("\\[","\\\\\\[");
		key = key.replaceAll("\\]","\\\\\\]");
		key = key.replaceAll("\\(","\\\\\\(");
		key = key.replaceAll("\\/","\\\\\\/");
		key = key.replaceAll("\\)","\\\\\\)");
		return key;
	}

	/**
	 * <p>处理文本value值</p>
	 */
	private String handleValue(String value) {
		return "![](" + value + ")";
	}
	/**
	 * <p>迁移附件</p>
	 */
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
		return String.format("Author: %s\n UID: %s\n Identifier: %s", "batchTransfer", "1", "18819467607");
	}
}
