/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class OpcHelpCenterFoldersStructures implements Serializable {

    private static final long serialVersionUID = 1580393479;

    private Long      id;
    private Long      parentId;
    private String    fileName;
    private Integer   level;
    private String    path;
    private Byte      fileType;
    private Integer   sortNum;
    private Byte      fixedFlag;
    private String    identify;
    private Long      categoryId;
    private Integer   namespaceId;
    private Byte      status;
    private Timestamp createTime;
    private Long      creatorUid;
    private Timestamp updateTime;
    private Long      updatorUid;

    public OpcHelpCenterFoldersStructures() {}

    public OpcHelpCenterFoldersStructures(OpcHelpCenterFoldersStructures value) {
        this.id = value.id;
        this.parentId = value.parentId;
        this.fileName = value.fileName;
        this.level = value.level;
        this.path = value.path;
        this.fileType = value.fileType;
        this.sortNum = value.sortNum;
        this.fixedFlag = value.fixedFlag;
        this.identify = value.identify;
        this.categoryId = value.categoryId;
        this.namespaceId = value.namespaceId;
        this.status = value.status;
        this.createTime = value.createTime;
        this.creatorUid = value.creatorUid;
        this.updateTime = value.updateTime;
        this.updatorUid = value.updatorUid;
    }

    public OpcHelpCenterFoldersStructures(
        Long      id,
        Long      parentId,
        String    fileName,
        Integer   level,
        String    path,
        Byte      fileType,
        Integer   sortNum,
        Byte      fixedFlag,
        String    identify,
        Long      categoryId,
        Integer   namespaceId,
        Byte      status,
        Timestamp createTime,
        Long      creatorUid,
        Timestamp updateTime,
        Long      updatorUid
    ) {
        this.id = id;
        this.parentId = parentId;
        this.fileName = fileName;
        this.level = level;
        this.path = path;
        this.fileType = fileType;
        this.sortNum = sortNum;
        this.fixedFlag = fixedFlag;
        this.identify = identify;
        this.categoryId = categoryId;
        this.namespaceId = namespaceId;
        this.status = status;
        this.createTime = createTime;
        this.creatorUid = creatorUid;
        this.updateTime = updateTime;
        this.updatorUid = updatorUid;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Byte getFileType() {
        return this.fileType;
    }

    public void setFileType(Byte fileType) {
        this.fileType = fileType;
    }

    public Integer getSortNum() {
        return this.sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Byte getFixedFlag() {
        return this.fixedFlag;
    }

    public void setFixedFlag(Byte fixedFlag) {
        this.fixedFlag = fixedFlag;
    }

    public String getIdentify() {
        return this.identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Long getCreatorUid() {
        return this.creatorUid;
    }

    public void setCreatorUid(Long creatorUid) {
        this.creatorUid = creatorUid;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdatorUid() {
        return this.updatorUid;
    }

    public void setUpdatorUid(Long updatorUid) {
        this.updatorUid = updatorUid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OpcHelpCenterFoldersStructures (");

        sb.append(id);
        sb.append(", ").append(parentId);
        sb.append(", ").append(fileName);
        sb.append(", ").append(level);
        sb.append(", ").append(path);
        sb.append(", ").append(fileType);
        sb.append(", ").append(sortNum);
        sb.append(", ").append(fixedFlag);
        sb.append(", ").append(identify);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(namespaceId);
        sb.append(", ").append(status);
        sb.append(", ").append(createTime);
        sb.append(", ").append(creatorUid);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(updatorUid);

        sb.append(")");
        return sb.toString();
    }
}