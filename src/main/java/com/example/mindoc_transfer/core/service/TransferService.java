package com.example.mindoc_transfer.core.service;

import com.example.mindoc_transfer.core.controller.DeleteGogsFileCommand;
import com.example.mindoc_transfer.core.controller.TransferBookCommand;
import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:17
 */

public interface TransferService {

	TransferResponse batchTransfer(TransferCommand command);

	Boolean transferBook(TransferBookCommand command);

	void testUploadPic();

	void testUploadFile();

	void testGogs();

	void deleteGogs(DeleteGogsFileCommand command);

	void testDB();

	void testRemoteFile();

}
