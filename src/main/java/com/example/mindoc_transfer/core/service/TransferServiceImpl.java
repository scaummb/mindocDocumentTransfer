package com.example.mindoc_transfer.core.service;

import com.example.mindoc_transfer.core.bean.HelpCenterAttachments;
import com.example.mindoc_transfer.core.bean.MindocBooks;
import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;
import com.example.mindoc_transfer.core.provider.MdAttachmentsProvider;
import com.example.mindoc_transfer.core.provider.MdBookProvider;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

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

	@Override
	public TransferResponse transfer(TransferCommand command) {
		if (StringUtils.isBlank(command.getBookIds())){
			LOGGER.error("bookIds is blank!!");
			System.exit(0);
		}

		String[] bookIds = command.getBookIds().split(",");
		List<Integer> ids = Arrays.stream(bookIds).map(id -> Integer.valueOf(id)).collect(Collectors.toList());
		List<MindocBooks> mindocBooks = mdBookProvider.listBooksByIds(ids);
		return batchTransferBooks(mindocBooks);
	}

	/**
	 * <p>批量迁移books</p>
	 */
	private TransferResponse batchTransferBooks(List<MindocBooks> mindocBooks) {
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

		//todo 遍历上传book的对应附件
		List<HelpCenterAttachments> bookAttachments = mdAttachmentsProvider.listAttachmentsByBookId(book.getBookId());


		//todo 遍历上传book的文档与图片



		//todo 整合帮助中心


		Pattern p = Pattern.compile(TransferConstants.PICTURE_FILTER_REGEX);
		Matcher m = p.matcher("");
		while (m.find()){
			System.out.println("Match " + m.group() + " , at positions " + m.start() + " - " + (m.end() - 1));
		}
		return false;
	}

}
