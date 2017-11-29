package com.js.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月7日 下午6:12:38 * @version 1.0 * @parameter  * @since  * @return  */

@RequestMapping("cookie")
@Controller
public class CreateCookie {

	@RequestMapping("/create")
	public void createcookie(HttpServletRequest request, HttpServletResponse response) throws Exception {

		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        
		String userid = request.getParameter("userid");
		String userinfoid = request.getParameter("userinfoid").toString();
		String realname = request.getParameter("realname");
		/*Cookie cookie=new Cookie("userinfoid",userinfoid);
		Cookie cookie2=new Cookie("realname", URLEncoder.encode(realname, "UTF-8")); 
		Cookie cookie3=new Cookie("userid", userid); 
		cookie.setMaxAge(3600);
		cookie2.setMaxAge(3600);
		cookie3.setMaxAge(3600);
		cookie.setPath("/");
		cookie2.setPath("/");
		cookie3.setPath("/");
		cookie.setDomain("192.168.0.6");
		cookie2.setDomain("192.168.0.6");
		cookie3.setDomain("192.168.0.6");
		response.addCookie(cookie); 
		response.addCookie(cookie2);
		response.addCookie(cookie3);*/

		request.setAttribute("ckuserid", userid);
		request.setAttribute("ckuserinfoid", userinfoid);
		request.setAttribute("ckrealname", realname);
		
		
		JSONObject result=new JSONObject();
		if(realname != ""){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return;
	}
	
	 @RequestMapping("/delete")
	 public void cleanCookie(HttpServletRequest request, HttpServletResponse response) {
		 
		 String path ="/";
		 Cookie[] cookies = request.getCookies();  
	      try  
	      {  
	           for(int i=0;i<cookies.length;i++)    
	           {  
	            //System.out.println(cookies[i].getName() + ":" + cookies[i].getValue());  
	            Cookie cookie = new Cookie(cookies[i].getName(), null);  
	            cookie.setMaxAge(0);  
	            cookie.setPath(path);//根据你创建cookie的路径进行填写      
	            response.addCookie(cookie);  
	           }  
	       	JSONObject result=new JSONObject();
			
			result.put("success", true);
			
			ResponseUtil.write(response, result);
	           
	      }catch(Exception ex)  
	      {  
	           System.out.println("清空Cookies发生异常！");     
	      }   	  
	}	
}
