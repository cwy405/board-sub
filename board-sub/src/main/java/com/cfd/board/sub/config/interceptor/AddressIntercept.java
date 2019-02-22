package com.cfd.board.sub.config.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class AddressIntercept  extends HandlerInterceptorAdapter{
	
	private Logger logger =Logger.getLogger(AddressIntercept.class);
	/**
	 * 主要做事前拦截，即用户操作发生前
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
	     String code = request.getParameter("type");
		// 非空判断
		if (code != null &&code.equals("code")) {
			logger.debug("常规");
			return true;
		}
		logger.debug("非法地址");
		PrintWriter out = response.getWriter();
		out.println(" <html>");
		out.println(" <script>");
		out.println("window.open('"+request.getContextPath()
				+ "/error/404.html','_self')");
		out.println("</script>");
		out.println("</html>");
		return false;
	}

}
