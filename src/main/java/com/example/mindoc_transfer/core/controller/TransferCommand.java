package com.example.mindoc_transfer.core.controller;

import javax.validation.constraints.NotNull;

/**
 * <ul>
 * <li>bookIds: 需要迁移的bookid，以英文符号','进行切割</li>
 * </ul>
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
