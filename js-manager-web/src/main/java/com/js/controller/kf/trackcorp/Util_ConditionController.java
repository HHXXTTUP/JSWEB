package com.js.controller.kf.trackcorp;

import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KfTask;
import com.js.pojo.UtilCondition;
import com.js.service.kf.trackcorp.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月7日 下午7:36:02 * @version 1.0 * @parameter  * @since  * @return  */

@Controller
@RequestMapping("gettype")
public class Util_ConditionController {
	@Resource
	private Util_ConditionService service;
	@RequestMapping("/corptype")
	public String tasklist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        String catetype =request.getParameter("type"); 
		List<UtilCondition> utillist=service.selectinfo(catetype);
		Result result = new Result<>();
		if(utillist != null){
			result.setCode("1");
			result.setData(utillist);
			result.setMsg("获取成功");
		}
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(result, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
	} 
}
