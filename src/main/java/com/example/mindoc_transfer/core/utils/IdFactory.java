package com.example.mindoc_transfer.core.utils;

import com.example.mindoc_transfer.core.constants.TableName;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author moubin.mo
 * @date: 2020/7/5 23:04
 */

public class IdFactory {

	@Value("${helpcenter.folder.id.base}")
	private String folderId;
	@Value("${helpcenter.file.id.base}")
	private String fileId;
	@Value("${helpcenter.attachment.id.base}")
	private String attachmentId;
	private static Long folderIdIndex = 3510L;
	private static Long fileIdIndex = 3510L;
	private static Long attachmentIdIndex = 0L;

	public String getFolderId() {
		return folderId;
	}

	public String getFileId() {
		return fileId;
	}

	public String getAttachmentId() {
		return attachmentId;
	}

	public static ConcurrentHashMap<String, Long> getIdMap() {
		return idMap;
	}

	private final static ConcurrentHashMap<String, Long> idMap = new ConcurrentHashMap(){{
		put(TableName.FOLDER.getName(), folderIdIndex);
		put(TableName.FILE.getName(), fileIdIndex);
		put(TableName.ATTACHMENT.getName(), attachmentIdIndex);
	}};

	public final static Long getNextId(String tableName){
		if (!ObjectUtils.isEmpty(TableName.fromCode(tableName))){
			Long id = idMap.get(tableName);
			idMap.put(tableName, id+1);
			return id;
		}
		return 0L;
	}

}
