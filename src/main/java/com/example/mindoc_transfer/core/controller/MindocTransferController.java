package com.example.mindoc_transfer.core.controller;

import com.example.mindoc_transfer.core.service.TransferService;
import com.example.mindoc_transfer.core.service.UserService;
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

	@Autowired
	private UserService userService;

	@RequestMapping("transferBook")
	@ResponseBody
	public Boolean transferBook(@Valid TransferBookCommand command){
		return transferService.transferBook(command);
	}

	@RequestMapping("batchTransfer")
	@ResponseBody
	public TransferResponse batchTransfer(@Valid TransferCommand command){
		return transferService.batchTransfer(command);
	}

	@RequestMapping("testGogs")
	@ResponseBody
	public void testGogs(){
		transferService.testGogs();
	}

	@RequestMapping("deleteGogs")
	@ResponseBody
	public void deleteGogs(DeleteGogsFileCommand command){
		transferService.deleteGogs(command);
	}

	@RequestMapping("testUploadPic")
	@ResponseBody
	public void testUploadPic(){
		transferService.testUploadPic();
	}

	@RequestMapping("testDB")
	@ResponseBody
	public void testDB(){
		transferService.testDB();
	}

	@RequestMapping("testUploadFile")
	@ResponseBody
	public void testUploadFile(){
		transferService.testUploadFile();
	}

	@RequestMapping("testRemoteFile")
	@ResponseBody
	public void testRemoteFile(){
		transferService.testRemoteFile();
	}


}
