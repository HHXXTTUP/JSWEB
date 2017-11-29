package com.js.controller.corp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.controller.DateJsonValueProcessor;
import com.js.mapper.SAllcorpMapper;
import com.js.mapper.SDcbuymemoMapper;
import com.js.pojo.SAllcorp;
import com.js.pojo.SAllcorppermemo;
import com.js.pojo.kfMymemoinfo;
import com.js.pojo.oldmemoinfo;
import com.js.service.S_AllCorpPerMemoService;
import com.js.service.SdcbuymemoService;
import com.js.service.corp.SallcorpService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月6日 上午9:31:03 * @version 1.0 * @parameter  * @since  * @return  */



@RequestMapping("allcorp")
@Controller
public class S_AllCorpPerMemoController {
	@Resource
	private SAllcorpMapper mapper;
	@Resource
	private SallcorpService service;
	
	@Resource
	private SdcbuymemoService dcbuyservice;
	
	
	@RequestMapping("/findcorpcontent")
	@ResponseBody
	public String findcorpcontent(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		/*Cookie[] cookies = request.getCookies();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}	*/
		String  corpname = request.getParameter("corpname");
		List<Map> allcorpcontent =  mapper.getcorpcontent(corpname);
		Result result = new Result<>();
		if(allcorpcontent != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(allcorpcontent);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	@RequestMapping("/finddcbuycontent")
	@ResponseBody
	public String finddcbuycontent(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		/*Cookie[] cookies = request.getCookies();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}	*/
		int  corpid = Integer.parseInt(request.getParameter("corpid"));
		List<Map> dcbuycontent =  mapper.getdcbuycontent(corpid);
		Result result = new Result<>();
		if(dcbuycontent != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(dcbuycontent);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	
	
	
	@RequestMapping("/findcorpmemo")
	@ResponseBody
	public String findcorpmemo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		/*Cookie[] cookies = request.getCookies();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}	*/
        String type = request.getParameter("type");
        int  corpid =Integer.parseInt(request.getParameter("corpid"));	
        List<kfMymemoinfo> memoinfo = new List<kfMymemoinfo>() {
			
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
			public List<kfMymemoinfo> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public kfMymemoinfo set(int index, kfMymemoinfo element) {
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
			public kfMymemoinfo remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public ListIterator<kfMymemoinfo> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ListIterator<kfMymemoinfo> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Iterator<kfMymemoinfo> iterator() {
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
			public kfMymemoinfo get(int index) {
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
			public boolean addAll(int index, Collection<? extends kfMymemoinfo> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends kfMymemoinfo> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void add(int index, kfMymemoinfo element) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean add(kfMymemoinfo e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
			
		
	
        if("corp".equals(type)){
        	memoinfo = service.findcorpmemo(corpid);
        } if ("linkman".equals(type)){
        	
        	memoinfo = service.findcorplinkmemo(corpid);
        }
		Result result = new Result<>();
		if(memoinfo != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(memoinfo);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	@RequestMapping("/finddcbuymemo")
	@ResponseBody
	public String finddcbuymemo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		/*Cookie[] cookies = request.getCookies();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}	*/
        String  corpname =StringUtil.formatLike((request.getParameter("corpname")));	
        List<kfMymemoinfo> memoinfo   = dcbuyservice.finddcbuymemo(corpname);

		Result result = new Result<>();
		if(memoinfo != null){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(memoinfo);
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	
	
	
	
}
