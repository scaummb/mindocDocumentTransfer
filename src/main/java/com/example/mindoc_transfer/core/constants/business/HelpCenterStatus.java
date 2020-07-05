package com.example.mindoc_transfer.core.constants.business;

/**
 * @author moubin.mo
 * @date: 2020/4/1 15:52
 */

public enum HelpCenterStatus {
	INVALID((byte)0), VALID((byte)1);

	private byte code;

	HelpCenterStatus(Byte code) {
		this.code = code;
	}

	public byte getCode() {
		return this.code;
	}

	public static HelpCenterStatus fromCode(Byte code) {
		if (code == null) {
			return null;
		}
		HelpCenterStatus[] values = HelpCenterStatus.values();
		for (HelpCenterStatus value : values) {
			if (value.code == code.byteValue()) {
				return value;
			}
		}
		return null;
	}
}
