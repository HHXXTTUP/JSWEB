package com.js.controller.kf.corpfp;

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
import com.js.pojo.FPGroupCorp;
import com.js.pojo.KfAllot;
import com.js.pojo.RcDistrict;
import com.js.pojo.Userinfo;
import com.js.pojo.loaduser;
import com.js.service.kf.corpfp.*;
import com.js.service.KFgroupAndUserService;
import com.js.service.RC_districtService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月16日 下午3:31:15 * @version 1.0 * @parameter  * @since  * @return  */

@RequestMapping("corpfp")
@Controller
public class KFCorpFPController {
	@Resource
	private KFCorpFPService service;
	@Resource
	private KFgroupAndUserService groupservice;
	
	@Resource
	private RC_districtService rcservice;
	/**
	 * 创建清单
	 * @param userinfo
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addcorpfp")
	public String addcorpfp(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		
		Integer resultpp = 0;
		int countcorp=0;
		
//		Cookie[] cookies = request.getCookies();
//		String userID = "";
//		String realname = "";
//		
//		for (int i = 0; i < cookies.length; i++) {
//			if (cookies[i].getName().equals("userid")) {
//					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
//				}
//			if (cookies[i].getName().equals("realname")) {
//				realname = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
//			}
//			
		
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
		
		
		
		int groupid  = groupservice.getgroup(userID);
		int allotid =  Integer.parseInt(request.getParameter("allotid"));
		int taskid=  Integer.parseInt(request.getParameter("taskid"));
		String corplist = request.getParameter("companyconfig");
	    JSONArray jsonArray=JSONArray.fromObject(corplist);
	    Object o = new Object();
	    JSONObject jsonObject2 = new JSONObject();
	    FPGroupCorp fpcorp = new FPGroupCorp();
	        //获得jsonArray的第一个元素
	       for (int i = 0; i < jsonArray.size(); i++) {
	    	   o=jsonArray.get(i);
	    	   jsonObject2=JSONObject.fromObject(o);
	    	   fpcorp=(FPGroupCorp)JSONObject.toBean(jsonObject2, FPGroupCorp.class);
	    	   
	    	   String[] groupidlist = fpcorp.getGroupid().split(",");
	    	   for (int j = 0; j < groupidlist.length; j++) {
	    		   int d =   service.insertCropFP(realname, userID, groupid, new Date(), allotid, fpcorp.getCorpid(),Integer.parseInt(groupidlist[j]));
	    	   } 
	    	   countcorp ++;  
	       }
/*	    String id = jsonArray.getJSONObject(0).get("id");</span>//得到第一个同学的id  
	        String name = jsonArray.getJSONObject(0).get("name");</span>//得到第一个同学的name  
	       return true;  
		*/
	       
	       Result result = new Result<>();
	       if (countcorp>0){
	    	   result.setCode("1");
				result.setMsg("验证通过");
				result.setData(countcorp);
	       }
	       	JsonConfig jsonConfig=new JsonConfig();
			jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
			JSONArray jsonArray1=JSONArray.fromObject(result,jsonConfig);
			ResponseUtil.write(response, jsonArray1);
			return null;
	}	
	/**
	 * 查询分配的相信列表信息
	 * @param userinfo
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/fpinfolist")
	public String findall(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
//		Cookie[] cookies = request.getCookies();
//		String userID = "";
//
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
        
        
		List<Map> map = service.fpinfo(userID);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(map,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	// 获取中国区域
	@RequestMapping("/findqxinfo")
	public String findqxinfo(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		Result result = new Result<>();
		List<RcDistrict>  ecdistrict = rcservice.findrcinfo();
		if(ecdistrict != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(ecdistrict);
		}
	
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	} 
	
	
	@RequestMapping("/deletefpinfo")
	public String deletetask(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		Integer resultpp = 0;
		int allotid = Integer.parseInt(request.getParameter("deallotid"));
		int groupid = Integer.parseInt(request.getParameter("degroupid"));
		String sxwuserid =request.getParameter("desxwuserid");
		resultpp = service.deQDXZ(allotid, groupid);
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
	
	
	
	
	
	
}
