/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables;


import com.example.mindoc_transfer.db.pojo.Keys;
import com.example.mindoc_transfer.db.pojo.MindocDb;
import com.example.mindoc_transfer.db.pojo.tables.records.MdMemberTokenRecord;

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
public class MdMemberToken extends TableImpl<MdMemberTokenRecord> {

    private static final long serialVersionUID = 311411151;

    /**
     * The reference instance of <code>mindoc_db.md_member_token</code>
     */
    public static final MdMemberToken MD_MEMBER_TOKEN = new MdMemberToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MdMemberTokenRecord> getRecordType() {
        return MdMemberTokenRecord.class;
    }

    /**
     * The column <code>mindoc_db.md_member_token.token_id</code>.
     */
    public final TableField<MdMemberTokenRecord, Integer> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mindoc_db.md_member_token.member_id</code>.
     */
    public final TableField<MdMemberTokenRecord, Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mindoc_db.md_member_token.token</code>.
     */
    public final TableField<MdMemberTokenRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_member_token.email</code>.
     */
    public final TableField<MdMemberTokenRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_member_token.is_valid</code>.
     */
    public final TableField<MdMemberTokenRecord, Byte> IS_VALID = createField("is_valid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mindoc_db.md_member_token.valid_time</code>.
     */
    public final TableField<MdMemberTokenRecord, Timestamp> VALID_TIME = createField("valid_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>mindoc_db.md_member_token.send_time</code>.
     */
    public final TableField<MdMemberTokenRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>mindoc_db.md_member_token</code> table reference
     */
    public MdMemberToken() {
        this("md_member_token", null);
    }

    /**
     * Create an aliased <code>mindoc_db.md_member_token</code> table reference
     */
    public MdMemberToken(String alias) {
        this(alias, MD_MEMBER_TOKEN);
    }

    private MdMemberToken(String alias, Table<MdMemberTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private MdMemberToken(String alias, Table<MdMemberTokenRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MdMemberTokenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MD_MEMBER_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MdMemberTokenRecord> getPrimaryKey() {
        return Keys.KEY_MD_MEMBER_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MdMemberTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<MdMemberTokenRecord>>asList(Keys.KEY_MD_MEMBER_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMemberToken as(String alias) {
        return new MdMemberToken(alias, this);
    }

    /**
     * Rename this table
     */
    public MdMemberToken rename(String name) {
        return new MdMemberToken(name, null);
    }
}
