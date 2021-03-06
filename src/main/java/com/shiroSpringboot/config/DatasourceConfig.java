package com.shiroSpringboot.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DatasourceConfig{

	 private Logger logger = LoggerFactory.getLogger(DatasourceConfig.class);

	    @Value("${spring.datasource.url}")  
	    private String dbUrl;  

	    @Value("${spring.datasource.username}")  
	    private String username;  

	    @Value("${spring.datasource.password}")  
	    private String password;  

	    @Value("${spring.datasource.driverClassName}")  
	    private String driverClassName;  

	    @Value("${spring.datasource.initialSize}")  
	    private int initialSize;  

	    @Value("${spring.datasource.minIdle}")  
	    private int minIdle;  

	    @Value("${spring.datasource.maxActive}")  
	    private int maxActive;  

	    @Value("${spring.datasource.maxWait}")  
	    private int maxWait;  

	    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")  
	    private int timeBetweenEvictionRunsMillis;  

	    @Value("${spring.datasource.minEvictableIdleTimeMillis}")  
	    private int minEvictableIdleTimeMillis;  

	    @Value("${spring.datasource.validationQuery}")  
	    private String validationQuery;  

	    @Value("${spring.datasource.testWhileIdle}")  
	    private boolean testWhileIdle;  

	    @Value("${spring.datasource.testOnBorrow}")  
	    private boolean testOnBorrow;  

	    @Value("${spring.datasource.testOnReturn}")  
	    private boolean testOnReturn;  

	    @Value("${spring.datasource.poolPreparedStatements}")  
	    private boolean poolPreparedStatements;  

	    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")  
	    private int maxPoolPreparedStatementPerConnectionSize;  

	    @Value("${spring.datasource.filters}")  
	    private String filters;  

	    @Value("${spring.datasource.connectionProperties}")  
	    private String connectionProperties;
	    
	    @Value("${spring.datasource.mybatis.model}")
	    private String classPathEntity;
	    @Value("${spring.datasource.mybatis.mapperxml}")
	    private String mapperPath;

	/**
	 * 注入数据源
	 * @return
	 */
	@Bean
	public DataSource getDataSource() {
		DruidDataSource datasource = new DruidDataSource();
			datasource.setUrl(dbUrl);  
	        datasource.setUsername(username);  
	        datasource.setPassword(password);  
	        datasource.setDriverClassName(driverClassName);  
	        //configuration  
	        datasource.setInitialSize(initialSize);  
	        datasource.setMinIdle(minIdle);  
	        datasource.setMaxActive(maxActive);  
	        datasource.setMaxWait(maxWait);  
	        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);  
	        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);  
	        datasource.setValidationQuery(validationQuery);  
	        datasource.setTestWhileIdle(testWhileIdle);  
	        datasource.setTestOnBorrow(testOnBorrow);  
	        datasource.setTestOnReturn(testOnReturn);  
	        datasource.setPoolPreparedStatements(poolPreparedStatements);  
	        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);  
	        try {  
	            datasource.setFilters(filters);  
	        } catch (Exception e) {  
	            logger.error("druid configuration initialization filter", e);  
	        }  
	        datasource.setConnectionProperties(connectionProperties);  

        return datasource;

	}
	
	
   
}
