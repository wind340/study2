package com.myboot.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.myboot.domain.Notice;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//DB설정 클래스
@Configuration
@PropertySource("classpath:/application.properties")
public class DBConfig {
	
	@Autowired
	private ApplicationContext context;
	
	//[1]데이터 소스 등록
	@Bean
	@ConfigurationProperties(prefix="spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	
	@Bean
	public DataSource dataSource() {
		return new HikariDataSource(hikariConfig());	
	}
	
	//[2]지금 사용중인 db연동 기술에 맞는 트랜잭션 매니저 등록
	//jdbc,mybatis : DataSourceTransactionManager
	//Hibernate : HibernateTransactionManager
	//JPA : JPATransactionManager
	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	
	//[3]Mybatis spring 에서의 SqlsessionFactoryBean 등록
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource()); //데이터 소스 등록.
		//factoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:com/myboot/mybatis/config.xml"));
		factoryBean.setConfigLocation(context.getResource("classpath:com/myboot/mybatis/config.xml"));
		return factoryBean.getObject();
	}
	
	//[4] SqlSessionTemplate 등록
	@Bean
	public SqlSessionTemplate sqlSessionTemplate() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory());
	}
	
	
}
