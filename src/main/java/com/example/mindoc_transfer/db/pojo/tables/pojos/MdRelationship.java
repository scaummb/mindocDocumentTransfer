/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.pojos;


import java.io.Serializable;

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
public class MdRelationship implements Serializable {

    private static final long serialVersionUID = -606011776;

    private Integer relationshipId;
    private Integer memberId;
    private Integer bookId;
    private Integer roleId;

    public MdRelationship() {}

    public MdRelationship(MdRelationship value) {
        this.relationshipId = value.relationshipId;
        this.memberId = value.memberId;
        this.bookId = value.bookId;
        this.roleId = value.roleId;
    }

    public MdRelationship(
        Integer relationshipId,
        Integer memberId,
        Integer bookId,
        Integer roleId
    ) {
        this.relationshipId = relationshipId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.roleId = roleId;
    }

    public Integer getRelationshipId() {
        return this.relationshipId;
    }

    public void setRelationshipId(Integer relationshipId) {
        this.relationshipId = relationshipId;
    }

    public Integer getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MdRelationship (");

        sb.append(relationshipId);
        sb.append(", ").append(memberId);
        sb.append(", ").append(bookId);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}