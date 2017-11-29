package com.js.controller.user.power;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.service.UserinfoService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月6日 下午8:01:16 * @version 1.0 * @parameter  * @since  * @return  */

@Controller
@RequestMapping("qx")
public class GetUsetMenuQXController {
	@Resource
	private UserinfoService userinfoservice;
	
	@RequestMapping("/getqx")
	public String  getqx(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    DataSourceContextHolder.setDbType("ds1");

		String userid= request.getParameter("userid");
		int menuid = Integer.parseInt(request.getParameter("menuid"));
		
		String qxStr = userinfoservice.getqxinfo(userid, menuid);
		ArrayList list=new ArrayList();
		String[] ss = new String[100];
		String[] dd = new String[100];
		
		if(qxStr==null){
			list.add("64");
		}else{
			ss = qxStr.split(",");
			for (int i = 0; i < ss.length; i++) {
				dd = ss[i].split(":");
				for (int j = 0; j < dd.length; j++) {
					if((j+2)%2==0){
						list.add(dd[0]);
					}
				}
				
			}
		}
		
		JsonConfig jsonConfig = new JsonConfig();
		JSONArray jsonArray = JSONArray.fromObject(list, jsonConfig);
		ResponseUtil.write(response, jsonArray);	
		return null;
	}
}
