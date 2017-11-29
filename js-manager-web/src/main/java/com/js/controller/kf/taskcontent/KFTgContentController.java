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
import com.js.pojo.KfTgcontent;
import com.js.pojo.Userinfo;
import com.js.service.kf.taskcontent.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月20日 下午2:50:41 * @version 1.0 * @parameter  * @since  * @return  */
@Controller
@RequestMapping("tgcontent")
public class KFTgContentController {
	@Resource
	private KFTgContentService service;
	
	/**
	 * 显示内容名称
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findtgcontentName")
	public String findtgcontentName(HttpServletRequest request, HttpServletResponse response) throws Exception{
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
		List<Map> contentName=service.gettgcontentName(userID);
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
	@RequestMapping("/tgcontentlist")
	public String tgcontentlist(HttpServletRequest request, HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
	
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		List<KfTgcontent> TGcontentlist=service.gettgcontentList(userID);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = JSONArray.fromObject(TGcontentlist, jsonConfig);
		ResponseUtil.write(response,jsonArray);
		return null;
	} 
	
	
	@RequestMapping("/creattgcontent")
	public String creattask(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfTgcontent kftgcontent = new KfTgcontent();
		kftgcontent.setCreatename(request.getParameter("createman"));
		kftgcontent.setCreateuserid(request.getParameter("createuserid"));
		kftgcontent.setTgcontentName(request.getParameter("contentname"));
		kftgcontent.setCreatememo(request.getParameter("contentmemo"));
		kftgcontent.setCreatentime(new Date());
		resultpp = service.insert(kftgcontent);
		JSONObject result=new JSONObject();
		if(resultpp>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}	
	

	@RequestMapping("/deletetgcontent")
	public String deletetask(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		int id = Integer.parseInt(request.getParameter("ID"));
		resultpp = service.deleteByPrimaryKey(id);
	/*	jhservice.deletecontent(id);*/
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
	@RequestMapping("/updatetgcontent")
	public String updatetgcontent(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		int contentid = Integer.parseInt(request.getParameter("tgcontentid"));
		String  tgcontentname  = request.getParameter("tgcontentname");
		int resultpp=service.update(contentid, tgcontentname);
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
