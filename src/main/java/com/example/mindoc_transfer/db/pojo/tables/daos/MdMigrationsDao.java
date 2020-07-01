/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.daos;


import com.example.mindoc_transfer.db.pojo.tables.MdMigrations;
import com.example.mindoc_transfer.db.pojo.tables.records.MdMigrationsRecord;

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
public class MdMigrationsDao extends DAOImpl<MdMigrationsRecord, com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations, Integer> {

    /**
     * Create a new MdMigrationsDao without any configuration
     */
    public MdMigrationsDao() {
        super(MdMigrations.MD_MIGRATIONS, com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations.class);
    }

    /**
     * Create a new MdMigrationsDao with an attached configuration
     */
    public MdMigrationsDao(Configuration configuration) {
        super(MdMigrations.MD_MIGRATIONS, com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations object) {
        return object.getMigrationId();
    }

    /**
     * Fetch records that have <code>migration_id IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations> fetchByMigrationId(Integer... values) {
        return fetch(MdMigrations.MD_MIGRATIONS.MIGRATION_ID, values);
    }

    /**
     * Fetch a unique record that has <code>migration_id = value</code>
     */
    public com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations fetchOneByMigrationId(Integer value) {
        return fetchOne(MdMigrations.MD_MIGRATIONS.MIGRATION_ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations> fetchByName(String... values) {
        return fetch(MdMigrations.MD_MIGRATIONS.NAME, values);
    }

    /**
     * Fetch records that have <code>statements IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations> fetchByStatements(String... values) {
        return fetch(MdMigrations.MD_MIGRATIONS.STATEMENTS, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations> fetchByStatus(String... values) {
        return fetch(MdMigrations.MD_MIGRATIONS.STATUS, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations> fetchByCreateTime(Timestamp... values) {
        return fetch(MdMigrations.MD_MIGRATIONS.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations> fetchByVersion(Long... values) {
        return fetch(MdMigrations.MD_MIGRATIONS.VERSION, values);
    }

    /**
     * Fetch a unique record that has <code>version = value</code>
     */
    public com.example.mindoc_transfer.db.pojo.tables.pojos.MdMigrations fetchOneByVersion(Long value) {
        return fetchOne(MdMigrations.MD_MIGRATIONS.VERSION, value);
    }
}
