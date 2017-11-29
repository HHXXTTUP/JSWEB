package com.js.controller.kf.task;

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
import com.js.pojo.KfAllot;
import com.js.pojo.KfTask;
import com.js.pojo.Userinfo;
import com.js.pojo.loaduser;
import com.js.service.kf.task.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月10日 上午10:39:03 * @version 1.0 * @parameter  * @since  * @return  */
@RequestMapping("allot")
@Controller
public class KFAllotController {
	@Resource
	private KFAllotService service;
	
	
	/**
	 * 显示清单列表
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/allotlist")
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
		List<KfAllot> allotlist=service.allotlist(userID);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(allotlist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
	} 
	

	
	/**
	 * 创建清单
	 * @param userinfo
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/creatallot")
	public String creattask(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfAllot allot = new KfAllot();
		allot.setCreatemen(request.getParameter("createman"));
		allot.setCreatetime(new Date());
		allot.setCreateuserid(request.getParameter("createuserid"));
		allot.setAllotname(request.getParameter("allotname"));
		resultpp = service.insert(allot);
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
	@RequestMapping("/deleteallot")
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
	public String updateUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
  		
  	  KfAllot allot = new KfAllot(); 
  		
      allot.setId(Integer.parseInt(request.getParameter("allotid")));
      allot.setAllotname(request.getParameter("allotname"));
      allot.setCreatemen(request.getParameter("createman"));
  	  allot.setCreatetime(new Date());
  	  allot.setCreateuserid(request.getParameter("createuserid"));
  	
		int resultpp=service.updateByPrimaryKey(allot);
		
		
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
	 * 显示清单名称
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findallotName")
	public String findTaskNameComboList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
		String userID = "";
	// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
		}
		
//		String userinfo =request.getParameter("userinfo");
//		JSONArray jsonArray8=JSONArray.fromObject(userinfo);
//	    JSONObject jsonObject2 = new JSONObject();
//	    Object o = new Object();
//	    loaduser user = new loaduser();
//	    o=jsonArray8.get(0);
//	    jsonObject2=JSONObject.fromObject(o);
//	    user=(loaduser)JSONObject.toBean(jsonObject2, loaduser.class);
//	    String userID = user.getUserid(); 
//	    String realname = user.getRealname();
		
		JSONArray jsonArray=new JSONArray();
		List<Map> allotName=service.getallotName(userID);
		JSONArray rows=JSONArray.fromObject(allotName);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
}
