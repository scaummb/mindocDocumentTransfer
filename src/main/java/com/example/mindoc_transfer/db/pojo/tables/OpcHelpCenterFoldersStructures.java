/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables;


import com.example.mindoc_transfer.db.pojo.Keys;
import com.example.mindoc_transfer.db.pojo.MindocDb;
import com.example.mindoc_transfer.db.pojo.tables.records.OpcHelpCenterFoldersStructuresRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * 帮助中心：帮助中心目录结构表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpcHelpCenterFoldersStructures extends TableImpl<OpcHelpCenterFoldersStructuresRecord> {

    private static final long serialVersionUID = 1173400163;

    /**
     * The reference instance of <code>mindoc_db.opc_help_center_folders_structures</code>
     */
    public static final OpcHelpCenterFoldersStructures OPC_HELP_CENTER_FOLDERS_STRUCTURES = new OpcHelpCenterFoldersStructures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OpcHelpCenterFoldersStructuresRecord> getRecordType() {
        return OpcHelpCenterFoldersStructuresRecord.class;
    }

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.id</code>. id of the record
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "id of the record");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.parent_id</code>. 上层目录id
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Long> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "上层目录id");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.file_name</code>. 文件或目录名称
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "文件或目录名称");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.level</code>. 目录节点所在层级深度
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "目录节点所在层级深度");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.path</code>. 目录路径，最大深度不限制
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, String> PATH = createField("path", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "目录路径，最大深度不限制");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.file_type</code>. 1：DIRECTORY-文件夹节点,2：FILE-文件节点
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Byte> FILE_TYPE = createField("file_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1：DIRECTORY-文件夹节点,2：FILE-文件节点");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.sort_num</code>. 排序id
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Integer> SORT_NUM = createField("sort_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "排序id");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.fixed_flag</code>. 固定分类标志，0-非固定分类：开放重命名和删除操作，1-固定分类：禁用重命名和删除操作
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Byte> FIXED_FLAG = createField("fixed_flag", org.jooq.impl.SQLDataType.TINYINT, this, "固定分类标志，0-非固定分类：开放重命名和删除操作，1-固定分类：禁用重命名和删除操作");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.identify</code>. 文档标识，file_type=2的节点属性
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, String> IDENTIFY = createField("identify", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "文档标识，file_type=2的节点属性");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.category_id</code>. 文档分类, id of the eh_help_center_document_categories，file_type=2的节点属性
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Long> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "文档分类, id of the eh_help_center_document_categories，file_type=2的节点属性");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.namespace_id</code>.
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Integer> NAMESPACE_ID = createField("namespace_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.status</code>. 状态，0-无效，1-正常
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT, this, "状态，0-无效，1-正常");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.create_time</code>.
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.creator_uid</code>.
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Long> CREATOR_UID = createField("creator_uid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.update_time</code>.
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mindoc_db.opc_help_center_folders_structures.updator_uid</code>.
     */
    public final TableField<OpcHelpCenterFoldersStructuresRecord, Long> UPDATOR_UID = createField("updator_uid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>mindoc_db.opc_help_center_folders_structures</code> table reference
     */
    public OpcHelpCenterFoldersStructures() {
        this("opc_help_center_folders_structures", null);
    }

    /**
     * Create an aliased <code>mindoc_db.opc_help_center_folders_structures</code> table reference
     */
    public OpcHelpCenterFoldersStructures(String alias) {
        this(alias, OPC_HELP_CENTER_FOLDERS_STRUCTURES);
    }

    private OpcHelpCenterFoldersStructures(String alias, Table<OpcHelpCenterFoldersStructuresRecord> aliased) {
        this(alias, aliased, null);
    }

    private OpcHelpCenterFoldersStructures(String alias, Table<OpcHelpCenterFoldersStructuresRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "帮助中心：帮助中心目录结构表");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MindocDb.MINDOC_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OpcHelpCenterFoldersStructuresRecord> getPrimaryKey() {
        return Keys.KEY_OPC_HELP_CENTER_FOLDERS_STRUCTURES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OpcHelpCenterFoldersStructuresRecord>> getKeys() {
        return Arrays.<UniqueKey<OpcHelpCenterFoldersStructuresRecord>>asList(Keys.KEY_OPC_HELP_CENTER_FOLDERS_STRUCTURES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterFoldersStructures as(String alias) {
        return new OpcHelpCenterFoldersStructures(alias, this);
    }

    /**
     * Rename this table
     */
    public OpcHelpCenterFoldersStructures rename(String name) {
        return new OpcHelpCenterFoldersStructures(name, null);
    }
}
