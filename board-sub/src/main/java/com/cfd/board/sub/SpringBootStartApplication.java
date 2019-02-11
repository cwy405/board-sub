package com.cfd.board.sub;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;


/**
 * 
* @Title:  SpringBootStartApplication.java   
* @Package： com.cfd.board.sub   
* @Description: 将工程加入到tomcat中运行时的初始化类(用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月10日 下午4:19:39
 */
@Configuration
@EnableAutoConfiguration
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //指向使用内嵌tomcat的启动类的main方法执行的Application启动类
        return builder.sources(BoardStartApplication.class);
    }
}