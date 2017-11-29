package com.js.controller.util.group;

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
import com.js.mapper.KfCorpfpMapper;
import com.js.pojo.KfAllot;
import com.js.pojo.KfGroupinfo;
import com.js.pojo.loaduser;
import com.js.service.KFGroupInfoService;
import com.js.service.KFgroupAndUserService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月11日 上午9:36:17 * @version 1.0 * @parameter  * @since  * @return  */

@Controller
@RequestMapping("group")
public class KFGroupInfoController {
	@Resource
	private KFGroupInfoService service;
	@Resource
	private KFgroupAndUserService gsservice;
	@Resource
	private KfCorpfpMapper cfmapper;
	
	/**
	 * 查询小组列表
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/grouplist")
	public String grouplist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
	
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfGroupinfo> grouplist=service.Grouplist(userID);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(grouplist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
	} 
	
	
	/**
	 * 新增小组
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/creatgrouptwo")
	public String creatgrouptwo(HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfGroupinfo  group = new KfGroupinfo();
		Cookie[] cookies = request.getCookies();
		
		String userID = "";
		String username = "";
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			if (cookies[i].getName().equals("realname")) {
				username = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
			}
		}
		
		String creatememo = request.getParameter("creatememo");
		String groupname = request.getParameter("groupname");
		int groupid = Integer.parseInt(request.getParameter("groupid"));
		String topglid = service.getgroupglid(groupid);
		int myid = service.getmyid();
		resultpp = service.insertgrouptwo(username, userID, new Date(), groupname, creatememo, groupid, topglid+"$",myid);
		JSONObject result=new JSONObject();
		if(resultpp>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}	
	
	
	
	@RequestMapping("/creatgroup")
	public String creatgroup(HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfGroupinfo  group = new KfGroupinfo();
		group.setCreatetime(new Date());
		group.setCreateuserid(request.getParameter("createuserid"));
		group.setGroupmemo(request.getParameter("creatememo"));
		group.setGroupname(request.getParameter("groupname"));

		resultpp = service.insert(group);
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
	 * 删除小组
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletegroup")
	public String deletetask(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		int id = Integer.parseInt(request.getParameter("ID"));
		int dd = gsservice.deletegroup(id);
		int yy = cfmapper.deletegroup(id);
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
	 * 修稿小组信息
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updategroup")
	public String updateUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
  		
  	  KfGroupinfo group = new KfGroupinfo(); 
  		
  	group.setCreateman(request.getParameter("createman"));
  	group.setId(Integer.parseInt(request.getParameter("groupid")));
  	group.setCreateuserid(request.getParameter("createuserid"));
  	group.setGroupmemo(request.getParameter("creatememo"));
  	group.setGroupname(request.getParameter("groupname"));
  	group.setCreatetime(new Date());
  	
  	
 
		int resultpp=service.updateByPrimaryKey(group);
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
	 * 下拉小组名称
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findgroupname")
	public String findgroupname(HttpServletRequest request, HttpServletResponse response )throws Exception{
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
		
		List<Map> groupname=service.getgroupName(userID);
		JSONArray rows=JSONArray.fromObject(groupname);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	/**
	 * 下拉小组名称
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mygroupname")
	public String mygroupname(HttpServletRequest request, HttpServletResponse response )throws Exception{
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		DataSourceContextHolder.setDbType("ds1");
//		Cookie[] cookies = request.getCookies();
//		
//		String userID = "";
//		// 首次加载 没有选定用户 即登陆者分数
//		
//		for (int i = 0; i < cookies.length; i++) {
//			if (cookies[i].getName().equals("userid")) {
//					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
//				}
//			}
		String userinfo1 =request.getParameter("userinfo");
		JSONArray jsonArray8=JSONArray.fromObject(userinfo1);
	    JSONObject jsonObject10 = new JSONObject();
	    Object o2 = new Object();
	    loaduser user = new loaduser();
	    o2=jsonArray8.get(0);
	    jsonObject10=JSONObject.fromObject(o2);
	    user=(loaduser)JSONObject.toBean(jsonObject10, loaduser.class);
	    String userID = user.getUserid(); 
	    String realname = user.getRealname();
		
		
		JSONArray jsonArray=new JSONArray();
		List<Map> mygroupname=service.getmygroup(userID);
		JSONArray rows=JSONArray.fromObject(mygroupname);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	
	
}
