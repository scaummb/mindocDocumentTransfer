package com.example.mindoc_transfer.core.service;

import com.example.mindoc_transfer.core.controller.TransferCommand;
import com.example.mindoc_transfer.core.controller.TransferResponse;

/**
 * @author moubin.mo
 * @date: 2020/7/3 10:17
 */

public interface TransferService {

	TransferResponse transfer(TransferCommand command);

}
