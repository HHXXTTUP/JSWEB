package com.js.controller.kf.taskcontent;

import java.net.URLDecoder;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.pojo.Userinfo;
import com.js.service.kf.taskcontent.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONObject;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月20日 下午5:51:45 * @version 1.0 * @parameter  * @since  * @return  */
@Controller
@RequestMapping("contenttg")
public class KFContentTGController {
	@Resource
	private KFAndTgContentService service;
	
	@RequestMapping("/creatcontenttg")
	public String creattask(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		int countcontent = 0;
		Cookie[] cookies = request.getCookies();
		String userID = "";
		String realname = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			if (cookies[i].getName().equals("realname")) {
				realname = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
			}
			
		}
		String contentinfolist = request.getParameter("contentinfolist");
		int contentid = Integer.parseInt(request.getParameter("contentid"));
		if(contentinfolist != null){
			String[] contentlist= contentinfolist.split(",");
			for (int i = 0; i < contentlist.length; i++) {
				int contentinfoid = Integer.parseInt(contentlist[i]); 
				resultpp = service.insertcontenttg(realname, userID, new Date(), contentid, contentinfoid);
				if(resultpp >0){
					countcontent++;
				}
			}
		}
		JSONObject result=new JSONObject();
		if(resultpp>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}	
	

	//删除分配
	@RequestMapping("/deletecontenttg")
	public String deletetask(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		int contentid = Integer.parseInt(request.getParameter("tgcontentid"));
		int contentinfoid = Integer.parseInt(request.getParameter("contentinfoid"));
		String userID = "";
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
		}
		resultpp = service.deletecontenttg(userID, contentid, contentinfoid);
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
