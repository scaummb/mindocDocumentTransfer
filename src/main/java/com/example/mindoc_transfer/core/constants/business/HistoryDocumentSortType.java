package com.example.mindoc_transfer.core.constants.business;

/**
 * <ul>
 *     <li>PUBLISH_TIME_ASC:0, "发布时间顺序"</li>
 *     <li>PUBLISH_TIME_DES:1, "发布时间倒序"</li>
 * </ul>
 * @author moubin.mo
 * @date: 2020/4/2 16:58
 */

public enum HistoryDocumentSortType {
	PUBLISH_TIME_ASC((byte) 0, "发布时间顺序"),
	PUBLISH_TIME_DES((byte) 1, "发布时间倒序");

	private byte code;
	private String text;

	public byte getCode() {
		return code;
	}

	public String getText() {
		return text;
	}

	HistoryDocumentSortType(byte code, String text) {
		this.code = code;
		this.text =text;
	}

	public static HistoryDocumentSortType fromCode(Byte code) {
		HistoryDocumentSortType[] values = HistoryDocumentSortType.values();
		for(HistoryDocumentSortType value : values) {
			if(value.code == code) {
				return value;
			}
		}
		return null;
	}
}
