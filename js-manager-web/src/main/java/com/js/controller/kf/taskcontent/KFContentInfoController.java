package com.js.controller.kf.taskcontent;

import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KfAllot;
import com.js.pojo.KfContent;
import com.js.pojo.KfContentinfo;
import com.js.pojo.Userinfo;
import com.js.service.kf.taskcontent.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月19日 上午11:29:06 * @version 1.0 * @parameter  * @since  * @return  */



@Controller
@RequestMapping("contentInfo")
public class KFContentInfoController {

	
	@Resource
	private KFContentInfoService service;
	/**
	 * 查询 备注内容 列表
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/contentInfolist")
	public String contentInfolist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
	
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfContentinfo> contentInfolist=service.contentinfolist(userID);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(contentInfolist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
	} 
	
	
	@RequestMapping("/contentjhlist")
	public String contentjhlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
	
		String userID = "";
		
		if("error".equals(request.getParameter("contentid"))){
			return null;
		}else{
		
		int contentid = Integer.parseInt(request.getParameter("contentid"));
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfContentinfo> contentInfolist=service.contentinfojhlist(userID, contentid);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(contentInfolist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
		}
	} 
	
	@RequestMapping("/contentoklist")
	public String contentjhOKlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
		String userID = "";
		if("error".equals(request.getParameter("contentid"))){
			return null;
		}else{
		
		int contentid = Integer.parseInt(request.getParameter("contentid"));
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfContentinfo> contentInfolist=service.contenoklist(userID, contentid);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(contentInfolist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
		}
	} 
	
	
	@RequestMapping("/contenttglist")
	public String contenttglist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
		String userID = "";
		if("error".equals(request.getParameter("contentid"))){
			return null;
		}else{
		
		int contentid = Integer.parseInt(request.getParameter("contentid"));
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfContentinfo> contentInfolist=service.contentglist(userID, contentid);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(contentInfolist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
		}
	} 
	
	
	
	
	
	   //显示分配好通过备注信息

	@RequestMapping("/contentgoklist")
	public String contentgoklist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
		String userID = "";
		if("error".equals(request.getParameter("tgcontentid"))){
			return null;
		}else{
		
		int contentid = Integer.parseInt(request.getParameter("tgcontentid"));
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfContentinfo> contentInfolist=service.contentgoklist(userID, contentid);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(contentInfolist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
		}
	} 
	
	
	
	
	
	
	
	/**
	 * 创建备注内容
	 * @param userinfo
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/creatcontentinfo")
	public String creattask(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfContentinfo kfcontentinfo = new KfContentinfo();
		kfcontentinfo.setCreateman(request.getParameter("createman"));
		kfcontentinfo.setCreateuserid(request.getParameter("createuserid"));
		kfcontentinfo.setMemoname(request.getParameter("contentname"));
		kfcontentinfo.setCreatememo(request.getParameter("contentmemo"));
		kfcontentinfo.setCreatetime(new Date());

		resultpp = service.insert(kfcontentinfo);
		
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
	@RequestMapping("/updateallot")
	public String updateallot(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		int contentid = Integer.parseInt(request.getParameter("contentid"));
		String memoname = request.getParameter("memoname");
		int resultpp=service.updatecontentName(contentid, memoname);
		JSONObject result=new JSONObject();
		if(resultpp>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
		
	
	}
	
	
	
	@RequestMapping("/getContentnName")
	public String getContentnName(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		int contentid = Integer.parseInt(request.getParameter("contentid"));
		String name=service.ContentnName(contentid);
		JSONObject result=new JSONObject();
		System.out.println(name);
		if(name != null){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
		
	
	}
	
	
	
	
	
	
	
	
	
}
