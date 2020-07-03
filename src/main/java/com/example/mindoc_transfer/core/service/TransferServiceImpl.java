package com.example.mindoc_transfer.core.service;

import com.example.mindoc_transfer.core.constants.TransferConstants;
import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:17
 */
@Component
public class TransferServiceImpl implements TransferService {

	@Override
	public TransferResponse transfer(TransferCommand command) {
		//todo 遍历books
		//todo 遍历上传book的对应附件
		//todo 遍历上传book的文档与图片
		//todo 整合帮助中心


		Pattern p = Pattern.compile(TransferConstants.PICTURE_FILTER_REGEX);
		Matcher m = p.matcher("");
		while (m.find()){
			System.out.println("Match " + m.group() + " , at positions " + m.start() + " - " + (m.end() - 1));
		}
		return null;
	}

}
