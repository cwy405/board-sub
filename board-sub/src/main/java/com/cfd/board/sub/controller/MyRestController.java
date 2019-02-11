package com.cfd.board.sub.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cfd.board.sub.util.Result;

@RestController
public class MyRestController {

	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Result getPerson(@PathVariable Integer id) {
		Map<String,Object> map = new HashMap<>();
		map.put("userName", "Chen WeiYu");
		map.put("userId", id);
		
		return Result.success().put("info",map);
	}
}
