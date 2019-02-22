package com.cfd.board.sub.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * 
* @Title:  TransactionmanagementConfiguration.java   
* @Package： com.cfd.board.sub.config.service   
* @Description: 注解事务管理
* 首先使用注解@EnableTranscationManagement 开启事务支持后 各个业务方法使用注解进行配置
* (用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月19日 下午10:41:18
 */
@Configuration
@EnableTransactionManagement
public class TransactionmanagementConfiguration implements TransactionManagementConfigurer {

	@Resource
	private DataSource dataSource;
	
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}

}
