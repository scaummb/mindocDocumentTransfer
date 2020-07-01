/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.daos;


import com.example.mindoc_transfer.db.pojo.tables.MdMembers;
import com.example.mindoc_transfer.db.pojo.tables.records.MdMembersRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class MdMembersDao extends DAOImpl<MdMembersRecord, com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers, Integer> {

    /**
     * Create a new MdMembersDao without any configuration
     */
    public MdMembersDao() {
        super(MdMembers.MD_MEMBERS, com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers.class);
    }

    /**
     * Create a new MdMembersDao with an attached configuration
     */
    public MdMembersDao(Configuration configuration) {
        super(MdMembers.MD_MEMBERS, com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers object) {
        return object.getMemberId();
    }

    /**
     * Fetch records that have <code>member_id IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByMemberId(Integer... values) {
        return fetch(MdMembers.MD_MEMBERS.MEMBER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>member_id = value</code>
     */
    public com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers fetchOneByMemberId(Integer value) {
        return fetchOne(MdMembers.MD_MEMBERS.MEMBER_ID, value);
    }

    /**
     * Fetch records that have <code>account IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByAccount(String... values) {
        return fetch(MdMembers.MD_MEMBERS.ACCOUNT, values);
    }

    /**
     * Fetch a unique record that has <code>account = value</code>
     */
    public com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers fetchOneByAccount(String value) {
        return fetchOne(MdMembers.MD_MEMBERS.ACCOUNT, value);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByPassword(String... values) {
        return fetch(MdMembers.MD_MEMBERS.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>auth_method IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByAuthMethod(String... values) {
        return fetch(MdMembers.MD_MEMBERS.AUTH_METHOD, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByDescription(String... values) {
        return fetch(MdMembers.MD_MEMBERS.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByEmail(String... values) {
        return fetch(MdMembers.MD_MEMBERS.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers fetchOneByEmail(String value) {
        return fetchOne(MdMembers.MD_MEMBERS.EMAIL, value);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByPhone(String... values) {
        return fetch(MdMembers.MD_MEMBERS.PHONE, values);
    }

    /**
     * Fetch records that have <code>avatar IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByAvatar(String... values) {
        return fetch(MdMembers.MD_MEMBERS.AVATAR, values);
    }

    /**
     * Fetch records that have <code>role IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByRole(Integer... values) {
        return fetch(MdMembers.MD_MEMBERS.ROLE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByStatus(Integer... values) {
        return fetch(MdMembers.MD_MEMBERS.STATUS, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByCreateTime(Timestamp... values) {
        return fetch(MdMembers.MD_MEMBERS.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_at IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByCreateAt(Integer... values) {
        return fetch(MdMembers.MD_MEMBERS.CREATE_AT, values);
    }

    /**
     * Fetch records that have <code>last_login_time IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMembers> fetchByLastLoginTime(Timestamp... values) {
        return fetch(MdMembers.MD_MEMBERS.LAST_LOGIN_TIME, values);
    }
}
