package com.java.intentory.repository.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@Component
@EnableConfigurationProperties
// @PropertySource("${spring.config.location}${spring.config.name}/config-${spring.profiles.active}.properties")
@PropertySource("classpath:application.properties")

public class ApplicationConfig {

	/** The driver class. */
	@Value("${database.conection.driverClassName}")
	private String driverClass;

	/** The url. */
	@Value("${database.connection.url}")
	private String url;

	/** The username. */
	@Value("${database.connection.user}")
	private String username;

	/** The password. */
	@Value("${database.connection.pass}")
	private String password;

	/**
	 * Data source.
	 * 
	 * @return the data source
	 */
	@Bean
	public DataSource dataSource() {
		// Inicializacion de DataSource
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	/**
	 * Jdbc template.
	 * 
	 * @param dataSource
	 *            the data source
	 * @return the jdbc template
	 */
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
	}
}
