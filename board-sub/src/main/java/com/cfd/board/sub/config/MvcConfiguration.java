package com.cfd.board.sub.config;

import javax.servlet.Filter;

import org.springframework.beans.BeansException;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cfd.board.sub.config.filter.MyFilter;
import com.cfd.board.sub.config.interceptor.AddressIntercept;
import com.cfd.board.sub.server.servlet.MySerlvet;


/**
 * 
* @Title:  MvcConfiguration.java   
* @Package： com.cfd.board.sub.config   
* @Description: 开启Mvc自动注入spring容器。WebMvcconfigurerAdapter:配置试图解析器
* 当一个类实现了这个接口（ApplicationContextAware）之后，这个类就可以方便获取applicationContext 中的bean   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月22日 下午10:52:19
 */
@Configuration
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter implements ApplicationContextAware {

	// Spring容器
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}


	/**
	 * 定义默认的请求处理器
	 * 
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer)
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	/**
	 * 
	 * @Title: createViewResolver   
	 * @Description: 创建视图解析器ViewResolver   
	 * @param: @return      
	 * @return: ViewResolver      
	 * @throws
	 */
	@Bean(name = "viewResolver")
	public ViewResolver createViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		// 设置Spring容器
		viewResolver.setApplicationContext(this.applicationContext);
		// 取消缓存
		viewResolver.setCache(false);
		// 设置解析的前缀
		viewResolver.setPrefix("/WEB-INF/html/");
		// 设置解析的后缀
		viewResolver.setSuffix(".html");
		return viewResolver;
	}

	/**
	 * 
	 * @Title: createMultipartResolver   
	 * @Description: multipartResolver用于处理文件上传   
	 * @param: @return      
	 * @return: CommonsMultipartResolver      
	 * @throws
	 */
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver createMultipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setDefaultEncoding("utf-8");
		multipartResolver.setMaxUploadSize(1024 * 1024 * 100);
		multipartResolver.setMaxInMemorySize(1024 * 1024 * 100);
		return multipartResolver;
	}

	
	/**
	 * 
	 * @Title: addInterceptors   
	 * @Description: 添加权限拦截器   
	 * @param: @return      
	 * @throws
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		String interceptPath = "/admin/**";
		// 注册拦截器
		InterceptorRegistration loginIR = registry.addInterceptor(new AddressIntercept());
		// 配置拦截的路径
		loginIR.addPathPatterns(interceptPath);
		// 配置不拦截的路径
		//loginIR.excludePathPatterns("/admin/queryuserlist");
	}

	/**
	 * 
	 * @Title: webAuthFilterRegistration   
	 * @Description: filter过滤器注册   
	 * @param: @return      
	 * @return: FilterRegistrationBean      
	 * @throws
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean webAuthFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(webAuthFilter());
		registration.setName("WebAuthFilter");
		registration.addUrlPatterns("/person/*");
		//registration.addInitParameter("excludeUrls", "/web/login");
		registration.setOrder(0);
		return registration;
	}

	@Bean
	public Filter webAuthFilter() {
		return new MyFilter();
	}

	
	/*@Bean
    public ServletRegistrationBean MyServlet1(){
        return new ServletRegistrationBean(new MySerlvet(),"/myserv/*");
    }*/
}
