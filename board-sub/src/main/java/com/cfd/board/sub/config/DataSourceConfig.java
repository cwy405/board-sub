/**   
* @Title:  SpringConfig.java   
* @Package： com.cfd.board.sub.config.dao   
* @Description: TODO(用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月19日 下午10:48:48 
*/
package com.cfd.board.sub.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;


/**
 * @Title: SpringConfig.java @Package： com.cfd.board.sub.config.dao
 * @Description: TODO(用一句话描述该文件做什么)
 *
 * @version: v1.0.0
 * @author: Chen WeiYu
 * @date: 2019年2月19日 下午10:48:48
 */
/*
 * @Configuration // 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
 * 
 * @ComponentScan(basePackages = "com.cfd.board.sub.server.Mapper") // 配置扫描包
 */
@Configuration
//@PropertySource(value = { "application.properties" }, ignoreResourceNotFound = true)
public class DataSourceConfig {

	@Bean(name = "dataSource")
    @Qualifier("myDataSource")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource primaryDataSource() {
		/*builder.username(username);
		builder.password(password);
		builder.driverClassName(driver);
		builder.url(url);*/
		return DataSourceBuilder.create().build();

	}
}
