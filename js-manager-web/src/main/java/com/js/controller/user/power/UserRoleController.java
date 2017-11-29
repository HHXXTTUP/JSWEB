package com.js.controller.user.power;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.pojo.PmUserrole;
import com.js.pojo.Userinfo;
import com.js.service.UserRoleService;
import com.js.service.UserinfoService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("userrole")
public class UserRoleController {
	@Resource
	private UserRoleService service;
	@Resource
	private UserinfoService userservice;
	
	/**
	 * 创建用户角色  给用户授予角色
	 * @param userrole
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/create")
	public String addroleuser(PmUserrole userrole,HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		int roleid = Integer.parseInt(request.getParameter("roleid")); 
		int userinfoid = Integer.parseInt(request.getParameter("userinfoid")); 
		int adduserid = 365;
		String addueser = "李文睿";
		String adduserIP = "192.1.10.38";
		userrole.setRoleid(roleid);
		userrole.setUserinfoid(userinfoid);
		userrole.setAddtime(new Date());
		userrole.setAdduserid(adduserid);
		userrole.setAdduserIP(adduserIP);
		userrole.setAddueser(addueser);
		int Userrelust = service.insert(userrole);
		int isvalid =Integer.parseInt(request.getParameter("msgid")); 
		Userinfo user = new  Userinfo();
		user.setID(userinfoid);
		user.setIsvalid(isvalid);
		int dd = userservice.updateByPrimaryKeySelective(user);
		JSONObject result=new JSONObject();
		if(Userrelust>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
}
