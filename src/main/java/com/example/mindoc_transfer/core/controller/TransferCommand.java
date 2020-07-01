package com.example.mindoc_transfer.core.controller;

import javax.validation.constraints.NotNull;

/**
 * @author moubin.mo
 * @date: 2020/7/1 11:09
 */

public class TransferCommand {
	@NotNull
	private String bookIds;

	public String getBookIds() {
		return bookIds;
	}

	public void setBookIds(String bookIds) {
		this.bookIds = bookIds;
	}
}
