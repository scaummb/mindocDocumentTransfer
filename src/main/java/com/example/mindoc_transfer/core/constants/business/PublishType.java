package com.example.mindoc_transfer.core.constants.business;

/**
 * <ul>
 *     <li>UNPUBLISHED：未发布，0</li>
 *     <li>PUBLISHED：已发布，1</li>
 * </ul>
 * @author moubin.mo
 * @date: 2020/4/1 10:06
 */

public enum PublishType {
	UNPUBLISHED((byte) 0, "未发布"),
	PUBLISHED((byte) 1, "已发布");

	private Byte code;
	private String text;

	public String getText() {
		return text;
	}

	public Byte getCode() {
		return code;
	}

	PublishType(Byte code, String text) {
		this.code = code;
		this.text = text;
	}
}
