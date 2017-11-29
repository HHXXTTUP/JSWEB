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

import com.js.pojo.KfGroupanduser;
import com.js.pojo.KfGroupinfo;
import com.js.service.KFgroupAndUserService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月11日 上午11:23:33 * @version 1.0 * @parameter  * @since  * @return  */

@Controller
@RequestMapping("groupanduser")
public class KFGroupAndUserController {
	@Resource
	private KFgroupAndUserService service;
	
	
	
	
	/**
	 * 添加组员
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/creatgroupuser")
	public String creatgroupuser(HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfGroupanduser groupanduser = new KfGroupanduser();
		
		groupanduser.setCreateman(request.getParameter("createman"));
		groupanduser.setCreatememo(request.getParameter("creatememo"));
		groupanduser.setCreatetime(new Date());
		groupanduser.setCreateuserid(request.getParameter("createuserid"));
		groupanduser.setGroupid(Integer.parseInt(request.getParameter("groupid")));
		groupanduser.setUserid(request.getParameter("userid"));
		groupanduser.setUsername(request.getParameter("username"));
		groupanduser.setIszz(Integer.parseInt(request.getParameter("iszz")));

		resultpp = service.insert(groupanduser);
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
	 * 小组对应成员下拉
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findgroupUsername")
	public String findgroupname(HttpServletRequest request, HttpServletResponse response )throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		JSONArray jsonArray=new JSONArray();
		if(request.getParameter("gourpid") == null){
			return null;
		}
		else{
		int gourpid = Integer.parseInt(request.getParameter("gourpid"));
		List<Map> groupUsername=service.getgroupUserName(gourpid);
		JSONArray rows=JSONArray.fromObject(groupUsername);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
			return null;
		}
	}
	
	
	/**
	 * 删除小组成员
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletegroupUser")
	public String deletegroupUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		int grourpid = Integer.parseInt(request.getParameter("groupID"));

		resultpp = service.deletegroupuser(grourpid, request.getParameter("userid"));
		
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
