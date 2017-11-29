package com.js.controller.kf.memo;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.Taskuser;
import com.js.pojo.loaduser;
import com.js.service.kf.memo.*;
import com.js.service.kf.task.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月30日 上午11:28:20 * @version 1.0 * @parameter  * @since  * @return  */
@RequestMapping("shcorp")
@Controller
public class KF_ExShCorpController {
	@Resource
	private KFExamineService shservice;
	
	@Resource
	private KFCorpMemoService memoservice;
	/**
	 * 获取需审核信息
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/shcorpinfo")
	@ResponseBody
	public String shcorpinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
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
        

//		String userinfo = "[{\"userinfoid\":\"365\",\"realname\":\"李文睿\",\"userid\":\"20170718-1\"}]";
        
        
		String userinfo =request.getParameter("userinfo");
		JSONArray jsonArray8=JSONArray.fromObject(userinfo);
	    JSONObject jsonObject2 = new JSONObject();
	    Object o = new Object();
	    loaduser user = new loaduser();
	    o=jsonArray8.get(0);
	    jsonObject2=JSONObject.fromObject(o);
	    user=(loaduser)JSONObject.toBean(jsonObject2, loaduser.class);
	    String userID = user.getUserid(); 	

        
        int taskid = Integer.parseInt(request.getParameter("taskid"));
		List<Map> map = shservice.topusershcorp(userID,taskid);
		Result result = new Result<>();
		result.setCode("1");
		result.setMsg("验证通过");
		result.setData(map);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	/**
	 * 修改状态
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/upexstate")
	@ResponseBody
	public String upexstate(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
/*		Cookie[] cookies = request.getCookies();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}	*/
    	String userinfo =request.getParameter("userinfo");
		JSONArray jsonArray8=JSONArray.fromObject(userinfo);
	    JSONObject jsonObject2 = new JSONObject();
	    Object o = new Object();
	    loaduser user = new loaduser();
	    o=jsonArray8.get(0);
	    jsonObject2=JSONObject.fromObject(o);
	    user=(loaduser)JSONObject.toBean(jsonObject2, loaduser.class);
	    String userID = user.getRealname(); 
        
        
        
		
        int taskid = Integer.parseInt(request.getParameter("taskid"));
        int corpid = Integer.parseInt(request.getParameter("corpid"));
        int state = Integer.parseInt(request.getParameter("state"));
        String userid = request.getParameter("userid");
		int ppd= shservice.updatestate(taskid, corpid, userid, state, userID, new Date());
		int bbd = memoservice.updatememostate(taskid, corpid, userid, state);
		Result result = new Result<>();
		if(ppd > -1 ){	
			result.setCode("1");
			result.setMsg("审核成功");
			}
		else{
			result.setCode("0");
			result.setMsg("审核失败");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
}
