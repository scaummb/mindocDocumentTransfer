package com.example.mindoc_transfer.core.controller;

import com.example.mindoc_transfer.core.service.TransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author moubin.mo
 * @date: 2020/7/1 11:06
 */
@RestController
@RequestMapping("/mindoc")
public class MindocTransferController {

	private final Logger LOGGER = LoggerFactory.getLogger(MindocTransferController.class);

	@Autowired
	private TransferService transferService;

	@RequestMapping("transfer")
	@ResponseBody
	public TransferResponse transfer(@Valid TransferCommand command){
		return transferService.transfer(command);
	}
}
