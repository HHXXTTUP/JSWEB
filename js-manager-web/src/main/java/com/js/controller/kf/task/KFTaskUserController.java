package com.js.controller.kf.task;

import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hamcrest.core.IsNot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.PageBean;
import com.js.pojo.SCorp;
import com.js.pojo.SCorpWithBLOBs;
import com.js.pojo.Taskuser;
import com.js.pojo.loaduser;
import com.js.pojo.mytaskfp;
import com.js.pojo.usertaskcorp;
import com.js.service.kf.task.*;
import com.js.service.corp.ScorpService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月24日 下午10:34:42 * @version 1.0 * @parameter  * @since  * @return  */

@RequestMapping("taskuser")
@Controller
public class KFTaskUserController {

	@Resource
	private KFTaskUserService taskservice;
	@Resource
	private ScorpService corpservice;
	
	/**
	 * 用户登陆 进来 查看分配给自己的任务
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping("/taskinfo")
	@ResponseBody
	public String taskinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
//        Cookie[] cookies = request.getCookies();
//		String userID = "";
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
        
        
		List<Taskuser> taskuser = taskservice.taskuser(userID);
		Result result = new Result<>();
		result.setCode("1");
		result.setMsg("验证通过");
		result.setData(taskuser);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 用户进来点击 任务后 得到的任务规则
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/taskcontent")
	@ResponseBody
	public String taskcontent(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		int taskid = Integer.parseInt(request.getParameter("taskid"));
		List<Map> map = taskservice.taskcontent(taskid);
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
	 * 用户进来点击 任务后 得到的任务规则
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tasktgcontent")
	@ResponseBody
	public String tasktgcontent(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        
		int taskid = Integer.parseInt(request.getParameter("taskid"));	
		List<Map> map = taskservice.tasktgcontent(taskid);
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
	 * 用户进来点击 任务后 得到任务里 分配 给用户的企业
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/taskusercorp")
	@ResponseBody
	public String taskusercorp(HttpServletResponse response,HttpServletRequest request)throws Exception{
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
//		
    	String userinfo1 =request.getParameter("userinfo");
		JSONArray jsonArray8=JSONArray.fromObject(userinfo1);
	    JSONObject jsonObject10 = new JSONObject();
	    Object o2 = new Object();
	    loaduser user = new loaduser();
	    o2=jsonArray8.get(0);
	    jsonObject10=JSONObject.fromObject(o2);
	    user=(loaduser)JSONObject.toBean(jsonObject10, loaduser.class);
	    String realname = user.getRealname();
		
	    String userID = user.getUserid(); 
		int taskid = Integer.parseInt(request.getParameter("taskid"));
		int page = Integer.parseInt(request.getParameter("page")); 
		int rows = Integer.parseInt(request.getParameter("rows"));
		
		PageBean pageBean=new PageBean(page,rows);
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtil.isNotEmpty(request.getParameter("corpname"))){
			map.put("corpname", StringUtil.formatLike(request.getParameter("corpname")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("sxwlinkname"))){
			map.put("sxwlinkname",StringUtil.formatLike(request.getParameter("sxwlinkname")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("ShowType"))){
			map.put("ShowType",request.getParameter("ShowType"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("lookorder"))){
			map.put("lookorder", "s."+request.getParameter("lookorder"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("corpcate"))){
			map.put("corpcate", StringUtil.formatLike(request.getParameter("corpcate")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("desc"))){
			map.put("desc", request.getParameter("desc"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("istaskcorpid"))){
			map.put("istaskcorpid", Integer.parseInt(request.getParameter("istaskcorpid")));
		}
		
		if(StringUtil.isNotEmpty(request.getParameter("contentid"))){
			map.put("contentid", request.getParameter("contentid"));
		}
		
		
		if(StringUtil.isNotEmpty(request.getParameter("memostate"))){
			//备注状态为0  为未通过
			if(Integer.parseInt(request.getParameter("memostate"))==0){
				map.put("memostate", 0);
			}
			//备注状态为1  为通过
			if(Integer.parseInt(request.getParameter("memostate"))==1){
				map.put("memostate", 1);
			}
			//备注状态为2  为待审核通过
			if(Integer.parseInt(request.getParameter("memostate"))==2){
				map.put("memostate", 2);
			}
			//备注状态为3  为审核未通过
			if(Integer.parseInt(request.getParameter("memostate"))==3){
				map.put("memostate", 3);
			}
			//备注状态为4 为审核通过
			if(Integer.parseInt(request.getParameter("memostate"))==4){
				map.put("memostate", 3);
			}
			
			//备注状态为5 为已备注企业
			if(Integer.parseInt(request.getParameter("memostate"))==5){
				map.put("memostate", 5);
			}
			//备注状态为6 为未备注企业
			if(Integer.parseInt(request.getParameter("memostate"))==6){
				map.put("memostate", 6);
			}
			
		}
		
		if(StringUtil.isNotEmpty(request.getParameter("Datesource"))){
			map.put("Datesource", Integer.parseInt(request.getParameter("Datesource")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("isdczjhy"))){
			map.put("isdczjhy", Integer.parseInt(request.getParameter("isdczjhy")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("oldmemoinfo"))){
			map.put("oldmemoinfo", StringUtil.formatLike(request.getParameter("oldmemoinfo")));
		}
		map.put("taskid", taskid);
		
		
		if(Integer.parseInt(request.getParameter("Datesource")) == 1){
			map.put("userid", null);
		}else{
			map.put("userid", userID);
		}
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		
		List<usertaskcorp> maplist = taskservice.taskusercorp(map);
		Result result = new Result<>();
		if(maplist != null){
			//判断公司 是否存在 任务里面
			if(StringUtil.isNotEmpty(request.getParameter("istaskcorpid"))){
				result.setCode("2");
				result.setData(maplist);
				result.setMsg("存在公司");
			}
			else{
			result.setCode("1");
			result.setData(maplist);
			result.setMsg("不存在公司ID");
			}
		}

		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	/**
	 * 用户进来点击 任务后 得到任务里 分配 给用户的企业
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/allusercorp")
	@ResponseBody
	public String allusercorp(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
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
//		
		int page = Integer.parseInt(request.getParameter("page")); 
		int rows = Integer.parseInt(request.getParameter("rows"));
		
		int size = rows;
		int Nocount = (page-1)*rows;
		
	/*	PageBean pageBean=new PageBean(page,rows);*/
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtil.isNotEmpty(request.getParameter("corpname"))){
			map.put("corpname", StringUtil.formatLike(request.getParameter("corpname")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("sxwlinkname"))){
			map.put("sxwlinkname",StringUtil.formatLike(request.getParameter("sxwlinkname")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("ShowType"))){
			map.put("ShowType",request.getParameter("ShowType"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("lookorder"))){
			map.put("lookorder", "s."+request.getParameter("lookorder"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("corpcate"))){
			map.put("corpcate", StringUtil.formatLike(request.getParameter("corpcate")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("desc"))){
			map.put("desc", request.getParameter("desc"));
		}
/*		map.put("start", pageBean.getStart());
		map.put("size",  pageBean.getPageSize());*/
		map.put("size", size);
		map.put("Nocount", Nocount);
		
		List<usertaskcorp> maplist = taskservice.allusercorp(map);
		Result result = new Result<>();
		if(maplist != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(maplist);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	

	/**
	 * 报表功能  查看所有的任务
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/bbtaskall")
	@ResponseBody
	public String taskall(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		List<Map> map = taskservice.bbtaskall();
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
	
	@RequestMapping("/bbcorpinfo")
	@ResponseBody
	public String bbcorpinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
    	int taskid = Integer.parseInt(request.getParameter("taskid"));
		List<Map> map = taskservice.bbcorpinfo(taskid);
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
	 * 报表功能  查看分配给我的任务 以及我的任务分配
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mytaskfp")
	@ResponseBody
	public String mytaskfp(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        List<com.js.pojo.mytaskfp> map = new List<mytaskfp>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<mytaskfp> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public mytaskfp set(int index, mytaskfp element) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public mytaskfp remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<mytaskfp> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<mytaskfp> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<mytaskfp> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public mytaskfp get(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(int index, Collection<? extends mytaskfp> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends mytaskfp> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, mytaskfp element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(mytaskfp e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		

//		  Cookie[] cookies = request.getCookies();
//			String userID = "";
//			// 首次加载 没有选定用户 即登陆者分数
//			for (int i = 0; i < cookies.length; i++) {
//				if (cookies[i].getName().equals("userid")) {
//						userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
//					}
//				}	 
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
			
			
		if("20170718-1".equals(userID)){
			 map = taskservice.admintaskfp();
			}else{
			 map = taskservice.mytaskfp(userID);
			}

		Result result = new Result<>();
		if(map != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(map);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	/**
	 * 报表功能  查看分配给我的任务 以及我的任务分配
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mytaskfplocal")
	@ResponseBody
	public String mytaskfplocal(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        List<com.js.pojo.mytaskfp> map = new List<mytaskfp>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<mytaskfp> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public mytaskfp set(int index, mytaskfp element) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public mytaskfp remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<mytaskfp> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<mytaskfp> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<mytaskfp> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public mytaskfp get(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(int index, Collection<? extends mytaskfp> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends mytaskfp> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, mytaskfp element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(mytaskfp e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		

		  Cookie[] cookies = request.getCookies();
			String userID = "";
			// 首次加载 没有选定用户 即登陆者分数
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("userid")) {
						userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
					}
				}	 
//		String userinfo1 =request.getParameter("userinfo");
//		JSONArray jsonArray8=JSONArray.fromObject(userinfo1);
//	    JSONObject jsonObject10 = new JSONObject();
//	    Object o2 = new Object();
//	    loaduser user = new loaduser();
//	    o2=jsonArray8.get(0);
//	    jsonObject10=JSONObject.fromObject(o2);
//	    user=(loaduser)JSONObject.toBean(jsonObject10, loaduser.class);
//	    String userID = user.getUserid(); 
//	    String realname = user.getRealname();
			
			
//			if("20170718-1".equals(userID)){
			 map = taskservice.admintaskfp();
//			}else{
//			 map = taskservice.mytaskfp(userID);
//			}

		Result result = new Result<>();
		if(map != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(map);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	

	/**
	 * 报表功能  查看分配给我的任务 以及我的任务分配
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mytaskfpcorp")
	@ResponseBody
	public String mytaskfpcorp(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        
        
		String userinfo1 =request.getParameter("userinfo");
		JSONArray jsonArray8=JSONArray.fromObject(userinfo1);
	    JSONObject jsonObject10 = new JSONObject();
	    Object o2 = new Object();
	    loaduser user = new loaduser();
	    o2=jsonArray8.get(0);
	    jsonObject10=JSONObject.fromObject(o2);
	    user=(loaduser)JSONObject.toBean(jsonObject10, loaduser.class);
	    String userID = user.getUserid(); 
	    


    	
    	
        Map<String,Object> map=new HashMap<String,Object>();

		if(StringUtil.isNotEmpty(userID)){
			map.put("userID", userID);
		}
		if(StringUtil.isNotEmpty(request.getParameter("taskid"))){
			map.put("taskid", request.getParameter("taskid"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("corpname"))){
			map.put("corpname", StringUtil.formatLike(request.getParameter("corpname")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("sxwlinkname"))){
			map.put("sxwlinkname",StringUtil.formatLike(request.getParameter("sxwlinkname")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("ShowType"))){
			map.put("ShowType",request.getParameter("ShowType"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("lookorder"))){
			map.put("lookorder", "s."+request.getParameter("lookorder"));
		}
		
		if(StringUtil.isNotEmpty(request.getParameter("Datesource"))){
			map.put("Datesource", Integer.parseInt(request.getParameter("Datesource")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("corpcate"))){
			map.put("corpcate", StringUtil.formatLike(request.getParameter("corpcate")));
		}

		if(StringUtil.isNotEmpty(request.getParameter("desc"))){
			map.put("desc", request.getParameter("desc"));
		}

		String  area ="";
    	String  area1="";
    	String  area2 = "";
    	String arealist = "";
    	 if(StringUtil.isNotEmpty(request.getParameter("area2"))){
    		area = request.getParameter("area");
    		area1 = request.getParameter("area1");
    		area2=  request.getParameter("area2");
    		arealist =area + "%" + area1 + "%" + area2;
    		map.put("area", StringUtil.formatLike(area)); 
    		map.put("area1", StringUtil.formatLike(area1)); 
    		map.put("area2", StringUtil.formatLike(area2)); 
    		map.put("arealist", StringUtil.formatLike(arealist)); 
    	} if(StringUtil.isNotEmpty(request.getParameter("area1")) && !StringUtil.isNotEmpty(request.getParameter("area2"))){
    		area = request.getParameter("area");
    		area1 = request.getParameter("area1");
    		arealist = area + "%" + area1 ;
    		map.put("area", StringUtil.formatLike(area)); 
    		map.put("area1", StringUtil.formatLike(area1)); 
    		map.put("area2", "%%"); 
    		map.put("arealist", StringUtil.formatLike(arealist)); 
    		
    	}if(StringUtil.isNotEmpty(request.getParameter("area")) && !StringUtil.isNotEmpty(request.getParameter("area2")) && !StringUtil.isNotEmpty(request.getParameter("area1")) ) {
    		area = request.getParameter("area");
    		arealist = area ;
    		map.put("area", StringUtil.formatLike(area)); 
    		map.put("area1", "%%"); 
    		map.put("area2", "%%"); 
    		map.put("arealist", StringUtil.formatLike(arealist)); 
    	}
    	if(!StringUtil.isNotEmpty(request.getParameter("area")) && !StringUtil.isNotEmpty(request.getParameter("area2")) && !StringUtil.isNotEmpty(request.getParameter("area1")) ) {
    		area = request.getParameter("area");
    		arealist = area ;
    		map.put("area",  "%%"); 
    		map.put("area1", "%%"); 
    		map.put("area2", "%%"); 
    		map.put("arealist","%%"); 
    	}
		
		
		List<Map>  maplist = new List<Map>() 

		{
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<Map> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Map set(int index, Map element) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Map remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<Map> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<Map> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<Map> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Map get(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(int index, Collection<? extends Map> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends Map> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, Map element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(Map e) {
				// TODO Auto-generated method stub
				return false;
			}
		};

		if("20170718-1".equals(userID)){
			maplist = taskservice.adminfpcorp(map);
		}
		else{
			maplist = taskservice.mytaskfpcorp(map);
		}


		Result result = new Result<>();
		if(map != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(maplist);
		}
		
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}

	
	
	
	/**
	 * 报表功能  点击ID 查看企业信息
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findcorpinfo")
	@ResponseBody
	public String findcorpinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
    	int corpid = Integer.parseInt(request.getParameter("corpid"));
    	SCorpWithBLOBs  map =  corpservice.selectByPrimaryKey(corpid);
		Result result = new Result<>();
		if(map != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(map);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	/**
	 * 报表功能  点击ID 查看企业信息
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findtaskgroup")
	@ResponseBody
	public String findtaskgroup(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        
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
        
    	Map  map =  taskservice.findtaskgroup(userID, taskid);
		Result result = new Result<>();
		if(map != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(map);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	
	
	
	
	
}
