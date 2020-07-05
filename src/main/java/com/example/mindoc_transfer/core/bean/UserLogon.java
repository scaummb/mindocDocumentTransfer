package com.example.mindoc_transfer.core.bean;

public class UserLogon {
	private Long uid;
	private String contentServer;
	private String loginToken;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getContentServer() {
		return contentServer;
	}

	public void setContentServer(String contentServer) {
		this.contentServer = contentServer;
	}

	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
}
