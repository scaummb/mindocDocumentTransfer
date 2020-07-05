package com.example.mindoc_transfer.core.constants.business;

public enum FileStatus {
	INVALID((byte)0),
	VALID((byte)1);

	private byte code;

	FileStatus(Byte code) {
		this.code = code;
	}

	public byte getCode() {
		return this.code;
	}

	public static FileStatus fromCode(Byte code) {
		if (code == null) {
			return null;
		}
		FileStatus[] values = FileStatus.values();
		for (FileStatus value : values) {
			if (value.code == code.byteValue()) {
				return value;
			}
		}
		return null;
	}
}
