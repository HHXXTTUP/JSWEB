package com.js.controller.corp;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KSeachinfo;
import com.js.pojo.PageBean;
import com.js.pojo.SAllcorp;
import com.js.pojo.SAllcorpWithBLOBs;
import com.js.pojo.SCorp;
import com.js.pojo.SCorpWithBLOBs;
import com.js.service.KSeachService;
import com.js.service.corp.SallcorpService;
import com.js.service.corp.ScorpService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.Result;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

@Controller
@RequestMapping("s_corplist")
public class S_CorpController {
	@Autowired
	private ScorpService scorpservice;
	@Autowired
	private KSeachService kseach;
	@Autowired
	private SallcorpService sallservice;
	/**
	 * 获取首页table 属性
	 * @param sc
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String findall(SCorp sc,HttpServletResponse response)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		List<SCorp> listall=scorpservice.FindAll();
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(listall,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	/**请求 下拉框属性
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findkeyname")
	public String findkeyname(HttpServletResponse response)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		JSONArray jsonArray=new JSONArray();
		
		List<KSeachinfo> kseachName=kseach.FindSeachkey();
		JSONArray rows=JSONArray.fromObject(kseachName);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	@RequestMapping("/Seachlist")
	public String seachlist(HttpServletResponse response,HttpServletRequest request ) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
//		int id =Integer.parseInt(request.getParameter("id"));
		
		int page = Integer.parseInt(request.getParameter("page")); 
		int rows = Integer.parseInt(request.getParameter("rows"));
		
		PageBean pageBean=new PageBean(page,rows);
		Integer id = null;
		String corpName =StringUtil.formatLike("公司");
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id", id);
		map.put("corpName",corpName );

		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		
		List<SCorpWithBLOBs> saleChanceList=scorpservice.Find(map);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(saleChanceList,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return  null;
	}
	
	@RequestMapping("/Findcorp")
	public String Findcorp(HttpServletResponse response,HttpServletRequest request ) throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        Result result = new Result<>();
		if(StringUtil.isNotEmpty(request.getParameter("corpid"))){
			int corpid = Integer.parseInt(request.getParameter("corpid"));
		       Map map = scorpservice.Findcorp(corpid);
		       if (map != null){
		    	   result.setCode("1");
					result.setMsg("验证通过");
					result.setData(map);
		       }
		
		}else{
			
			 	result.setCode("0");
				result.setMsg("error");
			
		}
	       	JsonConfig jsonConfig=new JsonConfig();
			jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
			JSONArray jsonArray1=JSONArray.fromObject(result,jsonConfig);
			ResponseUtil.write(response, jsonArray1);
			return null;
	}
	
	
	
	
	
	
	/**
	 * 查询全部
	 * @param sc
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/FindCorpInfp")
	public String FindCorpInfp(SCorp sc,HttpServletResponse response)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		List<SCorpWithBLOBs> listall=scorpservice.FindCorpInfp();
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(listall,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	@RequestMapping("/FindtaskCorp")
	public String FindtaskCorp(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		Cookie[] cookies = request.getCookies();
		String userID = "";
		// 首次加载 没有选定用户 即登陆者分数
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}	
		int taskid = Integer.parseInt(request.getParameter("taskid"));
		
		List<SCorpWithBLOBs> listall=scorpservice.FindTaskCorp(userID,taskid);
		Result result = new Result<>();
		result.setCode("1");
		result.setMsg("验证通过");
		result.setData(listall);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	/**
	 *  修改企业信息        mysql
	 * @param sc
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/upcorpMysql")
	public String upcorpMysql(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds1");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        SCorpWithBLOBs sb = new SCorpWithBLOBs();
        int corpid = Integer.parseInt(request.getParameter("Corpid"));
        sb.setId(corpid);
        if(StringUtil.isNotEmpty(request.getParameter("CorpName"))){
        	sb.setCorpname(request.getParameter("CorpName")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("Address"))){
        	sb.setAddress(request.getParameter("Address")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("CorpCateWu"))){
        	sb.setCorpcatewu(request.getParameter("CorpCateWu")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("ProdMain"))){
        	sb.setProdmain(request.getParameter("ProdMain")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("Memo"))){
        	sb.setMemo(request.getParameter("Memo")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("CorpFax"))){
        	sb.setCorpfax(request.getParameter("CorpFax")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("CorpPhone"))){
        	sb.setCorpphone(request.getParameter("CorpPhone")); 
        }
        
		int count=scorpservice.updateByPrimaryKeySelective(sb);
		Result result = new Result<>();
		if(count >-1){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(count);
		}
		
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	/**
	 *  修改企业信息        SQL 修改企业
	 * @param sc
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/upcorpMssql")
	public String upcorpMssql(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        SCorpWithBLOBs sb = new SCorpWithBLOBs();
        int corpid = Integer.parseInt(request.getParameter("Corpid"));
        String oldcorpname = request.getParameter("oldcorpname");
        sb.setId(corpid);
        if(StringUtil.isNotEmpty(request.getParameter("CorpName"))){
        	sb.setContname(request.getParameter("CorpName")); 
        	sallservice.upcorpname(oldcorpname, request.getParameter("CorpName"));
        }
        if(StringUtil.isNotEmpty(request.getParameter("Address"))){
        	sb.setAddress(request.getParameter("Address")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("CorpCateWu"))){
        	sb.setCorpcatewu(request.getParameter("CorpCateWu")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("ProdMain"))){
        	sb.setProdmain(request.getParameter("ProdMain")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("Memo"))){
        	sb.setMemo(request.getParameter("Memo")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("CorpFax"))){
        	sb.setContfax(request.getParameter("CorpFax")); 
        }
        if(StringUtil.isNotEmpty(request.getParameter("CorpPhone"))){
        	sb.setCorpphone(request.getParameter("CorpPhone")); 
        }
        
		int count=scorpservice.updateByPrimaryKeySelective(sb);
		Result result = new Result<>();
		if(count >-1){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(count);
		}
		
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}

	
	 /*  修改企业信息        SQL 修改企业  联系人
	 * @param sc
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/upcorplxrMssql")
	public String upcorplxrMssql(HttpServletResponse response,HttpServletRequest request)throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
        SAllcorpWithBLOBs  swb = new SAllcorpWithBLOBs();
        int corpid = Integer.parseInt(request.getParameter("Corpid"));
		swb.setID(corpid);
        if(StringUtil.isNotEmpty(request.getParameter("linkman"))){ 
        	swb.setLinkMan(request.getParameter("linkman"));
        }
        if(StringUtil.isNotEmpty(request.getParameter("jobcate"))){
        	swb.setJobCate(request.getParameter("jobcate"));
        }
        if(StringUtil.isNotEmpty(request.getParameter("phone"))){
        	swb.setPhone(request.getParameter("phone"));
        }
        if(StringUtil.isNotEmpty(request.getParameter("mobile"))){
        	swb.setMobile(request.getParameter("mobile"));
        }
      
		int count=sallservice.updateByPrimaryKeySelective(swb);
		Result result = new Result<>();
		if(count >-1){
			result.setCode("1");
			result.setMsg("验证通过");
			result.setData(count);
		}
		
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray=JSONArray.fromObject(result,jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}

}