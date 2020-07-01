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
public class MdLogs implements Serializable {

    private static final long serialVersionUID = 467796998;

    private Long      logId;
    private Integer   memberId;
    private String    category;
    private String    content;
    private String    originalData;
    private String    presentData;
    private Timestamp createTime;
    private String    userAgent;
    private String    ipAddress;

    public MdLogs() {}

    public MdLogs(MdLogs value) {
        this.logId = value.logId;
        this.memberId = value.memberId;
        this.category = value.category;
        this.content = value.content;
        this.originalData = value.originalData;
        this.presentData = value.presentData;
        this.createTime = value.createTime;
        this.userAgent = value.userAgent;
        this.ipAddress = value.ipAddress;
    }

    public MdLogs(
        Long      logId,
        Integer   memberId,
        String    category,
        String    content,
        String    originalData,
        String    presentData,
        Timestamp createTime,
        String    userAgent,
        String    ipAddress
    ) {
        this.logId = logId;
        this.memberId = memberId;
        this.category = category;
        this.content = content;
        this.originalData = originalData;
        this.presentData = presentData;
        this.createTime = createTime;
        this.userAgent = userAgent;
        this.ipAddress = ipAddress;
    }

    public Long getLogId() {
        return this.logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Integer getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOriginalData() {
        return this.originalData;
    }

    public void setOriginalData(String originalData) {
        this.originalData = originalData;
    }

    public String getPresentData() {
        return this.presentData;
    }

    public void setPresentData(String presentData) {
        this.presentData = presentData;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MdLogs (");

        sb.append(logId);
        sb.append(", ").append(memberId);
        sb.append(", ").append(category);
        sb.append(", ").append(content);
        sb.append(", ").append(originalData);
        sb.append(", ").append(presentData);
        sb.append(", ").append(createTime);
        sb.append(", ").append(userAgent);
        sb.append(", ").append(ipAddress);

        sb.append(")");
        return sb.toString();
    }
}
