package com.cfd.board.sub.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * 
* @Title:  DataSourceConfiguration.java   
* @Package： com.cfd.board.sub.config   
* @Description: 配置数据源及扫描包   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月22日 下午10:59:35
 */
@Configuration
@MapperScan("com.cfd.board.sub.server.Mapper")
public class DataSourceConfiguration {
	
	
	public DataSource createDataSouce() throws PropertyVetoException {
		DataSourceConfig dataSource = new DataSourceConfig();
		return dataSource.primaryDataSource();
	}

	
}
