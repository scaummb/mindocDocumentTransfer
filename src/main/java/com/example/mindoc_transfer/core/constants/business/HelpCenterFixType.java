package com.example.mindoc_transfer.core.constants.business;

/**
 * <p>固定分类标志:0-非固定分类：开放重命名和删除操作，1-固定分类：禁用重命名和删除操作</p>
 * @author moubin.mo
 * @date: 2020/4/9 15:50
 */

public enum  HelpCenterFixType {
	UNFIXED((byte) 0, "0-非固定分类：开放重命名和删除操作"),
	FIXED((byte) 1,  "1-固定分类：禁用重命名和删除操作");

	private byte code;
	private String  text;

	public String getText() {
		return text;
	}

	public byte getCode() {
		return code;
	}

	HelpCenterFixType(byte code, String text) {
		this.code = code;
		this.text = text;
	}

	public static HelpCenterFixType fromCode(Byte code) {
		HelpCenterFixType[] values = HelpCenterFixType.values();
		for(HelpCenterFixType value : values) {
			if(value.code == code) {
				return value;
			}
		}
		return null;
	}
}
