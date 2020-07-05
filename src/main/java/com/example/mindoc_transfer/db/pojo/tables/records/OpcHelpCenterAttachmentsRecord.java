/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.records;


import com.example.mindoc_transfer.db.pojo.tables.OpcHelpCenterAttachments;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpcHelpCenterAttachmentsRecord extends UpdatableRecordImpl<OpcHelpCenterAttachmentsRecord> implements Record11<Integer, Long, Integer, String, String, String, Double, String, String, Timestamp, Integer> {

    private static final long serialVersionUID = 302183534;

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.id</code>. id of attachment
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.id</code>. id of attachment
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.folder_structure_id</code>. 目录结构叶子节点id，id of the opc_help_center_folders_structures
     */
    public void setFolderStructureId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.folder_structure_id</code>. 目录结构叶子节点id，id of the opc_help_center_folders_structures
     */
    public Long getFolderStructureId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.file_structure_id</code>. 章节节点id，id of the opc_help_center_files_structures
     */
    public void setFileStructureId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.file_structure_id</code>. 章节节点id，id of the opc_help_center_files_structures
     */
    public Integer getFileStructureId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.file_url</code>. cententServer文本下载路径
     */
    public void setFileUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.file_url</code>. cententServer文本下载路径
     */
    public String getFileUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.file_name</code>.
     */
    public void setFileName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.file_name</code>.
     */
    public String getFileName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.file_path</code>.
     */
    public void setFilePath(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.file_path</code>.
     */
    public String getFilePath() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.file_size</code>.
     */
    public void setFileSize(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.file_size</code>.
     */
    public Double getFileSize() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.http_path</code>.
     */
    public void setHttpPath(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.http_path</code>.
     */
    public String getHttpPath() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.file_ext</code>.
     */
    public void setFileExt(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.file_ext</code>.
     */
    public String getFileExt() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mindoc_db.opc_help_center_attachments.create_at</code>.
     */
    public void setCreateAt(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>mindoc_db.opc_help_center_attachments.create_at</code>.
     */
    public Integer getCreateAt() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Long, Integer, String, String, String, Double, String, String, Timestamp, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Long, Integer, String, String, String, Double, String, String, Timestamp, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.FOLDER_STRUCTURE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.FILE_STRUCTURE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.FILE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.FILE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.FILE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.HTTP_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.FILE_EXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getFolderStructureId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFileStructureId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFileUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFilePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getHttpPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFileExt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value2(Long value) {
        setFolderStructureId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value3(Integer value) {
        setFileStructureId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value4(String value) {
        setFileUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value5(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value6(String value) {
        setFilePath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value7(Double value) {
        setFileSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value8(String value) {
        setHttpPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value9(String value) {
        setFileExt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord value11(Integer value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OpcHelpCenterAttachmentsRecord values(Integer value1, Long value2, Integer value3, String value4, String value5, String value6, Double value7, String value8, String value9, Timestamp value10, Integer value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    @Override
    public Integer component1() {
        return null;
    }

    @Override
    public Long component2() {
        return null;
    }

    @Override
    public Integer component3() {
        return null;
    }

    @Override
    public String component4() {
        return null;
    }

    @Override
    public String component5() {
        return null;
    }

    @Override
    public String component6() {
        return null;
    }

    @Override
    public Double component7() {
        return null;
    }

    @Override
    public String component8() {
        return null;
    }

    @Override
    public String component9() {
        return null;
    }

    @Override
    public Timestamp component10() {
        return null;
    }

    @Override
    public Integer component11() {
        return null;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OpcHelpCenterAttachmentsRecord
     */
    public OpcHelpCenterAttachmentsRecord() {
        super(OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS);
    }

    /**
     * Create a detached, initialised OpcHelpCenterAttachmentsRecord
     */
    public OpcHelpCenterAttachmentsRecord(Integer id, Long folderStructureId, Integer fileStructureId, String fileUrl, String fileName, String filePath, Double fileSize, String httpPath, String fileExt, Timestamp createTime, Integer createAt) {
        super(OpcHelpCenterAttachments.OPC_HELP_CENTER_ATTACHMENTS);

        set(0, id);
        set(1, folderStructureId);
        set(2, fileStructureId);
        set(3, fileUrl);
        set(4, fileName);
        set(5, filePath);
        set(6, fileSize);
        set(7, httpPath);
        set(8, fileExt);
        set(9, createTime);
        set(10, createAt);
    }
}