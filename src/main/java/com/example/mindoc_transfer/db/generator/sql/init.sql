CREATE TABLE `md_attachment` (
  `attachment_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_id` int(11) NOT NULL DEFAULT '0',
  `document_id` int(11) DEFAULT NULL,
  `file_name` varchar(255) NOT NULL DEFAULT '',
  `file_path` varchar(2000) NOT NULL DEFAULT '',
  `file_size` double NOT NULL DEFAULT '0',
  `http_path` varchar(2000) NOT NULL DEFAULT '',
  `file_ext` varchar(50) NOT NULL DEFAULT '',
  `create_time` datetime NOT NULL,
  `create_at` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`attachment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `md_books` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(500) NOT NULL DEFAULT '',
  `identify` varchar(100) NOT NULL DEFAULT '',
  `order_index` int(11) NOT NULL DEFAULT '0',
  `description` varchar(2000) NOT NULL DEFAULT '',
  `label` varchar(500) NOT NULL DEFAULT '',
  `privately_owned` int(11) NOT NULL DEFAULT '0',
  `private_token` varchar(500) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  `editor` varchar(50) NOT NULL DEFAULT '',
  `doc_count` int(11) NOT NULL DEFAULT '0',
  `comment_status` varchar(20) NOT NULL DEFAULT 'open',
  `comment_count` int(11) NOT NULL DEFAULT '0',
  `cover` varchar(1000) NOT NULL DEFAULT '',
  `theme` varchar(255) NOT NULL DEFAULT 'default',
  `create_time` datetime NOT NULL,
  `member_id` int(11) NOT NULL DEFAULT '0',
  `modify_time` datetime DEFAULT NULL,
  `version` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `identify` (`identify`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `md_documents` (
  `document_id` int(11) NOT NULL AUTO_INCREMENT,
  `document_name` varchar(500) NOT NULL DEFAULT '',
  `identify` varchar(100) DEFAULT 'null',
  `book_id` int(11) NOT NULL DEFAULT '0',
  `parent_id` int(11) NOT NULL DEFAULT '0',
  `order_sort` int(11) NOT NULL DEFAULT '0',
  `markdown` longtext,
  `release` longtext,
  `content` longtext,
  `create_time` datetime NOT NULL,
  `member_id` int(11) NOT NULL DEFAULT '0',
  `modify_time` datetime NOT NULL,
  `modify_at` int(11) NOT NULL DEFAULT '0',
  `version` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`document_id`),
  KEY `md_documents_identify` (`identify`),
  KEY `md_documents_book_id` (`book_id`),
  KEY `md_documents_parent_id` (`parent_id`),
  KEY `md_documents_order_sort` (`order_sort`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `opc_help_center_files_structures` (
  `id` bigint(20) NOT NULL COMMENT 'id of the record',
  `folder_structure_id` bigint(20) NOT NULL COMMENT '目录结构叶子节点id，id of the eh_help_center_folders_structures',
  `parent_id` bigint(20) NOT NULL COMMENT '上层目录id',
  `level` int(11) NOT NULL DEFAULT '0' COMMENT '目录节点所在层级深度',
  `path` varchar(128) NOT NULL COMMENT '目录路径，最大深度不限制',
  `file_name` varchar(128) NOT NULL COMMENT '文档标题',
  `sort_num` int(11) NOT NULL DEFAULT '0' COMMENT '排列序号',
  `publish_type` tinyint(4) DEFAULT '0' COMMENT '文档发布状态，0-未发布，1-已发布',
  `publish_version_identify` text COMMENT '文档发布版本标识，无输入限制',
  `publish_version_number` varchar(128) DEFAULT NULL COMMENT '文档发布版本编号，系统根据发布时间自动生成,格式：日期时分秒',
  `draft_flag` tinyint(4) DEFAULT '0' COMMENT '文档草稿标志，0-非草稿，1-草稿',
  `last_commit` varchar(64) DEFAULT NULL COMMENT '仓库提交commit-id',
  `namespace_id` int(11) NOT NULL DEFAULT '0',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态，0-无效，1-正常',
  `create_time` datetime DEFAULT NULL,
  `creator_uid` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updator_uid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `i_eh_file_structureid` (`folder_structure_id`),
  KEY `i_eh_file_structureid_parentid` (`folder_structure_id`,`parent_id`),
  KEY `i_eh_file_structureid_parentid_drafytype` (`folder_structure_id`,`parent_id`,`draft_flag`),
  KEY `i_eh_file_structureid_parentid_drafytype_publishtype` (`folder_structure_id`,`parent_id`,`draft_flag`,`publish_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='帮助中心：文档数据表';

CREATE TABLE `opc_help_center_folders_structures` (
  `id` bigint(20) NOT NULL COMMENT 'id of the record',
  `parent_id` bigint(20) NOT NULL COMMENT '上层目录id',
  `file_name` varchar(128) NOT NULL COMMENT '文件或目录名称',
  `level` int(11) NOT NULL DEFAULT '0' COMMENT '目录节点所在层级深度',
  `path` varchar(128) NOT NULL COMMENT '目录路径，最大深度不限制',
  `file_type` tinyint(4) DEFAULT '1' COMMENT '1：DIRECTORY-文件夹节点,2：FILE-文件节点',
  `sort_num` int(11) NOT NULL DEFAULT '0' COMMENT '排序id',
  `fixed_flag` tinyint(4) DEFAULT NULL COMMENT '固定分类标志，0-非固定分类：开放重命名和删除操作，1-固定分类：禁用重命名和删除操作',
  `identify` varchar(128) DEFAULT NULL COMMENT '文档标识，file_type=2的节点属性',
  `category_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '文档分类, id of the eh_help_center_document_categories，file_type=2的节点属性',
  `namespace_id` int(11) NOT NULL DEFAULT '0',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态，0-无效，1-正常',
  `create_time` datetime DEFAULT NULL,
  `creator_uid` bigint(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `updator_uid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `i_eh_folder_identify` (`identify`),
  KEY `i_eh_folder_parentid_identify` (`parent_id`,`identify`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='帮助中心：帮助中心目录结构表';


-- 新增附件表
CREATE TABLE `opc_help_center_attachments` (
  `id` int(11) NOT NULL COMMENT 'id of attachment',
  `folder_structure_id` bigint(20) NOT NULL COMMENT '目录结构叶子节点id，id of the opc_help_center_folders_structures',
  `file_structure_id` int(11) DEFAULT NULL COMMENT '章节节点id，id of the opc_help_center_files_structures',
  `file_url` varchar(2000) NOT NULL DEFAULT '' COMMENT 'cententServer文本下载路径',
  `file_name` varchar(255) NOT NULL DEFAULT '',
  `file_path` varchar(2000) NOT NULL DEFAULT '',
  `file_size` double NOT NULL DEFAULT '0',
  `http_path` varchar(2000) NOT NULL DEFAULT '',
  `file_ext` varchar(50) NOT NULL DEFAULT '',
  `create_time` datetime NOT NULL,
  `create_at` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;