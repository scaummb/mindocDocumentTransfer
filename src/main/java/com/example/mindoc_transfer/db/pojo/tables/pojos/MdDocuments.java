/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class MdDocuments implements Serializable {

    private static final long serialVersionUID = -2049615361;

    private Integer   documentId;
    private String    documentName;
    private String    identify;
    private Integer   bookId;
    private Integer   parentId;
    private Integer   orderSort;
    private String    markdown;
    private String    release;
    private String    content;
    private Timestamp createTime;
    private Integer   memberId;
    private Timestamp modifyTime;
    private Integer   modifyAt;
    private Long      version;

    public MdDocuments() {}

    public MdDocuments(MdDocuments value) {
        this.documentId = value.documentId;
        this.documentName = value.documentName;
        this.identify = value.identify;
        this.bookId = value.bookId;
        this.parentId = value.parentId;
        this.orderSort = value.orderSort;
        this.markdown = value.markdown;
        this.release = value.release;
        this.content = value.content;
        this.createTime = value.createTime;
        this.memberId = value.memberId;
        this.modifyTime = value.modifyTime;
        this.modifyAt = value.modifyAt;
        this.version = value.version;
    }

    public MdDocuments(
        Integer   documentId,
        String    documentName,
        String    identify,
        Integer   bookId,
        Integer   parentId,
        Integer   orderSort,
        String    markdown,
        String    release,
        String    content,
        Timestamp createTime,
        Integer   memberId,
        Timestamp modifyTime,
        Integer   modifyAt,
        Long      version
    ) {
        this.documentId = documentId;
        this.documentName = documentName;
        this.identify = identify;
        this.bookId = bookId;
        this.parentId = parentId;
        this.orderSort = orderSort;
        this.markdown = markdown;
        this.release = release;
        this.content = content;
        this.createTime = createTime;
        this.memberId = memberId;
        this.modifyTime = modifyTime;
        this.modifyAt = modifyAt;
        this.version = version;
    }

    public Integer getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return this.documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getIdentify() {
        return this.identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderSort() {
        return this.orderSort;
    }

    public void setOrderSort(Integer orderSort) {
        this.orderSort = orderSort;
    }

    public String getMarkdown() {
        return this.markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public String getRelease() {
        return this.release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Timestamp getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifyAt() {
        return this.modifyAt;
    }

    public void setModifyAt(Integer modifyAt) {
        this.modifyAt = modifyAt;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MdDocuments (");

        sb.append(documentId);
        sb.append(", ").append(documentName);
        sb.append(", ").append(identify);
        sb.append(", ").append(bookId);
        sb.append(", ").append(parentId);
        sb.append(", ").append(orderSort);
        sb.append(", ").append(markdown);
        sb.append(", ").append(release);
        sb.append(", ").append(content);
        sb.append(", ").append(createTime);
        sb.append(", ").append(memberId);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(modifyAt);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
