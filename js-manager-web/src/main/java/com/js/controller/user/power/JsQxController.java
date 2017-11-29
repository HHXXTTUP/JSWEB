package com.js.controller.user.power;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.js.pojo.Permissinfo;
import com.js.pojo.Permission;
import com.js.pojo.PmJsqx;
import com.js.service.JsQxService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("jsqx")
public class JsQxController {
	@Resource
	private JsQxService service;
	/**
	 * 批量新增角色权限
	 * @param per
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/add.do", method =RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public String AddQxJs (@RequestBody Permission per,HttpServletRequest request,HttpServletResponse response) throws Exception{
	DataSourceContextHolder.setDbType("ds1");	
	PmJsqx jsqx =  new PmJsqx();
	int roleid = Integer.parseInt(per.getRoleid());
	String qxobj = per.getMydata();
	int success = 0;
	 //把字符转换为 JSONObject
	JSONArray json = JSONArray.fromObject(qxobj); // 首先把字符串转成 JSONArray 对象
	JSONObject result=new JSONObject();
	if(json.size()>0){
	 for(int i=0;i<json.size();i++){
	  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
	  jsqx.setQxid  (Integer.parseInt((String) json.getJSONObject(i).get("qxid")));
	  jsqx.setMenuid(Integer.parseInt((String) json.getJSONObject(i).get("menuid")));
	  jsqx.setRoleid(roleid);
	  
	  //添加用户信息
	  jsqx.setIsEnabled(0);
	  jsqx.setHtOperDate(new Date());
	  jsqx.setHtOperMemo("测试");
	  jsqx.setSource("本地");
	  jsqx.setHtOperName("lwr");
	  jsqx.setHtOperState(0);
	  jsqx.setId(null);
	  int sult  =  service.insert(jsqx);
	  if(sult>0){
		  success++;
	  	}
	 }
	}
	if(success>0){
		
		result.put("success", true);
		ResponseUtil.write(response, result);	
	}
	else
	{
	
		result.put("flase", true);
		ResponseUtil.write(response, result);
	}	
	return null ;
	}	
}
