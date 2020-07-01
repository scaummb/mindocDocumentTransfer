/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables;


import com.example.mindoc_transfer.db.pojo.Keys;
import com.example.mindoc_transfer.db.pojo.MindocDb;
import com.example.mindoc_transfer.db.pojo.tables.records.MdMembersRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class MdMembers extends TableImpl<MdMembersRecord> {

    private static final long serialVersionUID = -44557293;

    /**
     * The reference instance of <code>mindoc_db.md_members</code>
     */
    public static final MdMembers MD_MEMBERS = new MdMembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MdMembersRecord> getRecordType() {
        return MdMembersRecord.class;
    }

    /**
     * The column <code>mindoc_db.md_members.member_id</code>.
     */
    public final TableField<MdMembersRecord, Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mindoc_db.md_members.account</code>.
     */
    public final TableField<MdMembersRecord, String> ACCOUNT = createField("account", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_members.password</code>.
     */
    public final TableField<MdMembersRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_members.auth_method</code>.
     */
    public final TableField<MdMembersRecord, String> AUTH_METHOD = createField("auth_method", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.field("local", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_members.description</code>.
     */
    public final TableField<MdMembersRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(2000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_members.email</code>.
     */
    public final TableField<MdMembersRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_members.phone</code>.
     */
    public final TableField<MdMembersRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaultValue(org.jooq.impl.DSL.field("null", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_members.avatar</code>.
     */
    public final TableField<MdMembersRecord, String> AVATAR = createField("avatar", org.jooq.impl.SQLDataType.VARCHAR.length(1000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_members.role</code>.
     */
    public final TableField<MdMembersRecord, Integer> ROLE = createField("role", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mindoc_db.md_members.status</code>.
     */
    public final TableField<MdMembersRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mindoc_db.md_members.create_time</code>.
     */
    public final TableField<MdMembersRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mindoc_db.md_members.create_at</code>.
     */
    public final TableField<MdMembersRecord, Integer> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mindoc_db.md_members.last_login_time</code>.
     */
    public final TableField<MdMembersRecord, Timestamp> LAST_LOGIN_TIME = createField("last_login_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>mindoc_db.md_members</code> table reference
     */
    public MdMembers() {
        this("md_members", null);
    }

    /**
     * Create an aliased <code>mindoc_db.md_members</code> table reference
     */
    public MdMembers(String alias) {
        this(alias, MD_MEMBERS);
    }

    private MdMembers(String alias, Table<MdMembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private MdMembers(String alias, Table<MdMembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MindocDb.MINDOC_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MdMembersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MD_MEMBERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MdMembersRecord> getPrimaryKey() {
        return Keys.KEY_MD_MEMBERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MdMembersRecord>> getKeys() {
        return Arrays.<UniqueKey<MdMembersRecord>>asList(Keys.KEY_MD_MEMBERS_PRIMARY, Keys.KEY_MD_MEMBERS_ACCOUNT, Keys.KEY_MD_MEMBERS_EMAIL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMembers as(String alias) {
        return new MdMembers(alias, this);
    }

    /**
     * Rename this table
     */
    public MdMembers rename(String name) {
        return new MdMembers(name, null);
    }
}
