package com.example.mindoc_transfer.core.service;

import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;
import com.example.mindoc_transfer.core.provider.TransferProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author moubin.mo
 * @date: 2020/7/1 11:21
 */
@Component
public class TransferServiceImpl implements TransferService {

	@Autowired
	private TransferProvider transferProvider;

	@Override
	public TransferResponse transfer(TransferCommand command) {

		return null;
	}
}
