package com.cfd.board.sub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
* @Title:  BoardStartApplication.java   
* @Package： com.cfd.board.sub   
* @Description: 使用内嵌tomcat时的启动类(用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月10日 下午4:19:14
 */
@SpringBootApplication
public class BoardStartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BoardStartApplication.class, args);
	}
}
