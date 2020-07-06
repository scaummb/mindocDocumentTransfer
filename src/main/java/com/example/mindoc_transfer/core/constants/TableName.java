package com.example.mindoc_transfer.core.constants;

/**
 * @author moubin.mo
 * @date: 2020/7/5 23:12
 */

public enum TableName {
	FILE("FILE"),
	FOLDER("FOLDER"),
	ATTACHMENT("ATTACHMENT"),
	;

	private String name;

	TableName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static TableName fromCode(String tableName) {
		TableName[] values = TableName.values();
		for (TableName value : values) {
			if (value.name.equals(tableName)) {
				return value;
			}
		}
		return null;
	}

}
