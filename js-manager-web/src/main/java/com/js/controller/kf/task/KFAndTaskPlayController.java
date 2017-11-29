package com.js.controller.kf.task;

import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.mapper.KfAndtaskallotMapper;
import com.js.pojo.KfAllot;
import com.js.pojo.KfAndtaskallot;
import com.js.pojo.Userinfo;
import com.js.service.kf.task.*;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONObject;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月17日 上午11:54:22 * @version 1.0 * @parameter  * @since  * @return  */


@Controller
@RequestMapping("taskplay")
public class KFAndTaskPlayController {
	@Resource
	private KFAndTaskPlay service;
	@Resource
	private KFTaskService taskservice;
	
	@Resource
	private KFTaskUserService allottaskservice;
	

	/**
	 * 任务下达
	 * @param userinfo
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/creatplay")
	public String creattask(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfAndtaskallot  play = new KfAndtaskallot();
		Cookie[] cookies = request.getCookies();
		String userID = "";
		String username = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			if (cookies[i].getName().equals("realname")) {
					username = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		if(  "error".equals(request.getParameter("taskid")) || "error".equals(request.getParameter("allotid")) || "error".equals(request.getParameter("contentid"))){
			JSONObject result=new JSONObject();
			result.put("success", false);
			ResponseUtil.write(response, result);
			return null;
		}else{
		
			String dd = request.getParameter("taskid");
		play.setCreateman(username);
		play.setCreateuserid(userID);
		play.setCreatetime(new Date());
		play.setCreatememo(request.getParameter("creatememo"));
		play.setTaskid(Integer.parseInt(request.getParameter("taskid")));
		play.setAllotid(Integer.parseInt(request.getParameter("allotid")));
		play.setContentid(Integer.parseInt(request.getParameter("contentid")));
		play.setTgcontentid(Integer.parseInt(request.getParameter("tgcontentid")));
	
		int upstate = taskservice.updatestate(Integer.parseInt(request.getParameter("taskid")), "已分配");
		resultpp = service.insert(play);
		JSONObject result=new JSONObject();
		if(resultpp>0 && upstate>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
		}
	}	
	
	
	
	@RequestMapping("/creatplayxzz")
	public String creatplayxzz(Userinfo userinfo,HttpServletResponse response,HttpServletRequest request) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Integer resultpp = 0;
		KfAndtaskallot  play = new KfAndtaskallot();
		Cookie[] cookies = request.getCookies();
		String userID ="";
		String username = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			if (cookies[i].getName().equals("realname")) {
					username = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		
		int taskid =  Integer.parseInt(request.getParameter("taskid"));
		int allotid =  Integer.parseInt(request.getParameter("allotid"));
		KfAndtaskallot kt = allottaskservice.findtaskinfo(taskid);
		int tgcontentid = kt.getTgcontentid();
		int contentid = kt.getContentid();
		String creatememo = kt.getCreatememo();
		play.setCreateman(username);
		play.setCreateuserid(userID);
		play.setCreatetime(new Date());
		play.setCreatememo(creatememo);
		play.setTaskid(taskid);
		play.setAllotid(allotid);
		play.setContentid(contentid);
		play.setTgcontentid(tgcontentid);

		resultpp = service.insert(play);
		JSONObject result=new JSONObject();
		if(resultpp>0 ){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
		}

	
	
	
	
	
	
	
}
