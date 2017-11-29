package com.js.controller.user.power;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpCookie;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.Document;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.omg.IOP.Encoding;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.SCorp;
import com.js.pojo.Userinfo;
import com.js.service.UserinfoService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.StringUtil;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;


@Controller
@RequestMapping("/user")

public class UserInfoController {
	
	@Resource
	private UserinfoService service;
	
	/**
	 * 登陆 存入session
	 * @param userinfo
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/login")
	public String login(Userinfo userinfo,HttpServletRequest request,HttpServletResponse response) throws Exception{
//		byte[] b = null;    
//        String mm = null; 
//        String s=request.getParameter("password");
//        if (s != null) {    
//            BASE64Decoder decoder = new BASE64Decoder();    
//            try {    
//                b = decoder.decodeBuffer(s);    
//                mm = new String(b, "utf-8");    
//            } catch (Exception e) {    
//                e.printStackTrace();    
//            }    
//        }    
		DataSourceContextHolder.setDbType("ds1");
		request.setCharacterEncoding("utf-8");  
		response.setContentType("text/html;charset=utf-8");//设置编码  
		userinfo.setUserName(request.getParameter("userName"));
		userinfo.setPassword(request.getParameter("password"));
		userinfo.setSource(request.getParameter("source"));
		Userinfo result = service.getUserAllList(userinfo);
		SimpleDateFormat dfid = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		String strtime = dfid.format(new Date()).toString();
			if(result!=null){	
//				后台存cookie
				Cookie cookie=new Cookie("userinfoid",result.getID().toString());
				Cookie cookie2=new Cookie("realname", URLEncoder.encode(result.getRealName(), "UTF-8")); 
				Cookie cookie3=new Cookie("userid", URLEncoder.encode(result.getUserID(), "UTF-8")); 
				Cookie cookie4=new Cookie("strtime",strtime ); 
				cookie.setMaxAge(3600);
				cookie2.setMaxAge(3600);
				cookie3.setMaxAge(3600);
				cookie4.setMaxAge(3600);
				cookie.setPath("/");
				cookie2.setPath("/");
				cookie3.setPath("/");
				cookie4.setPath("/");
				response.addCookie(cookie); 
				response.addCookie(cookie2);
				response.addCookie(cookie3);
				response.addCookie(cookie4);
				return null;
			}else{
				request.setAttribute("currentUser", userinfo);
				request.setAttribute("errorMsg", "用户名或密码错误！");
				return "/jsweb/login";
			}
			
			
//		Subject subject = SecurityUtils.getSubject();
//		UsernamePasswordToken token = new UsernamePasswordToken(userinfo.getUserName(),userinfo.getPassword());
//		try {
//			subject.login(token);
//			Session session = subject.getSession();	
//			System.out.println("sessionID:" + session.getId());
//			System.out.println("sessionIP:" + session.getHost());
//			System.out.println("sessionID:" + session.getTimeout());
//			
//			Userinfo userinfomain = service.getLoginUser(request.getParameter("userName"));
//			session.setAttribute("userinfo",userinfomain);
//			request.setAttribute("currentUser", userinfomain);
//			return "jsmain";
//		} catch (Exception e) {
//			e.printStackTrace();
//			request.setAttribute("user", userinfo);
//			request.setAttribute("errorMsg", "用户名或密码错误！");
//			return "login";
//		}
	}
	
	/**
	 * 传入  userName  password  source
	 * 返回  jsonArray menu数组
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/loginlist")
	public String loginlist(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        
        Userinfo userinfolist = new Userinfo();
        String username = request.getParameter("userName");
        userinfolist.setUserName(username);
        userinfolist.setPassword(request.getParameter("password"));
        userinfolist.setSource(request.getParameter("source"));
        Userinfo result = service.getUserAllList(userinfolist);
        
		if(result!=null){	
			JSONArray jsonArray=new JSONArray();
			List<Map> menuinfolist=service.getmenuone(username);
			List<Map> menuinfolist2=service.getmenutwo(username);
			List<Map> menuinfolist3=service.getmenuthree(username);
			List<Map> userinfo=service.getLoginUser(username);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("onemenu", menuinfolist);
			map.put("twomenu", menuinfolist2);
			map.put("threemenu", menuinfolist3);
			map.put("userinfo", userinfo);
			JSONArray rows=JSONArray.fromObject(map);
			jsonArray.addAll(rows);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			ResponseUtil.write(response, jsonArray);
			}
		else{	
			request.setAttribute("errorMsg", "用户名或密码错误！");
		}
		return null;
	}
	
	
	/**
	 * 获取首页用户table 属性
	 * @param sc
	 * @param response
	 * @return
	 * @throws Exception
	 */
	

	@RequestMapping("/list")
	public String findall(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		//HttpSession session = request.getSession();
		//Userinfo user=(Userinfo) session.getAttribute("userinfo");
		String realName = request.getParameter("realName");
		List<Userinfo> userlist = service.getUserList(realName);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(userlist,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	/**
	 * 添加用户
	 * @param userinfo
	 * @param response
	 * @return
	 * @throws Exception
	 */
	int addID= 0;
	@RequestMapping("/creat")
	public String addloginUser(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		addID++;
		Integer Userrelust = 0;
		//获取主键
		SimpleDateFormat dfid = new SimpleDateFormat("yyyyMMdd");//设置日期格式
		String str=String.valueOf(addID);
		String userID = dfid.format(new Date()).toString()+"-"+str;
		userinfo.setUserID(userID);
		Timestamp addTime= new Timestamp(System.currentTimeMillis());
		userinfo.setIsvalid(0);
		userinfo.setAddtime(addTime);
		Userrelust = service.AddLoginUser(userinfo);
		JSONObject result=new JSONObject();
		if(Userrelust>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}																					

	
	
	
	
	/**
	 * 修改用户
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/update")
	public String updateUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Userinfo user = new Userinfo();
		user.setID(Integer.parseInt(request.getParameter("ID")));
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		user.setRealName(request.getParameter("realName"));
		user.setPerMemo(request.getParameter("perMemo"));
		user.setSource(request.getParameter("source"));
		user.setPhone(request.getParameter("phone"));
		int resultInt=service.updateByPrimaryKeySelective(user);
		JSONObject result=new JSONObject();
		if(resultInt>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
		
	
	}
	
	
	/**
	 * 删除用户
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String deleteloginUser(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer Userrelust = 0;
		 int ID = Integer.parseInt(request.getParameter("ID"));
		Userrelust = service.DeleteLoginUser(ID);
		if(Userrelust>0){
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
	 * 查询所用用户真实姓名 及ID
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/finduserRealName")
	public String dataRealNameComboList(HttpServletResponse response)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		JSONArray jsonArray=new JSONArray();
		List<Map> realnamelist=service.getUserRealName();
		JSONArray rows=JSONArray.fromObject(realnamelist);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
		
}

