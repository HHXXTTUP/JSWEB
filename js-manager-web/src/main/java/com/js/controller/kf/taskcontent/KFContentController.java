package com.js.controller.kf.taskcontent;

import java.net.URLDecoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KfContent;
import com.js.pojo.KfContentinfo;
import com.js.pojo.Userinfo;
import com.js.service.kf.taskcontent.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月17日 上午11:42:42 * @version 1.0 * @parameter  * @since  * @return  */


@Controller
@RequestMapping("content")
public class KFContentController {
	@Resource
	private KFContentService service;
	@Resource
	private KFContentJhService jhservice;
	/**
	 * 显示内容名称
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findcontentName")
	public String findTaskNameComboList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		JSONArray jsonArray=new JSONArray();
		List<Map> contentName=service.getcontentName(userID);
		JSONArray rows=JSONArray.fromObject(contentName);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * 内容规则列表
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/contentlist")
	public String allotlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
	
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfContent> contentlist=service.getcontentList(userID);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(contentlist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
	} 
	
	/**
	 * 创建备注内容
	 * @param userinfo
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/creatcontent")
	public String creattask(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfContent kfcontent = new KfContent();
		kfcontent.setCreateman(request.getParameter("createman"));
		kfcontent.setCreateuserid(request.getParameter("createuserid"));
		kfcontent.setContentname(request.getParameter("contentname"));
		kfcontent.setCreatememo(request.getParameter("contentmemo"));
		kfcontent.setCreatetime(new Date());
		resultpp = service.insert(kfcontent);
		
		JSONObject result=new JSONObject();
		if(resultpp>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}	
	
	
	
	/**
	 * 删除清单
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletecontent")
	public String deletetask(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		int id = Integer.parseInt(request.getParameter("ID"));
		resultpp = service.deleteByPrimaryKey(id);
		jhservice.deletecontent(id);
		if(resultpp>0){
			JSONObject result=new JSONObject();
			result.put("success", true);
			ResponseUtil.write(response, result);	
		}
		else
		{
		JSONObject result=new JSONObject();
		result.put("flase", true);
		ResponseUtil.write(response, result);
		}
		return null;
	} 
	
	
	
	/**
	 * 修改清单
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updatecontent1")
	public String updateallot(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		int contentid = Integer.parseInt(request.getParameter("contentid"));
		String memoname = request.getParameter("contentname");
		int resultpp=service.update(contentid, memoname);
		JSONObject result=new JSONObject();
		if(resultpp>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
}
