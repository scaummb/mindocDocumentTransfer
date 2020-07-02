package com.example.mindoc_transfer.core.service;

import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;
import com.example.mindoc_transfer.core.provider.TransferProvider;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author moubin.mo
 * @date: 2020/7/1 11:21
 */
@Component
public class TransferServiceImpl implements TransferService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransferServiceImpl.class);

	@Autowired
	private TransferProvider transferProvider;

	@Override
	public TransferResponse transfer(TransferCommand command) {
		if (StringUtils.isNotBlank(command.getBookIds())){
			return null;
		}

		String[] bookids = command.getBookIds().split(",");
		for (String bookid : bookids){

			//TODO get book

			//todo call opc /helpcenter/createFolder

			//TODO get documents

			//TODO upload pictures of each document and replace contentserver url with mindoc picture path

			//TODO store each document into gogs ,then get gogs commitId

			//TODO call opc /helpcenter/createDocument

			//todo call opc /helpcenter/publishDocuments

			//todo handle next book

		}

		return null;
	}
}
