/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables;


import com.example.mindoc_transfer.db.pojo.Keys;
import com.example.mindoc_transfer.db.pojo.MindocDb;
import com.example.mindoc_transfer.db.pojo.tables.records.MdMigrationsRecord;

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
public class MdMigrations extends TableImpl<MdMigrationsRecord> {

    private static final long serialVersionUID = -1130822886;

    /**
     * The reference instance of <code>mindoc_db.md_migrations</code>
     */
    public static final MdMigrations MD_MIGRATIONS = new MdMigrations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MdMigrationsRecord> getRecordType() {
        return MdMigrationsRecord.class;
    }

    /**
     * The column <code>mindoc_db.md_migrations.migration_id</code>.
     */
    public final TableField<MdMigrationsRecord, Integer> MIGRATION_ID = createField("migration_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mindoc_db.md_migrations.name</code>.
     */
    public final TableField<MdMigrationsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_migrations.statements</code>.
     */
    public final TableField<MdMigrationsRecord, String> STATEMENTS = createField("statements", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>mindoc_db.md_migrations.status</code>.
     */
    public final TableField<MdMigrationsRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("update", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_migrations.create_time</code>.
     */
    public final TableField<MdMigrationsRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mindoc_db.md_migrations.version</code>.
     */
    public final TableField<MdMigrationsRecord, Long> VERSION = createField("version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>mindoc_db.md_migrations</code> table reference
     */
    public MdMigrations() {
        this("md_migrations", null);
    }

    /**
     * Create an aliased <code>mindoc_db.md_migrations</code> table reference
     */
    public MdMigrations(String alias) {
        this(alias, MD_MIGRATIONS);
    }

    private MdMigrations(String alias, Table<MdMigrationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MdMigrations(String alias, Table<MdMigrationsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MdMigrationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MD_MIGRATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MdMigrationsRecord> getPrimaryKey() {
        return Keys.KEY_MD_MIGRATIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MdMigrationsRecord>> getKeys() {
        return Arrays.<UniqueKey<MdMigrationsRecord>>asList(Keys.KEY_MD_MIGRATIONS_PRIMARY, Keys.KEY_MD_MIGRATIONS_VERSION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdMigrations as(String alias) {
        return new MdMigrations(alias, this);
    }

    /**
     * Rename this table
     */
    public MdMigrations rename(String name) {
        return new MdMigrations(name, null);
    }
}
