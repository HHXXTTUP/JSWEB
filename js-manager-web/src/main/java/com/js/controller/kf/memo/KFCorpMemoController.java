package com.js.controller.kf.memo;

import java.net.URLDecoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.controller.DateJsonValueProcessor;
import com.js.controller.kf.taskcontent.KFContentInfoController;
import com.js.pojo.KFSPMemoInfo;
import com.js.pojo.KF_My_MemoTime;
import com.js.pojo.KfAllotExample;
import com.js.pojo.KfCorpmemo;
import com.js.pojo.KfCorpsign;
import com.js.pojo.KfExaminememo;
import com.js.pojo.PageBean;
import com.js.pojo.SCorp;
import com.js.pojo.Taskuser;
import com.js.pojo.UserCorpMemo;
import com.js.pojo.groupsuccess;
import com.js.pojo.kfMymemoinfo;
import com.js.pojo.loaduser;
import com.js.service.kf.trackcorp.*;
import com.js.service.KFCorpSignService;
import com.js.service.kf.memo.*;
import com.js.service.kf.task.*;
import com.js.service.kf.taskcontent.KFContentInfoService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月26日 上午10:01:08 * @version 1.0 * @parameter  * @since  * @return  */


@RequestMapping("corpmemo")
@Controller
public class KFCorpMemoController {
	@Resource
	private KFExamineService exservice;
	@Resource
	private KFCorpMemoService memoservice;
	@Resource
	private KFCorpSignService signservice;
	@Resource 
	private KFBeSpokenService spokenService;
	@Resource
	private KFContentInfoService contentservice;
	
	/**
	 * 用户登陆 选择的任务 后对应自己备注的企业 
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/taskmemocorp")
	@ResponseBody
	public String taskmemocorp(HttpServletResponse response,HttpServletRequest request)throws Exception{
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
		List<Map> map =  memoservice.taskmemocorp(userID, taskid);
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
	 * 用户登陆 选择的任务 后对应自己备注的企业  点击进去查看备注详细信息
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addtaskmemo")
	@ResponseBody
	public String addtaskmemo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
		Cookie[] cookies = request.getCookies();
//		String userID = "";
//		String realname = "";
//		// 首次加载 没有选定用户 即登陆者分数
//		for (int i = 0; i < cookies.length; i++) {
//			if (cookies[i].getName().equals("userid")) {
//					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
//				}
//			if (cookies[i].getName().equals("realname")) {
//				realname = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
//			}
//			
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
	    int linkmanid = 0;
	    
		if(StringUtil.isNotEmpty(request.getParameter("linkmanid"))){
			 linkmanid = Integer.parseInt(request.getParameter("linkmanid"));
		}
	    
	    
	    
	    
		String linkname = request.getParameter("linkname");	
		String linkphone =request.getParameter("linkphone");	
		int taskid = Integer.parseInt(request.getParameter("taskid"));	
		int corpid = Integer.parseInt(request.getParameter("corpid"));	
		String glid = request.getParameter("glid");
    	Date Createtime = StringUtil.dateTimeString2Dateinfo(request.getParameter("createtime"));
    	
		String contentmemo = request.getParameter("contentmemo");
		int topgroupid = Integer.parseInt(request.getParameter("topgroupid"));
		int groupid =  Integer.parseInt(request.getParameter("groupid"));
	
		KfCorpmemo memo = new KfCorpmemo();
		KfExaminememo ex = new KfExaminememo();
		
		int ppd = 0;
		int memodd = 0;
		int bbd = 0;
		
//			ex.setTaskid(taskid);
//			ex.setCorpid(corpid);
//			ex.setGroupid(groupid);
//			ex.setUserid(userID);
//			ex.setTopgroupid(topgroupid);
//			ex.setGlid(glid);
//			ex.setState(0);
//			ex.setShstate(0);
//			ex.setAddtime(Createtime);
//			if("update".equals(request.getParameter("op"))){
//
//			}else{
//				ppd = exservice.insert(ex);
//			}
		memo.setLinkmanid(linkmanid);
		memo.setCorpid(corpid);
		memo.setTaskid(taskid);
		memo.setCorpcontentmemo(contentmemo);
		memo.setUsername(realname);
		memo.setUserid(userID);
		memo.setGroupid(groupid);
		memo.setTopgroupid(topgroupid);
		memo.setLinkname(linkname);
		memo.setLinkphone(linkphone);
		memo.setGlid(glid);
		memo.setCreatetime(Createtime);
		
		
		String tgcontentidlist =  request.getParameter("tgcontentid");
		String contentinfoidList = request.getParameter("contentinfoid");
		if("90".equals(tgcontentidlist)){
			 memo.setState(0);
			 memo.setShstate(0);
		}
		if(!"90".equals(contentinfoidList)){
		int ddp = 0;
		if(StringUtil.isNotEmpty(request.getParameter("contentinfoid"))){
    	String[] contentinfoid =   contentinfoidList.split(",");
    	String[] tgcontentinfoid = tgcontentidlist.split(",");
    	 outer:
    	 for (int j = 0; j < contentinfoid.length; j++) {
    		 
    		 for (int i = 0; i < tgcontentinfoid.length; i++) {
//    			 System.out.println("备注ID"+contentinfoid[j]+";通过ID:"+tgcontentinfoid[i]);
        		 if(Integer.parseInt(contentinfoid[j]) ==Integer.parseInt(tgcontentinfoid[i])){
        			 memo.setState(1);
        			 memo.setShstate(2);
        			 break outer;
        		 }else{
        			 memo.setState(0);
        			 memo.setShstate(2);
        		 }
    		 }
    	  } 
    	 
		}
		//未填写 备注标签
		else{
			 memo.setState(0);
			 memo.setShstate(2);
		}
		
	 }
		 
    	 memo.setCorpcontent(contentinfoidList);
		 if("update".equals(request.getParameter("op"))){
			 memo.setId(Integer.parseInt(request.getParameter("corpmemoid")));
			 memodd = memoservice.updateByPrimaryKeySelective(memo);
		 }else{
			 memodd = memoservice.insert(memo);
		 }
		
		if(StringUtil.isNotEmpty(request.getParameter("spokenid"))){
			int upstate = spokenService.updatestate(Integer.parseInt(request.getParameter("spokenid")));
		}
		Result result = new Result<>();
		if(memodd >0  ){
		result.setCode("1");
		result.setMsg("备注成功");
		}else{
			result.setCode("0");
			result.setMsg("备注失败");
		}
		result.setData(memodd);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	
	
	
	
	/**
	 * 删除
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/detaskmemo")
	@ResponseBody
	public String detaskmemo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
        
        int memoid =  Integer.parseInt(request.getParameter("memoid"));	
        int ppd = memoservice.deleteByPrimaryKey(memoid);
        Result result = new Result<>();
		if(ppd >0 ){
		result.setCode("1");
		result.setMsg("删除成功");
		}else{
			result.setCode("0");
			result.setMsg("删除失败");
		}
		
		result.setData(null);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
        }
	

	/**
	 * 通过时间查询 备注
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/taskmemocorpinfo")
	@ResponseBody
	public String taskmemocorpinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
        
        
        String userid = request.getParameter("userid");
        int taskid = Integer.parseInt(request.getParameter("taskid"));
        int corpid = Integer.parseInt(request.getParameter("corpid"));

    	List<KFSPMemoInfo> spmemo = memoservice.taskmemocorpinfo(userid, taskid, corpid);
        Result result = new Result<>();
		if(spmemo!=null ){
		result.setCode("1");
		result.setData(spmemo);
		result.setMsg("获取成功");
		}else{
			result.setCode("0");
			result.setMsg("获取失败");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
        }
	
	
	
	
	/**
	 * 通过时间查询 备注
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findmemotime")
	@ResponseBody
	public String findmemotime(HttpServletResponse response,HttpServletRequest request)throws Exception{
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
    	Date starttime = StringUtil.dateTimeString2Dateinfo(request.getParameter("starttime"));
    	Date endtime =   StringUtil.dateTimeString2Dateinfo(request.getParameter("endtime"));
    	
    	List<kfMymemoinfo> memoinfo = memoservice.taskmemotime(userID, starttime, endtime,taskid);
    	for (int i = 0; i < memoinfo.size(); i++) {
    	if(StringUtil.isNotEmpty(memoinfo.get(i).getMemoid())){
			String contentinfoidlist = memoinfo.get(i).getMemoid();
			String[] idlist = contentinfoidlist.split(",");
			String dd= "";
			String mm = "";
			for (int j = 0; j < idlist.length; j++) {
				dd = contentservice.ContentnName(Integer.parseInt(idlist[j]));
				if(j==0){
					mm = dd;
				}else{
				mm = mm + ","+dd;
				}
			}

			 memoinfo.get(i).setMemoname(mm);
    	 }
		}
    	
        Result result = new Result<>();
		if(memoinfo!=null ){
		result.setCode("1");
		result.setData(memoinfo);
		result.setMsg("获取成功");
		}else{
			result.setCode("0");
			result.setMsg("获取失败");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
        }
	
	/**
	 * 通过企业 查询 备注
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findmemocorp")
	@ResponseBody
	public String findmemocorp(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
    	int taskid  =Integer.parseInt(request.getParameter("taskid"));
    	int corpid  =Integer.parseInt(request.getParameter("corpid"));
    	List<KF_My_MemoTime> memotime = memoservice.taskmemofocorp(taskid, corpid);
        Result result = new Result<>();
		if(memotime != null ){
		result.setCode("1");
		result.setData(memotime);
		result.setMsg("获取成功");
		}else{
			result.setCode("0");
			result.setMsg("获取失败");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
        }

	

	/**
	 *  报表功能  显示个人信息状况
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/taskuserInfo")
	@ResponseBody
	public String taskuserInfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
        

		int taskid = Integer.parseInt(request.getParameter("taskid"));	
		List<UserCorpMemo> usercorp =  memoservice.taskmemouser(taskid);
		Result result = new Result<>();
		if (usercorp != null){
			result.setCode("1");
			result.setData(usercorp);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	

	
	
	
	
	
	/**
	 *  报表功能  显示组下完成状况
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/groupmemoinfo")
	@ResponseBody
	public String groupmemoinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
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
		List<Map> groupmemo =  memoservice.groupmemoinfo(userID, taskid);
		Result result = new Result<>();
		if (groupmemo != null){
			result.setCode("1");
			result.setData(groupmemo);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	

	
	
	/**
	 *  报表功能  显示组下完成状况
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/groupmaninfo")
	@ResponseBody
	public String groupmaninfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
        
        
		int taskid = Integer.parseInt(request.getParameter("taskid"));	
		int groupid = Integer.parseInt(request.getParameter("groupid"));	
		List<Map> groupman =  memoservice.groupmaninfo(taskid, groupid);
		Result result = new Result<>();
		if (groupman != null){
			result.setCode("1");
			result.setData(groupman);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	

	
	
	/**
	*  报表功能  显示组下完成状况
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/groupoderinfo")
	@ResponseBody
	public String groupoderinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
        
		int taskid = Integer.parseInt(request.getParameter("taskid"));	
		int groupid = Integer.parseInt(request.getParameter("groupid"));	
		List<groupsuccess> groupoderinfo =  memoservice.groupoderinfo(taskid, groupid);
		Result result = new Result<>();
		if (groupoderinfo != null){
			result.setCode("1");
			result.setData(groupoderinfo);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	

	
	
	
	

	/**
	 *  报表功能  显示时间段完成状况
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/memotime")
	@ResponseBody
	public String memotime(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
        
        
		int taskid = Integer.parseInt(request.getParameter("taskid"));	
		int day = Integer.parseInt(request.getParameter("day"));	
		List<Map> memotime =  memoservice.getmemocountDay(taskid, day);
		Result result = new Result<>();
		if (memotime != null){
			result.setCode("1");
			result.setData(memotime);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	

	/**
	 *  报表功能  显示时间段完成状况
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/memocorpcate")
	@ResponseBody
	public String memocorpcate(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
        
        
		int taskid = Integer.parseInt(request.getParameter("taskid"));	

		List<Map> memocate =  memoservice.getmemocorpcate(taskid);
		Result result = new Result<>();
		if (memocate != null){
			result.setCode("1");
			result.setData(memocate);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	
	
	
	
	/**
	 *  企业所有备注消息
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/memocorpinfo")
	@ResponseBody
	public String memocorpinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
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
		int corpid = Integer.parseInt(request.getParameter("corpid"));	
		List<kfMymemoinfo> memoinfo =  memoservice.memocorpinfo(corpid);
		for (int i = 0; i < memoinfo.size(); i++) {
			if(StringUtil.isNotEmpty(memoinfo.get(i).getMemoid())){
			String contentinfoidlist = memoinfo.get(i).getMemoid();
			String[] idlist = contentinfoidlist.split(",");
			String dd= "";
			String mm = "";
			for (int j = 0; j < idlist.length; j++) {
				dd = contentservice.ContentnName(Integer.parseInt(idlist[j]));
				if(j==0){
					mm = dd;
				}else{
				mm = mm + ","+dd;
				}
			}
			 memoinfo.get(i).setMemoname(mm);
			}
		}
	
		Result result = new Result<>();
		if (memoinfo != null){
			result.setCode("1");
			result.setData(memoinfo);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	
	
	
	
	
	
	
	/**
	 *  企业 查询 备注信息
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/memoselect")
	@ResponseBody
	public String memoselect(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");

		Map<String,Object> map=new HashMap<String,Object>();
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
		
		if(StringUtil.isNotEmpty(request.getParameter("taskid"))){
			map.put("taskid",Integer.parseInt((request.getParameter("taskid"))));
		}
		if(StringUtil.isNotEmpty(request.getParameter("corpname"))){
			map.put("corpname",StringUtil.formatLike(URLDecoder.decode(request.getParameter("corpname"), "UTF-8")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("sxwlinkname"))){
			map.put("sxwlinkname",StringUtil.formatLike(request.getParameter("sxwlinkname")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("starttime"))){
			map.put("starttime",  StringUtil.dateTimeString2Dateinfo(request.getParameter("starttime")));
			map.put("endtime",  StringUtil.dateTimeString2Dateinfo(request.getParameter("endtime")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("ShowType"))){
			map.put("ShowType",request.getParameter("ShowType"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("memousername"))){
			map.put("memousername",request.getParameter("memousername"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("lookorder"))){
			map.put("lookorder", "s."+request.getParameter("lookorder"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("corpcate"))){
			map.put("corpcate", StringUtil.formatLike(request.getParameter("corpcate")));
		}
		if(StringUtil.isNotEmpty(request.getParameter("contentid"))){
			map.put("contentid",request.getParameter("contentid"));
		}
		if(StringUtil.isNotEmpty(request.getParameter("memostate"))){
			map.put("memostate", Integer.parseInt((request.getParameter("memostate"))));
		}
		if(StringUtil.isNotEmpty(request.getParameter("desc"))){
			map.put("desc", request.getParameter("desc"));
		}
		List<kfMymemoinfo> memoinfo =  memoservice.memoselect(map);
		
		for (int i = 0; i < memoinfo.size(); i++) {
			if(StringUtil.isNotEmpty(memoinfo.get(i).getMemoid())){
			String contentinfoidlist = memoinfo.get(i).getMemoid();
			String[] idlist = contentinfoidlist.split(",");
			String dd= "";
			String mm = "";
			for (int j = 0; j < idlist.length; j++) {
				dd = contentservice.ContentnName(Integer.parseInt(idlist[j]));
				if(j==0){
					mm = dd;
				}else{
				mm = mm + ","+dd;
				}
			}
			 memoinfo.get(i).setMemoname(mm);
			}
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(memoinfo,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}	
	
	
	
	
	
	
	
	/**
	 * 待审核
	 * @param response
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/shmemoinfo")
	@ResponseBody
	public String shmemoinfo(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        int taskid = Integer.parseInt(request.getParameter("taskid"));	
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
	    
	    List<kfMymemoinfo> memoinfo = memoservice.shmemoinfo(userID, taskid);
	    for (int i = 0; i < memoinfo.size(); i++) {
			if(StringUtil.isNotEmpty(memoinfo.get(i).getMemoid())){
			String contentinfoidlist = memoinfo.get(i).getMemoid();
			String[] idlist = contentinfoidlist.split(",");
			String dd= "";
			String mm = "";
			for (int j = 0; j < idlist.length; j++) {
				dd = contentservice.ContentnName(Integer.parseInt(idlist[j]));
				if(j==0){
					mm = dd;
				}else{
				mm = mm + ","+dd;
				}
			}
			 memoinfo.get(i).setMemoname(mm);
			}
		}
	    Result result = new Result<>();
		if (memoinfo != null){
			result.setCode("1");
			result.setData(memoinfo);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	    
	}
	
	@RequestMapping("/shupdate")
	@ResponseBody
	public String shupdate(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        
        int corpmemoid = Integer.parseInt(request.getParameter("corpmemoid"));	
        int shstate = Integer.parseInt(request.getParameter("shstate"));	
        
        int ppd = memoservice.updatestate(corpmemoid, shstate);
        Result result = new Result<>();
		if (ppd >-1){
			result.setCode("1");
			result.setData(ppd);
			result.setMsg("验证通过");
		}
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
        
	}	
}
