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
public class MdBooks implements Serializable {

    private static final long serialVersionUID = -615525816;

    private Integer   bookId;
    private String    bookName;
    private String    identify;
    private Integer   orderIndex;
    private String    description;
    private String    label;
    private Integer   privatelyOwned;
    private String    privateToken;
    private Integer   status;
    private String    editor;
    private Integer   docCount;
    private String    commentStatus;
    private Integer   commentCount;
    private String    cover;
    private String    theme;
    private Timestamp createTime;
    private Integer   memberId;
    private Timestamp modifyTime;
    private Long      version;

    public MdBooks() {}

    public MdBooks(MdBooks value) {
        this.bookId = value.bookId;
        this.bookName = value.bookName;
        this.identify = value.identify;
        this.orderIndex = value.orderIndex;
        this.description = value.description;
        this.label = value.label;
        this.privatelyOwned = value.privatelyOwned;
        this.privateToken = value.privateToken;
        this.status = value.status;
        this.editor = value.editor;
        this.docCount = value.docCount;
        this.commentStatus = value.commentStatus;
        this.commentCount = value.commentCount;
        this.cover = value.cover;
        this.theme = value.theme;
        this.createTime = value.createTime;
        this.memberId = value.memberId;
        this.modifyTime = value.modifyTime;
        this.version = value.version;
    }

    public MdBooks(
        Integer   bookId,
        String    bookName,
        String    identify,
        Integer   orderIndex,
        String    description,
        String    label,
        Integer   privatelyOwned,
        String    privateToken,
        Integer   status,
        String    editor,
        Integer   docCount,
        String    commentStatus,
        Integer   commentCount,
        String    cover,
        String    theme,
        Timestamp createTime,
        Integer   memberId,
        Timestamp modifyTime,
        Long      version
    ) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.identify = identify;
        this.orderIndex = orderIndex;
        this.description = description;
        this.label = label;
        this.privatelyOwned = privatelyOwned;
        this.privateToken = privateToken;
        this.status = status;
        this.editor = editor;
        this.docCount = docCount;
        this.commentStatus = commentStatus;
        this.commentCount = commentCount;
        this.cover = cover;
        this.theme = theme;
        this.createTime = createTime;
        this.memberId = memberId;
        this.modifyTime = modifyTime;
        this.version = version;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIdentify() {
        return this.identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Integer getOrderIndex() {
        return this.orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getPrivatelyOwned() {
        return this.privatelyOwned;
    }

    public void setPrivatelyOwned(Integer privatelyOwned) {
        this.privatelyOwned = privatelyOwned;
    }

    public String getPrivateToken() {
        return this.privateToken;
    }

    public void setPrivateToken(String privateToken) {
        this.privateToken = privateToken;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getDocCount() {
        return this.docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public String getCommentStatus() {
        return this.commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
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

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MdBooks (");

        sb.append(bookId);
        sb.append(", ").append(bookName);
        sb.append(", ").append(identify);
        sb.append(", ").append(orderIndex);
        sb.append(", ").append(description);
        sb.append(", ").append(label);
        sb.append(", ").append(privatelyOwned);
        sb.append(", ").append(privateToken);
        sb.append(", ").append(status);
        sb.append(", ").append(editor);
        sb.append(", ").append(docCount);
        sb.append(", ").append(commentStatus);
        sb.append(", ").append(commentCount);
        sb.append(", ").append(cover);
        sb.append(", ").append(theme);
        sb.append(", ").append(createTime);
        sb.append(", ").append(memberId);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}