package com.example.mindoc_transfer.core.controller;

/**
 * <ul>
 * <li>successBookList: successBookList</li>
 * <li>failBookList: failBookList</li>
 * </ul>
 */
public class TransferResponse {
	private String successBookList;
	private String failBookList;

	public String getSuccessBookList() {
		return successBookList;
	}

	public void setSuccessBookList(String successBookList) {
		this.successBookList = successBookList;
	}

	public String getFailBookList() {
		return failBookList;
	}

	public void setFailBookList(String failBookList) {
		this.failBookList = failBookList;
	}
}
