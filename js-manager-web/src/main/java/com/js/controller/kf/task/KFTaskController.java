package com.js.controller.kf.task;

import java.net.URLDecoder;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KFTaskInfo;
import com.js.pojo.KfAllot;
import com.js.pojo.KfTask;
import com.js.pojo.Userinfo;
import com.js.service.kf.task.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月27日 上午9:48:01 * @version 1.0 * @parameter  * @since  * @return  */

@Controller
@RequestMapping("task")
public class KFTaskController {
	@Resource
	private KFTaskService service;
	@Resource
	private KFAllotService allservice;
	

	
	/**
	 * 显示任务列表
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tasklist")
	public String tasklist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
		Result result = new Result<>();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		
		List<KfTask> tasklist=service.gettaskinfo(userID);
		result.setCode("1");
		result.setData(tasklist);
		result.setMsg("获取成功");
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(result, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
	} 
	
	
	/**
	 * 显示清单名称
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findTaskName")
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
		List<Map> TaskName=service.gettaskName(userID);
		JSONArray rows=JSONArray.fromObject(TaskName);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	

	
	
	/**
	 * 新增任务
	 * @param userinfo
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/creattask")
	public String creattask(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfTask task = new KfTask();
		task.setCreateman(request.getParameter("createman"));
		task.setTaskname(request.getParameter("taskname"));
		task.setCreateuserid(request.getParameter("createuserid"));
		task.setCreatetime(new Date());
		Date starttimedate = StringUtil.dateTimeString2Date(request.getParameter("starttime"));
		Date endtimedate = StringUtil.dateTimeString2Date(request.getParameter("endtime"));
		task.setStarttime(starttimedate);
		task.setEndtime(endtimedate);
		task.setTaskmemo(request.getParameter("taskmemo"));
		task.setIsallcorp(Integer.parseInt(request.getParameter("isallcorp")));
		task.setIsspoken(Integer.parseInt(request.getParameter("isspoken")));
		task.setState("未分配");
		resultpp = service.insert(task);
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
	 * 删除任务
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletetask")
	public String deletetask(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		 int id = Integer.parseInt(request.getParameter("ID"));
		resultpp = service.deleteByPrimaryKey(id);
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
	
	@RequestMapping("/updatetask")
	public String updateUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
  		Date starttimedate = StringUtil.dateTimeString2Date(request.getParameter("starttime"));
  		Date endtimedate = StringUtil.dateTimeString2Date(request.getParameter("endtime"));  
  		KfTask task = new KfTask();  
  		task.setId(Integer.parseInt(request.getParameter("taskid")));
  		task.setCreatetime(new Date());
		task.setTaskname(request.getParameter("taskname")); 
		task.setCreateuserid(request.getParameter("createuserid"));
		task.setCreateman(request.getParameter("createman"));
		task.setStarttime(starttimedate);
		task.setEndtime(endtimedate);
		task.setTaskmemo(request.getParameter("taskmemo"));
		int resultpp=service.updateByPrimaryKey(task);
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
