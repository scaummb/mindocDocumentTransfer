/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.records;


import com.example.mindoc_transfer.db.pojo.tables.MdDocuments;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class MdDocumentsRecord extends UpdatableRecordImpl<MdDocumentsRecord> implements Record14<Integer, String, String, Integer, Integer, Integer, String, String, String, Timestamp, Integer, Timestamp, Integer, Long> {

    private static final long serialVersionUID = -1310762241;

    /**
     * Setter for <code>mindoc_db.md_documents.document_id</code>.
     */
    public void setDocumentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.document_id</code>.
     */
    public Integer getDocumentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.document_name</code>.
     */
    public void setDocumentName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.document_name</code>.
     */
    public String getDocumentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.identify</code>.
     */
    public void setIdentify(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.identify</code>.
     */
    public String getIdentify() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.book_id</code>.
     */
    public void setBookId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.book_id</code>.
     */
    public Integer getBookId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.order_sort</code>.
     */
    public void setOrderSort(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.order_sort</code>.
     */
    public Integer getOrderSort() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.markdown</code>.
     */
    public void setMarkdown(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.markdown</code>.
     */
    public String getMarkdown() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.release</code>.
     */
    public void setRelease(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.release</code>.
     */
    public String getRelease() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.content</code>.
     */
    public void setContent(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.content</code>.
     */
    public String getContent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.create_time</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.member_id</code>.
     */
    public void setMemberId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.member_id</code>.
     */
    public Integer getMemberId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.modify_time</code>.
     */
    public void setModifyTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.modify_time</code>.
     */
    public Timestamp getModifyTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.modify_at</code>.
     */
    public void setModifyAt(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.modify_at</code>.
     */
    public Integer getModifyAt() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>mindoc_db.md_documents.version</code>.
     */
    public void setVersion(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>mindoc_db.md_documents.version</code>.
     */
    public Long getVersion() {
        return (Long) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, Integer, Integer, Integer, String, String, String, Timestamp, Integer, Timestamp, Integer, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, Integer, Integer, Integer, String, String, String, Timestamp, Integer, Timestamp, Integer, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MdDocuments.MD_DOCUMENTS.DOCUMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MdDocuments.MD_DOCUMENTS.DOCUMENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MdDocuments.MD_DOCUMENTS.IDENTIFY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return MdDocuments.MD_DOCUMENTS.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MdDocuments.MD_DOCUMENTS.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MdDocuments.MD_DOCUMENTS.ORDER_SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MdDocuments.MD_DOCUMENTS.MARKDOWN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MdDocuments.MD_DOCUMENTS.RELEASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MdDocuments.MD_DOCUMENTS.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return MdDocuments.MD_DOCUMENTS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return MdDocuments.MD_DOCUMENTS.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return MdDocuments.MD_DOCUMENTS.MODIFY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return MdDocuments.MD_DOCUMENTS.MODIFY_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return MdDocuments.MD_DOCUMENTS.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDocumentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDocumentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIdentify();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getOrderSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMarkdown();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRelease();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getContent();
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
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getModifyTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getModifyAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value1(Integer value) {
        setDocumentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value2(String value) {
        setDocumentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value3(String value) {
        setIdentify(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value4(Integer value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value5(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value6(Integer value) {
        setOrderSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value7(String value) {
        setMarkdown(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value8(String value) {
        setRelease(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value9(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value11(Integer value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value12(Timestamp value) {
        setModifyTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value13(Integer value) {
        setModifyAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord value14(Long value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdDocumentsRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6, String value7, String value8, String value9, Timestamp value10, Integer value11, Timestamp value12, Integer value13, Long value14) {
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
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    @Override
    public Integer component1() {
        return null;
    }

    @Override
    public String component2() {
        return null;
    }

    @Override
    public String component3() {
        return null;
    }

    @Override
    public Integer component4() {
        return null;
    }

    @Override
    public Integer component5() {
        return null;
    }

    @Override
    public Integer component6() {
        return null;
    }

    @Override
    public String component7() {
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

    @Override
    public Timestamp component12() {
        return null;
    }

    @Override
    public Integer component13() {
        return null;
    }

    @Override
    public Long component14() {
        return null;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MdDocumentsRecord
     */
    public MdDocumentsRecord() {
        super(MdDocuments.MD_DOCUMENTS);
    }

    /**
     * Create a detached, initialised MdDocumentsRecord
     */
    public MdDocumentsRecord(Integer documentId, String documentName, String identify, Integer bookId, Integer parentId, Integer orderSort, String markdown, String release, String content, Timestamp createTime, Integer memberId, Timestamp modifyTime, Integer modifyAt, Long version) {
        super(MdDocuments.MD_DOCUMENTS);

        set(0, documentId);
        set(1, documentName);
        set(2, identify);
        set(3, bookId);
        set(4, parentId);
        set(5, orderSort);
        set(6, markdown);
        set(7, release);
        set(8, content);
        set(9, createTime);
        set(10, memberId);
        set(11, modifyTime);
        set(12, modifyAt);
        set(13, version);
    }
}
