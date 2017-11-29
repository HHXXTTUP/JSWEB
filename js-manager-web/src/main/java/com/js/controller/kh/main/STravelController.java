package com.js.controller.kh.main;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.js.controller.DateJsonValueProcessor;
import com.js.pojo.KfGroupinfo;
import com.js.pojo.KhPlan;
import com.js.pojo.KhPoint;
import com.js.pojo.KhTime;
import com.js.pojo.News;
import com.js.pojo.SAdminworklist;
import com.js.pojo.SAdminworklistExample;
import com.js.pojo.SAdminworklistWithBLOBs;
import com.js.pojo.SAllcorp;
import com.js.pojo.SAllcorpuseredit;
import com.js.pojo.SAlllinkcorp;
import com.js.pojo.SDcbuymemo;
import com.js.pojo.SHtcorpmemo;
import com.js.pojo.SMfbbsfile;
import com.js.pojo.STravel;
import com.js.service.FcorpService;
import com.js.service.KhplanService;
import com.js.service.NewsService;
import com.js.service.STravelService;
import com.js.service.SadminworkService;
import com.js.service.SallCorpUserEditService;
import com.js.service.corp.SallcorpService;
import com.js.service.SalllinkcorpService;
import com.js.service.SbuyinfoService;
import com.js.service.corp.ScorpService;
import com.js.service.SdcbuymemoService;
import com.js.service.ShtcorpmemoService;
import com.js.service.SmfbbsfileService;
import com.js.service.SmoneyService;
import com.js.service.SmoneymemoService;
import com.js.service.SprodinfoService;
import com.js.service.UcorpuserService;
import com.js.service.UserinfoService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;
import com.js.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * * @author 作者 E-mail: * @date 创建时间：2017年8月25日 上午10:16:18 * @version 1.0
 * * @parameter * @since * @return
 */

@Controller
@RequestMapping("kh")
public class STravelController {
	@Resource
	private STravelService service;
	@Resource 
	private SadminworkService sadminservice;
	@Resource
	private KhplanService khplanservice;
	@Resource
	private NewsService newservice;
	@Resource
	private SmfbbsfileService smfservice;
	@Resource
	private SalllinkcorpService sallservice;
	@Resource
	private SallcorpService sallcorpservice;
	@Resource
	private SallCorpUserEditService salleditcorpservice;
	@Resource
	private ShtcorpmemoService shtservice;
	@Resource
	private SdcbuymemoService sdcbuyservice;
	@Resource
	private SmoneyService smoneyService;
	@Resource
	private SmoneymemoService smonrymemeoservice;
	@Resource
	private SprodinfoService sprodinfoservice;
	@Resource
	private ScorpService scorpservoce;
	@Resource
	private FcorpService fcorpservice;
	@Resource
	private UcorpuserService ucorpservice;
	@Resource
	private SbuyinfoService sbuyservice;


	
	/**
	 * 动态刷新table
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tablelist")
	public String gettablelist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DataSourceContextHolder.setDbType("ds2");
		Cookie[] cookies = request.getCookies();
		
		GregorianCalendar now = new GregorianCalendar();
		SimpleDateFormat fmtrq = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss",Locale.US);
	
		DateFormat df = DateFormat.getDateInstance();
		String realName = "";
		int userinfoid = 0;
		String userID = "";
		String startTime = "";
		String endTime = "";
		String bs = request.getParameter("tablebs");

		// 首次加载 没有选定用户 即登陆者分数
		if (request.getParameter("realName") == "") {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("realname")) {
					realName = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
				if (cookies[i].getName().equals("userinfoid")) {
					userinfoid = Integer.parseInt(URLDecoder.decode(cookies[i].getValue(), "UTF-8"));
				}
				if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
		
			now.add(GregorianCalendar.DAY_OF_MONTH,+1);
			endTime = fmtrq.format(now.getTime());
			now.add(GregorianCalendar.MONTH,-1);
			startTime  = fmtrq.format(now.getTime());
			
		}

		// 点击查询按钮后 获取查询条件
		else {
			realName = URLDecoder.decode(request.getParameter("realName"), "UTF-8");
			userinfoid = Integer.parseInt(request.getParameter("userinfoid"));
			startTime = request.getParameter("startTime");
			endTime = request.getParameter("endTime");

		}
		// 设置出事化时间
		Date addstartTime = StringUtil.dateTimeString2Date(startTime);
		//天数加一天，即可实时显示当天添加的数据
		Date addendtimedq = StringUtil.dateTimeString2Date(endTime);
		Date addendtime=new DateTime(addendtimedq).plusDays(1).toDate();

		List<STravel> cclist = service.getcclist(realName,addstartTime,addendtime);
		List<STravel> zhlist = service.getzhlist(realName,addstartTime,addendtime);
		
		List<SAdminworklist> yglist = sadminservice.getyglist(userinfoid,addstartTime,addendtime);
		List<SAdminworklist> wzlist = sadminservice.getwzlist(userinfoid,addstartTime,addendtime);
		List<SAdminworklist> cxdzlist = sadminservice.getcxdzlist(userinfoid,addstartTime,addendtime);
		List<SAdminworklist> tjydlist = sadminservice.gettjydlist(userinfoid,addstartTime,addendtime);
		List<SAdminworklist> zclist = sadminservice.getzclist(userinfoid,addstartTime,addendtime);
		List<SAdminworklistWithBLOBs>  dflist = sadminservice.getdflist(userinfoid, addstartTime, addendtime);
		
		
		Map<String, Object> map = new HashMap<String, Object>();

		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));

		if ("cctable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(cclist, jsonConfig);
			ResponseUtil.write(response, jsonArray);

		}
		if ("zhtable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(zhlist, jsonConfig);
			ResponseUtil.write(response, jsonArray);
		}
		if ("wztable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(wzlist, jsonConfig);
			ResponseUtil.write(response, jsonArray);
		}
		if ("ygtable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(yglist, jsonConfig);
			ResponseUtil.write(response, jsonArray);
		}
		if ("cxdztable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(cxdzlist, jsonConfig);
			ResponseUtil.write(response, jsonArray);
		}
		if ("zctable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(zclist, jsonConfig);
			ResponseUtil.write(response, jsonArray);
		}
		if ("tjydtable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(tjydlist, jsonConfig);
			ResponseUtil.write(response, jsonArray);
		}
		if ("dftable".equals(bs)) {
			JSONArray jsonArray = JSONArray.fromObject(dflist, jsonConfig);
			ResponseUtil.write(response, jsonArray);
		}

		else {
			map.put("cclist", cclist);
			map.put("zhlist", zhlist);
			map.put("yglist", yglist);
			map.put("wzlist", wzlist);
			map.put("cxdzlist", cxdzlist);
			map.put("zclist", zclist);
			map.put("tjydlist", tjydlist);
			map.put("dflist", dflist);
			
			JSONArray jsonArray = JSONArray.fromObject(map, jsonConfig);
			ResponseUtil.write(response, jsonArray);

		}
		return null;
	}

	/**
	 * 动态数据
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/khlist")
	public String getkhlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DataSourceContextHolder.setDbType("ds2");
		Cookie[] cookies = request.getCookies();
		SimpleDateFormat dfid = new SimpleDateFormat("yyyy-MM-dd");// 设置日期格式
		GregorianCalendar now = new GregorianCalendar();
		SimpleDateFormat fmtrq = new SimpleDateFormat("yyyy-MM-dd",Locale.US);
		SimpleDateFormat jhsj= new SimpleDateFormat("yyyy-MM-dd ",Locale.US);
		DateFormat df = DateFormat.getDateInstance();
		int  byplanid = 0;
		int  xyplanid =0;
		String realName = "";
		int userinfoid = 0;
		String userID = "";
		String startTime = "";
		String endTime = "";
		String datime = "";
		String wtinfo = "";
		String byjhinfo = "";
		String xyjhinfo = "";
		String wtinfo1 = "";
		
		int IsClickBtn = 0;
		// 首次加载 没有选定用户 即登陆者分数
		if (request.getParameter("realName") == "") {
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("realname")) {
					realName = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
				if (cookies[i].getName().equals("userinfoid")) {
					userinfoid = Integer.parseInt(URLDecoder.decode(cookies[i].getValue(), "UTF-8"));
				}
				if (cookies[i].getName().equals("userid")) {
					userID = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
				}
			}
			
		
			// 默认选择则 为当前月
			IsClickBtn = 1;
			now.add(GregorianCalendar.DAY_OF_MONTH,+1);
			endTime = fmtrq.format(now.getTime());
			now.add(GregorianCalendar.MONTH,-1);
			startTime  = fmtrq.format(now.getTime());
			datime    = dfid.format(new Date()).toString();
		}
		// 点击查询按钮后 获取查询条件
		else {
			IsClickBtn= 2;
			realName = URLDecoder.decode(request.getParameter("realName"), "UTF-8");
			userinfoid = Integer.parseInt(request.getParameter("userinfoid"));
			startTime = request.getParameter("startTime");
			endTime = request.getParameter("endTime");
			datime    = dfid.format(new Date()).toString();

		}
		// 设置出事化时间
		Date addstartTime = StringUtil.dateTimeString2Date(startTime);
		Date addendtimedq = StringUtil.dateTimeString2Date(endTime);
		Date addendtime=new DateTime(addendtimedq).plusDays(1).toDate();
		Date adddatime = StringUtil.dateTimeString2Date(datime);
		//获取当月
		int countnews = newservice.getcountuser(userinfoid, addstartTime, addendtime);
		int countsmf = smfservice.getfilecount(userinfoid, addstartTime, addendtime);
		int countAddScorp=sallservice.getusercorp(userinfoid, addstartTime, addendtime);
		int countadduser = sallcorpservice.getadduser(userinfoid, addstartTime, addendtime);
		int counteditcorp = salleditcorpservice.geteditcorp(userinfoid, addstartTime, addendtime);
		int countedituser = salleditcorpservice.getedituser(userinfoid, addstartTime, addendtime);
		
		int countshtqw = shtservice.getphoneqw(userinfoid, addstartTime, addendtime);
		int countshtsx =  shtservice.getphonesx(userinfoid, addstartTime, addendtime);
		int countshtfj = shtservice.getphonefj(userinfoid, addstartTime, addendtime);
		int countshtrc = shtservice.getphonerc(userinfoid, addstartTime, addendtime);
		int countyellow = sdcbuyservice.YellowCount(userinfoid, addstartTime, addendtime);
		int countbuyuser = sdcbuyservice.BuyerCount(userinfoid, addstartTime, addendtime);
		int countExpoCount = sdcbuyservice.ExpoCount(userinfoid, addstartTime, addendtime);
		
		

		List<Map> jflistmap = smonrymemeoservice.getjflist(userinfoid, addstartTime, addendtime);
		List<Map> jfxflistmap = smonrymemeoservice.getjfxflist(userinfoid, addstartTime, addendtime);
		
		
		int conuntprodsx = sprodinfoservice.getcpfbjs(userinfoid, addstartTime, addendtime);
		int conuntprodhq = sprodinfoservice.getcpfbhq(userinfoid, addstartTime, addendtime);
		int countaddsxqy = scorpservoce.getsxscorpall(userinfoid, addstartTime, addendtime);
		int countaddqwqy = scorpservoce.getqwscorpall(userinfoid, addstartTime, addendtime);
		int countaddfjqy = fcorpservice.getfjscorpall(userinfoid, addstartTime, addendtime);
		int countaddrcqy = ucorpservice.getrcscorpall(userinfoid, addstartTime, addendtime);
		int countaddzsman = sallcorpservice.getaddzsman(userinfoid, addstartTime, addendtime);
		int countaddzsqy = sallcorpservice.getaddzsqy(userinfoid, addstartTime, addendtime);
		int countbuyinfo = sbuyservice.countbuy(userinfoid, addstartTime, addendtime);
		int countwxh =sallcorpservice.getcountwxh(userinfoid, addstartTime, addendtime);
		
		//  当月 分数
		Object countpoint = sadminservice.countpoint(userinfoid, adddatime);
		
		//  查询分数
		Object countselectpoint = sadminservice.countselectpoint(userinfoid, addstartTime, addendtime);
		
		
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		//使用IsClickBtn 区分是否点击查询按钮
		if (IsClickBtn ==1){
			//登陆用户 查询 当月以及下月 计划
			String bymrplan = "";
			String xymrplan = "";
			KhPlan khplan = new KhPlan();	
	
			khplan=khplanservice.getUserbyjhmr(userinfoid, adddatime);
			if(khplan==null){
				bymrplan="本月暂无月总结！";
			} else {
			    bymrplan =   jhsj.format(khplan.getAddtime()) + "发布:" + khplan.getPlanContent();
				byplanid = khplan.getId();
			}
			khplan=khplanservice.getUserxyjhmr(userinfoid, adddatime);
			if(khplan==null){
				xymrplan="本月暂无月计划！";
			}else{
				xymrplan =   jhsj.format(khplan.getAddtime()) + "发布:" + khplan.getPlanContent();
				xyplanid = khplan.getId();
			}
			List<KhPlan> bywtlistmr=khplanservice.getUserbywtmr(userinfoid, adddatime);
			if(bywtlistmr.size()==0){
				wtinfo="本月暂无问题!";
			}
			else{
			for (int i = 0; i < bywtlistmr.size(); i++) {
				wtinfo += jhsj.format(bywtlistmr.get(i).getAddtime()) +"发布问题：" + bywtlistmr.get(i).getPlanContent() +"\r\n" ;
				}
			}
			map.put("byplanid", byplanid);
			map.put("xyplanid", xyplanid);
			map.put("bymrplan", bymrplan);
			map.put("xymrplan", xymrplan);
			map.put("wtinfo", wtinfo);
		}else{
			
			//按钮 
			List<KhPlan> byjhlist = khplanservice.getUserbyjh(userinfoid, addstartTime, addendtime);
			for (int i = 0; i < byjhlist.size(); i++) {
				byjhinfo += jhsj.format(byjhlist.get(i).getAddtime()) +"发布计划：" + byjhlist.get(i).getPlanContent() +"\r\n" ;
			}
			List<KhPlan> xyjhlist = khplanservice.getUserxyjh(userinfoid, addstartTime, addendtime);
			for (int i = 0; i < xyjhlist.size(); i++) {
				xyjhinfo += jhsj.format(xyjhlist.get(i).getAddtime()) +"发布计划：" + xyjhlist.get(i).getPlanContent() +"\r\n" ;
			}
			List<KhPlan> wt1list = khplanservice.getUserbywt(userinfoid, addstartTime, addendtime);
			for (int i = 0; i < wt1list.size(); i++) {
				wtinfo1 += jhsj.format(wt1list.get(i).getAddtime()) +"发布计划：" + wt1list.get(i).getPlanContent() +"\r\n" ;
			}
			map.put("byjhinfo", byjhinfo);
			map.put("xyjhinfo", xyjhinfo);
			map.put("wtinfo1", wtinfo1);
		}
		
		map.put("newcount", countnews);
		map.put("smfcount", countsmf);
		map.put("addqycount", countAddScorp);
		map.put("addusercount", countadduser);
		map.put("counteditcorp", counteditcorp);
		map.put("countedituser", countedituser);
		map.put("countshtqw", countshtqw);
		map.put("countshtsx", countshtsx);
		map.put("countshtfj", countshtfj);
		map.put("countshtrc", countshtrc);
		map.put("countyellow", countyellow);
		map.put("countbuyuser", countbuyuser);
		map.put("countExpoCount", countExpoCount);
	
		map.put("jflistmap", jflistmap);
		map.put("jfxflistmap", jfxflistmap);
		
		map.put("conuntprodsx", conuntprodsx);
		map.put("conuntprodhq", conuntprodhq);
		map.put("countaddsxqy", countaddsxqy);
		map.put("countaddqwqy", countaddqwqy);
		map.put("countaddfjqy", countaddfjqy);
		map.put("countaddrcqy", countaddrcqy);
		map.put("countaddzsman", countaddzsman);
		map.put("countaddzsqy", countaddzsqy);
		map.put("countbuyinfo", countbuyinfo);
		map.put("countwxh", countwxh);
		if(countpoint == null){
			map.put("countpoint", 0);
			
		}else{
			map.put("countpoint", countpoint);
			
		}
		if(countselectpoint == null){
			map.put("countselectpoint", 0);
			
		}else{
			map.put("countselectpoint", countselectpoint);
			
		}
		
		JSONArray jsonArray = JSONArray.fromObject(map, jsonConfig);
		ResponseUtil.write(response, jsonArray);
		return null;
	}


	/**
	 * 分数列表
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/point")
	public String getpointlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DataSourceContextHolder.setDbType("ds1");
		JSONArray jsonArray = new JSONArray();
		List<KhPoint> point = service.getpointinfo();
		JSONArray rows = JSONArray.fromObject(point);
		jsonArray.addAll(rows);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	
	/***
	 * 加减分
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/adpoint")
	public String adpoint(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DataSourceContextHolder.setDbType("ds2");
		SAdminworklistWithBLOBs  sadmin =  new SAdminworklistWithBLOBs();
		String	userRealName = "";
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("realname")) {
				userRealName = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
			}
		}
		sadmin.setID(null);
		sadmin.setCate(request.getParameter("cate"));   //操作类别
		sadmin.setRealName(request.getParameter("realName"));//被操作人
		
		if("add".equals(request.getParameter("catetype"))){
			sadmin.setPoint(Double.parseDouble(request.getParameter("point")));//操作分数
		}else{
			sadmin.setPoint(0-Double.parseDouble(request.getParameter("point")));
		}
		
		sadmin.setLDMemo(request.getParameter("memo"));//操作备注
		sadmin.setAddName(userRealName);//操作人
		
		String addtime = request.getParameter("timeEnd");
		Date addaddtime= StringUtil.dateTimeString2Date(addtime);
		
		sadmin.setAddDate(addaddtime);
		sadmin.setPointDate(new Date());//操作时间
		sadmin.setUserinfoid(Integer.parseInt(request.getParameter("userinfoID")));//操作人用户id
		
		sadmin.setIsPoint(1);
		sadmin.setIsAuto(1);
		sadmin.setOldID(0);
 
		int  jieg= sadminservice.addpointuser(sadmin);
		JSONObject result=new JSONObject();
		if(jieg>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	
	
	
	
	
	
	
	/**
	 * 修改分数
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updatepoint")
	public String updatepoint(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds2");
  		int pointid = Integer.parseInt(request.getParameter("pointid"));
		double point =Double.parseDouble(request.getParameter("point")); 
		
	/*SAdminworklistWithBLOBs worklist = new SAdminworklistWithBLOBs();	
	worklist.setID(Integer.parseInt(request.getParameter("pointid")));	
	worklist.setPoint(Double.parseDouble(request.getParameter("point")));	 
	worklist.setCate(request.getParameter("cate"));	
	worklist.setRealName(request.getParameter("realName"));
	worklist.setLDMemo(request.getParameter("LDMemo"));
	String addtime = request.getParameter("addDate");
	Date addaddtime= StringUtil.dateTimeString2Date(addtime);
	worklist.setAddDate(addaddtime);
	worklist.setAddName(request.getParameter("addName"));
	worklist.setIsPoint(1);
	worklist.setIsAuto(1);
	worklist.setOldID(0);*/
	
		int resultpp=sadminservice.updatepoint(pointid, point);
		JSONObject result=new JSONObject();
		if(resultpp>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
		
	
	}
	
	

	@RequestMapping("/deletepoint")
	public String deletetask(HttpServletRequest request,HttpServletResponse response) throws Exception{
		DataSourceContextHolder.setDbType("ds2");
		Integer resultpp = 0;

		int id = Integer.parseInt(request.getParameter("ID"));
		resultpp = sadminservice.deleteByPrimaryKey(id);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 新增以及修改计划
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updeteplan")
	public String updeteplan(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DataSourceContextHolder.setDbType("ds2");
		String planid = request.getParameter("planid");
		String plantext = request.getParameter("plantext");
		String cate =  request.getParameter("cate");
		int countresult = 0;
		String	userRealName = "";
		String	userinfoid = "";
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("realname")) {
				userRealName = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
			}else if(cookies[i].getName().equals("userinfoid")) {
				userinfoid = URLDecoder.decode(cookies[i].getValue(), "UTF-8");
			}
		}
		if( "0".equals(planid)){
			//新增
			countresult = khplanservice.insertplan(cate, plantext,  new Date(), userRealName,  Integer.parseInt(userinfoid));
			JSONObject result=new JSONObject();
			if(countresult>0){
				result.put("success", true);
			}else{
				result.put("success", false);
			}
			ResponseUtil.write(response, result);	
		}
		else{
			//修改
		    countresult = khplanservice.updateplan(Integer.parseInt(planid), plantext, new Date());
					JSONObject result=new JSONObject();
					if(countresult>0){
						result.put("success", true);
					}else{
						result.put("success", false);
					}
					ResponseUtil.write(response, result);
		}
		
		return null;
	}

}














