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
public class MdMigrations implements Serializable {

    private static final long serialVersionUID = 64049198;

    private Integer   migrationId;
    private String    name;
    private String    statements;
    private String    status;
    private Timestamp createTime;
    private Long      version;

    public MdMigrations() {}

    public MdMigrations(MdMigrations value) {
        this.migrationId = value.migrationId;
        this.name = value.name;
        this.statements = value.statements;
        this.status = value.status;
        this.createTime = value.createTime;
        this.version = value.version;
    }

    public MdMigrations(
        Integer   migrationId,
        String    name,
        String    statements,
        String    status,
        Timestamp createTime,
        Long      version
    ) {
        this.migrationId = migrationId;
        this.name = name;
        this.statements = statements;
        this.status = status;
        this.createTime = createTime;
        this.version = version;
    }

    public Integer getMigrationId() {
        return this.migrationId;
    }

    public void setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatements() {
        return this.statements;
    }

    public void setStatements(String statements) {
        this.statements = statements;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MdMigrations (");

        sb.append(migrationId);
        sb.append(", ").append(name);
        sb.append(", ").append(statements);
        sb.append(", ").append(status);
        sb.append(", ").append(createTime);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}