/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.daos;


import com.example.mindoc_transfer.db.pojo.tables.OpcHelpCenterFoldersStructures;
import com.example.mindoc_transfer.db.pojo.tables.records.OpcHelpCenterFoldersStructuresRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class OpcHelpCenterFoldersStructuresDao extends DAOImpl<OpcHelpCenterFoldersStructuresRecord, com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures, Long> {

    /**
     * Create a new OpcHelpCenterFoldersStructuresDao without any configuration
     */
    public OpcHelpCenterFoldersStructuresDao() {
        super(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES, com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures.class);
    }

    /**
     * Create a new OpcHelpCenterFoldersStructuresDao with an attached configuration
     */
    public OpcHelpCenterFoldersStructuresDao(Configuration configuration) {
        super(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES, com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchById(Long... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures fetchOneById(Long value) {
        return fetchOne(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.ID, value);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByParentId(Long... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>file_name IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByFileName(String... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.FILE_NAME, values);
    }

    /**
     * Fetch records that have <code>level IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByLevel(Integer... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.LEVEL, values);
    }

    /**
     * Fetch records that have <code>path IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByPath(String... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.PATH, values);
    }

    /**
     * Fetch records that have <code>file_type IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByFileType(Byte... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.FILE_TYPE, values);
    }

    /**
     * Fetch records that have <code>sort_num IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchBySortNum(Integer... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.SORT_NUM, values);
    }

    /**
     * Fetch records that have <code>fixed_flag IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByFixedFlag(Byte... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.FIXED_FLAG, values);
    }

    /**
     * Fetch records that have <code>identify IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByIdentify(String... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.IDENTIFY, values);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByCategoryId(Long... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>namespace_id IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByNamespaceId(Integer... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.NAMESPACE_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByStatus(Byte... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.STATUS, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByCreateTime(Timestamp... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>creator_uid IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByCreatorUid(Long... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.CREATOR_UID, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByUpdateTime(Timestamp... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>updator_uid IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.OpcHelpCenterFoldersStructures> fetchByUpdatorUid(Long... values) {
        return fetch(OpcHelpCenterFoldersStructures.OPC_HELP_CENTER_FOLDERS_STRUCTURES.UPDATOR_UID, values);
    }
}
