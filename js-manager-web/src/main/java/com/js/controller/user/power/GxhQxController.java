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

import com.js.pojo.GXHPermiss;
import com.js.pojo.Permissinfo;
import com.js.pojo.Permission;
import com.js.pojo.PmGxhqx;
import com.js.pojo.PmJsqx;
import com.js.service.GxhQxService;
import com.js.service.JsQxService;
import com.js.util.DataSourceContextHolder;
import com.js.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("gxhqx")
public class GxhQxController {
	@Resource
	private GxhQxService service;
	
	
	/**
	 * 批量新增个性化权限
	 * @param per
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/add.do", method =RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public String AddGxHqx (@RequestBody GXHPermiss per,HttpServletRequest request,HttpServletResponse response) throws Exception{
    DataSourceContextHolder.setDbType("ds1");	
	PmGxhqx gxhqx =  new PmGxhqx();
	int userinfoid = Integer.parseInt(per.getUserinfoid());
	String qxobj = per.getMydata();
	int success = 0;
	 //把字符转换为 JSONObject
	JSONArray json = JSONArray.fromObject(qxobj); // 首先把字符串转成 JSONArray 对象
	JSONObject result=new JSONObject();
	if(json.size()>0){
	 for(int i=0;i<json.size();i++){
	  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
      gxhqx.setQxid(Integer.parseInt((String) json.getJSONObject(i).get("qxid")));
      gxhqx.setMenuid(Integer.parseInt((String) json.getJSONObject(i).get("menuid")));
      gxhqx.setUserinfoid(userinfoid);
	  
	  //添加用户信息
      gxhqx.setIsEnabled(0);
      gxhqx.setHtOperDate(new Date());
      gxhqx.setHtOperMemo("测试");
      gxhqx.setSource("本地");
      gxhqx.setHtOperName("lwr");
      gxhqx.setHtOperState(0);
      gxhqx.setId(null);
	  int sult  =  service.insert(gxhqx);
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
