
package com.example.mindoc_transfer.core.constants.business;
/**
 * <ul>
 *     <li>DIRECTORY:文件夹类型</li>
 *     <li>FILE:文件类型</li>
 * </ul>
 * @author moubin.mo
 * @date: 2020/4/1 10:30
 */

public enum FileType {
	DIRECTORY((byte) 1, "文件夹类型"), FILE((byte) 2, "文件类型");

	private byte code;
	private String text;

	public String getText() {
		return text;
	}

	public byte getCode() {
		return code;
	}

	FileType(byte code, String text) {
		this.code = code;
		this.text = text;
	}

	public static FileType fromCode(Byte code) {
		FileType[] values = FileType.values();
		for(FileType value : values) {
			if(value.code == code) {
				return value;
			}
		}
		return null;
	}
}
