package com.zfgc.zfgbb.migrator.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages="com.zfgc.zfgbb.migrator.mappers",
			sqlSessionTemplateRef="sqlSessionTemplatePostgres")
@MapperScan(basePackages="com.zfgc.zfgbb.migrator.smf.mappers",
			sqlSessionTemplateRef="sqlSessionTemplateMySql")
public class DatasourceConfig {
	@Bean(name="postgresds")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource postgresDataSource() {
	    return DataSourceBuilder.create().build();
	}

	@Bean(name="smfds")
	@ConfigurationProperties(prefix="zfgbb.mysqldatasource")
	public DataSource mysqlDataSource() {
	    return DataSourceBuilder.create().build();
	}
	
	@Bean
    public SqlSessionFactory sqlSessionFactoryPostgres() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(postgresDataSource());
        //Set the storage location of XML files Note the student directory here
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:com/zfgc/zfgbb/migrator/mappers/*.xml")); 
        return bean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplatePostgres() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactoryPostgres());
    }
    
    @Bean
    public SqlSessionFactory sqlSessionFactoryMysql() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(mysqlDataSource());
        //Set the storage location of XML files Note the student directory here
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:com/zfgc/zfgbb/migrator/smf/mappers/*.xml")); 
        return bean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateMySql() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactoryMysql());
    }
}
