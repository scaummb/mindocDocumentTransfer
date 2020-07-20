package com.example.mindoc_transfer.core.constants;

import com.example.mindoc_transfer.db.pojo.Tables;
import com.example.mindoc_transfer.db.pojo.tables.*;

/**
 * <ul>
 * <li>PICTURE_FILTER_REGEX: 图片过滤正则</li>
 * </ul>
 */
public class TransferConstants {
	public static final String PICTURE_FILTER_REGEX = "\\!\\[\\]\\(.*\\)";

	// mindoc tables
	public static final MdBooks MD_BOOKS = Tables.MD_BOOKS;
	public static final MdDocuments MD_DOCUMENTS = Tables.MD_DOCUMENTS;
	public static final MdAttachment MD_ATTACHMENT = Tables.MD_ATTACHMENT;
	// opc tables
	public static final OpcHelpCenterAttachments OPC_HELP_CENTER_ATTACHMENTS = Tables.OPC_HELP_CENTER_ATTACHMENTS;
	public static final OpcHelpCenterFoldersStructures OPC_HELP_CENTER_FOLDERS_STRUCTURES = Tables.OPC_HELP_CENTER_FOLDERS_STRUCTURES;
	public static final OpcHelpCenterFilesStructures OPC_HELP_CENTER_FILES_STRUCTURES = Tables.OPC_HELP_CENTER_FILES_STRUCTURES;

	// params
	/** 默认文档分类ID **/
	public final static Long DEFAULT_CATEGORY_ID = 0l;
	/** 默认路径 **/
	public final static String DEFAULT_HELP_CENTER_DOCUMENT_PATH = "0";
	/** 默认文档父节点ID **/
	public final static Integer DEFAULT_PARENT_ID = 0;
	/** 默认域空间ID **/
	public final static Integer DEFAULT_NAMESPACE_ID = 0;

	public final static String IDENTIFY = "12000001802";
	public final static String PASSWORD = "6ca13d52ca70c883e0f0bb101e425a89e8624de51db2d2392593af6a84118090";
	public final static String REGION = "86";
	// 登陆地址
	public final static String LOGON_URL = "http://gonggdev2.zuolin.com/evh/user/logon";
	// 文件服务器地址
	public final static String UPLOAD_FILE_URL = "http://beta-cs.zuolin.com/upload/file";
	// 文件服务器地址
	public final static String UPLOAD_PICTURE_URL = "http://beta-cs.zuolin.com/upload/image";

	/** 默认仓库文件后缀名 **/
	public final static String DEFAULT_FILE_SUFFIX = ".txt";
	public final static String DEFAULT_DOCUMENT_GOGS_NAME = "HelpCenterDocuments";
	public final static String DEFAULT_DOCUMENT_GOGS_MODULE_TYPE = "HelpCenterModuleType";
	public final static String DEFAULT_DOCUMENT_GOGS_OWNER_TYPE = "HelpCenterOwnerType";
	public final static Long DEFAULT_DOCUMENT_GOGS_OWNER_ID = 0L;
	/** 默认模块id **/
	public final static Long DEFAULT_MODULE_ID = 0L;
	public static final Integer SORT_NUM = 1;
	public static final Integer DEFAULT_LEVEL = 1;
	// 迁移数据绝对路径
	public static final String DEFAULT_TRANSFER_ATTACHMENT_PATH = "/data1/mindoc/";
	public static final String TEST_TRANSFER_ATTACHMENT_PATH = "/data1/mindoc/";
	/** 默认文档内容 **/
	public final static String DEFAULT_DOCUMENT_DEFAULT_CONTENT = "   ";
	public static final String DEFAULT_PARENT_PATH = "0/";
}
