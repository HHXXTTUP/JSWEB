package com.js.controller.kf.trackcorp;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KfBespoken;
import com.js.pojo.KfFollowcorp;
import com.js.pojo.loaduser;
import com.js.service.kf.trackcorp.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月16日 上午9:57:32 * @version 1.0 * @parameter  * @since  * @return  */

@Controller
@RequestMapping("follow")
public class KFFollowcorpController {
	@Resource
	private KFFollowcorpService service;
	@RequestMapping("/corp")
	@ResponseBody
	public String addcorp(HttpServletResponse response,HttpServletRequest request)throws Exception{
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
    	
    	Result result = new Result<>(); 
	    String op =request.getParameter("op");
	    
	    if("insert".equals(op)){
	    	
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
			int followlinkmanid = Integer.parseInt(request.getParameter("followlinkmanid"));
			String  followlinkmen= request.getParameter("followlinkmen");
			String  followlinkphone= request.getParameter("followlinkphone");
			String  followcontent= request.getParameter("followcontent");
			String  followcompany = request.getParameter("followcompany");
			KfFollowcorp follow = new KfFollowcorp();
			follow.setTaskid(taskid);
			follow.setCorpid(corpid);
			follow.setUserid(userID);
			follow.setFollowcontent(followcontent);
			follow.setFollowlinkmanid(followlinkmanid);
			follow.setFollowlinkmen(followlinkmen);
			follow.setFollowlinkphone(followlinkphone);
			follow.setFollowcompany(followcompany);
			follow.setAddtime(new Date());
			follow.setState(0);
		
			int ppd = service.insert(follow);
			if(ppd >-1){
				result.setCode("1");
				result.setData(ppd);
				result.setMsg("OK");
			}
			
	    }
	    else if("delete".equals(op)){
	    	
	    	int followid = Integer.parseInt(request.getParameter("followid"));
	    	int ppd = service.deleteByPrimaryKey(followid);
			if(ppd >-1){
				result.setCode("1");
				result.setData(ppd);
				result.setMsg("OK");
			}
	    }
	    
	    else if("select".equals(op)){
	    	String userinfo1 =request.getParameter("userinfo");
			JSONArray jsonArray8=JSONArray.fromObject(userinfo1);
		    JSONObject jsonObject10 = new JSONObject();
		    Object o2 = new Object();
		    loaduser user = new loaduser();
		    o2=jsonArray8.get(0);
		    jsonObject10=JSONObject.fromObject(o2);
		    user=(loaduser)JSONObject.toBean(jsonObject10, loaduser.class);
		    String userID = user.getUserid(); 
	
		    List<KfFollowcorp> followlist = service.selectfollowinfo(userID);
		    
		    if(followlist != null){
				result.setCode("1");
				result.setData(followlist);
				result.setMsg("OK");
			}
	    }
		
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	
	
	

}
