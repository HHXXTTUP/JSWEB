package com.js.controller.kf.trackcorp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KfBespoken;
import com.js.pojo.KfCorpsign;
import com.js.pojo.SCorp;
import com.js.pojo.loaduser;
import com.js.service.kf.trackcorp.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月14日 下午2:06:21 * @version 1.0 * @parameter  * @since  * @return  */
@Controller
@RequestMapping("corpsign")
public class KFBeSpokenController {
	@Resource
	private KFBeSpokenService service;
	/**
	 * 添加 企业 标识
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/bespokenAdd")
	@ResponseBody
	public String corpsign(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
//		Cookie[] cookies = request.getCookies();
//		String userID = "";
//		// 首次加载 没有选定用户 即登陆者分数
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

		int taskid = Integer.parseInt(request.getParameter("taskid"));
		int corpid = Integer.parseInt(request.getParameter("corpid"));
		int isdefault = Integer.parseInt(request.getParameter("isdefault"));
		int spokenlinkmanid = Integer.parseInt(request.getParameter("spokenlinkmanid"));
		String  spokenlinkmen= request.getParameter("spokenlinkmen");
		String  spokenlinkphone= request.getParameter("spokenlinkphone");
		String  strspokentime= request.getParameter("spokentime");
		String  spokencontent= request.getParameter("spokencontent");
		String  spokencompany= request.getParameter("spokencompany");
		if(isdefault==1){
			service.dedefault(corpid, taskid, userID);
		}
		Date spokentime = StringUtil.dateTimeString2Dateinfo(strspokentime);
		KfBespoken spoken=  new KfBespoken();
		spoken.setSpokencontent(spokencontent);
		spoken.setSpokenlinkmanid(spokenlinkmanid);
		spoken.setSpokenlinkmen(spokenlinkmen);
		spoken.setSpokenlinkphone(spokenlinkphone);
		spoken.setSpokencompany(spokencompany);
		spoken.setSpokentime(spokentime);
		spoken.setTaskid(taskid);
		spoken.setUserid(userID);
		spoken.setCorpid(corpid);
		spoken.setAddtime(new Date());
		spoken.setState(0);
		spoken.setIsdefault(isdefault);
		Result result = new Result<>();
		int ppd = service.insert(spoken);
		if(ppd >-1){
			result.setCode("1");
			result.setData(ppd);
			result.setMsg("OK");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	
	
	
	/**
	 * 首页显示预约
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/bespokeninfo")
	@ResponseBody
	public String bespokeninfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
//		Cookie[] cookies = request.getCookies();
//		String userID = "";
//		// 首次加载 没有选定用户 即登陆者分数
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
	    
	    
		Map<String,Object> map=new HashMap<String,Object>();
		
		
		map.put("userID", userID);
		
		if(StringUtil.isNotEmpty(request.getParameter("starttime"))){
			map.put("starttime",request.getParameter("starttime"));
			map.put("endtime",request.getParameter("endtime"));
		}
	    List<KfBespoken> maplist =service.KfBespokeninfo(map);
	    Result result = new Result<>();
	
		if(map  != null ){
			result.setCode("1");
			result.setData(maplist);
			result.setMsg("OK");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	
	
	
	@RequestMapping("/despoken")
	@ResponseBody
	public String despoken(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        int sponkenid = Integer.parseInt(request.getParameter("spokenid"));
        int ppd = service.deleteByPrimaryKey(sponkenid);
	    Result result = new Result<>();
		if(ppd  >-1 ){
			result.setCode("1");
			result.setData(ppd);
			result.setMsg("OK");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
}
