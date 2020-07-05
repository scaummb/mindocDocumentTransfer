package com.example.mindoc_transfer.core.provider;

import org.apache.commons.dbcp.BasicDataSource;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author moubin.mo
 * @date: 2019/9/20 20:59
 */

@Component
public class DbProviderImpl implements DbProvider {

	@Value("${mysql.url}")
	private String defaultDbUrl;

	public static final String CALL_FUN_PREFIX = "callfun(";
	public static final String CALL_FUN_SUFFIX = ")";

	/** 服务器地址 */
	@Value("${db.mapping_name:ehcore_test}")
	private String dbMappingName;

	@Value("${db.exclude_tables:}")
	private String excludeTableString;

	@Autowired
	private DSLContext dslContext;

	@Autowired
	private DataSource dataSource;

	public DSLContext getDslContext() {
		return this.dslContext;
	}

	@Override
	public DefaultConfiguration getDbConfiguration() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(defaultDbUrl);
		DefaultConfiguration configuration = new DefaultConfiguration();
		configuration.set(basicDataSource);
		configuration.setSQLDialect(SQLDialect.MYSQL);
		return configuration;
	}

}
