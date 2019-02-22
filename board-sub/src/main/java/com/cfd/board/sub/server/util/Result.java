package com.cfd.board.sub.server.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 
* @Title:  Result.java   
* @Package： com.cfd.board.sub.util   
* @Description: controller返回的书记结构(用一句话描述该文件做什么)   
*
* @version: v1.0.0
* @author: Chen WeiYu
* @date: 2019年2月10日 下午3:29:58
 */
public class Result extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;
	private static int ERROR_CODE = 500;
	private static int SUCCESS_CODE = 200;
	
	public Result() {
		put("code", 0);
	}
	
	public static Result error() {
		return error(ERROR_CODE, "未知异常，请联系管理员");
	}
	
	public static Result error(String msg) {
		return error(ERROR_CODE, msg);
	}
	
	public static Result error(int code, String msg) {
		Result r = new Result();
		r.put("code", code);
		r.put("success", false);
		r.put("msg", msg);
		return r;
	}

	public static Result success() {
		Result r = new Result();
		r.put("msg", "获取成功");
		r.put("code", 200);
		r.put("success", true);
		return r;
	}
	public static Result success(String msg) {
		Result r = new Result();
		r.put("msg", msg);
		r.put("code", 200);
		r.put("success", true);
		return r;
	}
	public static Result success(Map<String, Object> map) {
		Result r = new Result();
		r.put("code", 200);
		r.put("success", true);
		r.putAll(map);
		return r;
	}
	
	public static Result ok(Map<String, Object> map) {
		Result r = new Result();
		r.putAll(map);
		return r;
	}
	
	public static Result ok() {
		return new Result();
	}
	public Result put(String key, Object value) {
		super.put(key, value);
		return this;
	}
}
