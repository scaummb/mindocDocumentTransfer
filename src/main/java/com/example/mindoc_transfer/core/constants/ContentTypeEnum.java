package com.example.mindoc_transfer.core.constants;

/**
 * @author moubin.mo
 * @date: 2020/7/7 09:11
 */

public enum ContentTypeEnum {
	PNG(".png", "image/png"),
	DOC(".doc", "application/msword"),
	GIF(".gif", "image/gif"),
	JPEG(".jpeg", "image/jpeg"),
	JPG(".jpg", "image/jpeg"),
	PDF(".pdf", "application/pdf"),
	PPTX(".pptx", "application/x-ppt"),
	TXT(".txt","text/plain"),
	XLS(".xls", "application/x-xls"),
	XLSX(".xlsx", "application/x-xls"),
	ZIP(".zip", "application/zip"),
	;
	private String code;
	private String contentType;

	ContentTypeEnum(String code, String contentType) {
		this.code = code;
		this.contentType = contentType;
	}

	public String getCode() {
		return code;
	}

	public String getContentType() {
		return contentType;
	}

	public static ContentTypeEnum fromCode(String fileExt) {
		ContentTypeEnum[] values = ContentTypeEnum.values();
		for(ContentTypeEnum value : values) {
			if(value.code.equals(fileExt)) {
				return value;
			}
		}
		return PNG;
	}
}
