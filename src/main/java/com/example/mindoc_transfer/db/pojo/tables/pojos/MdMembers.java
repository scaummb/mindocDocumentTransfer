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
public class MdMembers implements Serializable {

    private static final long serialVersionUID = 1690297780;

    private Integer   memberId;
    private String    account;
    private String    password;
    private String    authMethod;
    private String    description;
    private String    email;
    private String    phone;
    private String    avatar;
    private Integer   role;
    private Integer   status;
    private Timestamp createTime;
    private Integer   createAt;
    private Timestamp lastLoginTime;

    public MdMembers() {}

    public MdMembers(MdMembers value) {
        this.memberId = value.memberId;
        this.account = value.account;
        this.password = value.password;
        this.authMethod = value.authMethod;
        this.description = value.description;
        this.email = value.email;
        this.phone = value.phone;
        this.avatar = value.avatar;
        this.role = value.role;
        this.status = value.status;
        this.createTime = value.createTime;
        this.createAt = value.createAt;
        this.lastLoginTime = value.lastLoginTime;
    }

    public MdMembers(
        Integer   memberId,
        String    account,
        String    password,
        String    authMethod,
        String    description,
        String    email,
        String    phone,
        String    avatar,
        Integer   role,
        Integer   status,
        Timestamp createTime,
        Integer   createAt,
        Timestamp lastLoginTime
    ) {
        this.memberId = memberId;
        this.account = account;
        this.password = password;
        this.authMethod = authMethod;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.avatar = avatar;
        this.role = role;
        this.status = status;
        this.createTime = createTime;
        this.createAt = createAt;
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthMethod() {
        return this.authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Timestamp getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MdMembers (");

        sb.append(memberId);
        sb.append(", ").append(account);
        sb.append(", ").append(password);
        sb.append(", ").append(authMethod);
        sb.append(", ").append(description);
        sb.append(", ").append(email);
        sb.append(", ").append(phone);
        sb.append(", ").append(avatar);
        sb.append(", ").append(role);
        sb.append(", ").append(status);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createAt);
        sb.append(", ").append(lastLoginTime);

        sb.append(")");
        return sb.toString();
    }
}
