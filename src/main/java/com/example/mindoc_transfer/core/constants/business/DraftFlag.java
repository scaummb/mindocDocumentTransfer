package com.example.mindoc_transfer.core.constants.business;

/**
 * @author moubin.mo
 * @date: 2020/4/2 15:58
 */

public enum DraftFlag {
	NOT_DRAFT((byte) 0, "非草稿"),
	DRAFT((byte) 1, "草稿");

	private byte code;
	private String text;

	public String getText() {
		return text;
	}

	public byte getCode() {
		return code;
	}

	DraftFlag(byte code, String text) {
		this.code = code;
		this.text = text;
	}

	public static DraftFlag fromCode(Byte code) {
		DraftFlag[] values = DraftFlag.values();
		for(DraftFlag value : values) {
			if(value.code == code) {
				return value;
			}
		}
		return null;
	}
}
