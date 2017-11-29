package com.js.controller.user.power;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.service.MenuService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Resource
	private MenuService service;

	
	/**
	 * 获取所有栏目 栏目对应的所有权限 用做创建用户权限
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/alltitle")
	public String gettitleall(HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		JSONArray jsonArray=new JSONArray();
		List<Map> titleall=service.gettitleall();
		JSONArray rows=JSONArray.fromObject(titleall);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);

		return null;
	}
	
	
	
	
}
