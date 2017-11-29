package com.js.controller.user.power;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.service.RoleinfoService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/role")
public class RoleInfoController {

	

	@Resource
	private RoleinfoService service;
	/**
	 *  获取所有角色名称  下拉框
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findroleName")
	public String dataRealNameComboList(HttpServletResponse response)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		JSONArray jsonArray=new JSONArray();
		List<Map> realnamelist=service.getrolename();
		JSONArray rows=JSONArray.fromObject(realnamelist);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
}
