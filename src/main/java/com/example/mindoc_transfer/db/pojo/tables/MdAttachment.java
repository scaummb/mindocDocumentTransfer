/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables;


import com.example.mindoc_transfer.db.pojo.Keys;
import com.example.mindoc_transfer.db.pojo.MindocDb;
import com.example.mindoc_transfer.db.pojo.tables.records.MdAttachmentRecord;

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
public class MdAttachment extends TableImpl<MdAttachmentRecord> {

    private static final long serialVersionUID = -10319267;

    /**
     * The reference instance of <code>mindoc_db.md_attachment</code>
     */
    public static final MdAttachment MD_ATTACHMENT = new MdAttachment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MdAttachmentRecord> getRecordType() {
        return MdAttachmentRecord.class;
    }

    /**
     * The column <code>mindoc_db.md_attachment.attachment_id</code>.
     */
    public final TableField<MdAttachmentRecord, Integer> ATTACHMENT_ID = createField("attachment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.book_id</code>.
     */
    public final TableField<MdAttachmentRecord, Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.document_id</code>.
     */
    public final TableField<MdAttachmentRecord, Integer> DOCUMENT_ID = createField("document_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>mindoc_db.md_attachment.file_name</code>.
     */
    public final TableField<MdAttachmentRecord, String> FILE_NAME = createField("file_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.file_path</code>.
     */
    public final TableField<MdAttachmentRecord, String> FILE_PATH = createField("file_path", org.jooq.impl.SQLDataType.VARCHAR.length(2000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.file_size</code>.
     */
    public final TableField<MdAttachmentRecord, Double> FILE_SIZE = createField("file_size", org.jooq.impl.SQLDataType.DOUBLE.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.DOUBLE)), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.http_path</code>.
     */
    public final TableField<MdAttachmentRecord, String> HTTP_PATH = createField("http_path", org.jooq.impl.SQLDataType.VARCHAR.length(2000).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.file_ext</code>.
     */
    public final TableField<MdAttachmentRecord, String> FILE_EXT = createField("file_ext", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.create_time</code>.
     */
    public final TableField<MdAttachmentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>mindoc_db.md_attachment.create_at</code>.
     */
    public final TableField<MdAttachmentRecord, Integer> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>mindoc_db.md_attachment</code> table reference
     */
    public MdAttachment() {
        this("md_attachment", null);
    }

    /**
     * Create an aliased <code>mindoc_db.md_attachment</code> table reference
     */
    public MdAttachment(String alias) {
        this(alias, MD_ATTACHMENT);
    }

    private MdAttachment(String alias, Table<MdAttachmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private MdAttachment(String alias, Table<MdAttachmentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<MdAttachmentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MD_ATTACHMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MdAttachmentRecord> getPrimaryKey() {
        return Keys.KEY_MD_ATTACHMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MdAttachmentRecord>> getKeys() {
        return Arrays.<UniqueKey<MdAttachmentRecord>>asList(Keys.KEY_MD_ATTACHMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MdAttachment as(String alias) {
        return new MdAttachment(alias, this);
    }

    /**
     * Rename this table
     */
    public MdAttachment rename(String name) {
        return new MdAttachment(name, null);
    }
}