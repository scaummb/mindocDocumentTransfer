/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.records;


import com.example.mindoc_transfer.db.pojo.tables.MdMemberToken;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MdMemberTokenRecord extends UpdatableRecordImpl<MdMemberTokenRecord> implements Record7<Integer, Integer, String, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -476488808;

    /**
     * Setter for <code>mindoc_db.md_member_token.token_id</code>.
     */
    public void setTokenId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>mindoc_db.md_member_token.token_id</code>.
     */
    public Integer getTokenId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>mindoc_db.md_member_token.member_id</code>.
     */
    public void setMemberId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>mindoc_db.md_member_token.member_id</code>.
     */
    public Integer getMemberId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>mindoc_db.md_member_token.token</code>.
     */
    public void setToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mindoc_db.md_member_token.token</code>.
     */
    public String getToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mindoc_db.md_member_token.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mindoc_db.md_member_token.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mindoc_db.md_member_token.is_valid</code>.
     */
    public void setIsValid(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>mindoc_db.md_member_token.is_valid</code>.
     */
    public Byte getIsValid() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>mindoc_db.md_member_token.valid_time</code>.
     */
    public void setValidTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>mindoc_db.md_member_token.valid_time</code>.
     */
    public Timestamp getValidTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>mindoc_db.md_member_token.send_time</code>.
     */
    public void setSendTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>mindoc_db.md_member_token.send_time</code>.
     */
    public Timestamp getSendTime() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MdMemberToken.MD_MEMBER_TOKEN.TOKEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return MdMemberToken.MD_MEMBER_TOKEN.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MdMemberToken.MD_MEMBER_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MdMemberToken.MD_MEMBER_TOKEN.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return MdMemberToken.MD_MEMBER_TOKEN.IS_VALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return MdMemberToken.MD_MEMBER_TOKEN.VALID_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return MdMemberToken.MD_MEMBER_TOKEN.SEND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getValidTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord value1(Integer value) {
        setTokenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord value2(Integer value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord value3(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord value5(Byte value) {
        setIsValid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord value6(Timestamp value) {
        setValidTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord value7(Timestamp value) {
        setSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberTokenRecord values(Integer value1, Integer value2, String value3, String value4, Byte value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MdMemberTokenRecord
     */
    public MdMemberTokenRecord() {
        super(MdMemberToken.MD_MEMBER_TOKEN);
    }

    /**
     * Create a detached, initialised MdMemberTokenRecord
     */
    public MdMemberTokenRecord(Integer tokenId, Integer memberId, String token, String email, Byte isValid, Timestamp validTime, Timestamp sendTime) {
        super(MdMemberToken.MD_MEMBER_TOKEN);

        set(0, tokenId);
        set(1, memberId);
        set(2, token);
        set(3, email);
        set(4, isValid);
        set(5, validTime);
        set(6, sendTime);
    }
}
