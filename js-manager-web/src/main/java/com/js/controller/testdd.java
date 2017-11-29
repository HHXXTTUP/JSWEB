package com.js.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.js.pojo.FPGroupCorp;
import com.js.pojo.loaduser;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月5日 下午2:33:41 * @version 1.0 * @parameter  * @since  * @return  */
public class testdd {
	public static void main(String[] args) {
		
			String userinfo = "[{\"userinfoid\":\"365\",\"realname\":\"李文睿\",\"userid\":\"20170718-1\"}]";
			JSONArray jsonArray=JSONArray.fromObject(userinfo);
		    JSONObject jsonObject2 = new JSONObject();
		    Object o = new Object();
		    loaduser user = new loaduser();
		    o=jsonArray.get(0);
		    jsonObject2=JSONObject.fromObject(o);
		    user=(loaduser)JSONObject.toBean(jsonObject2, loaduser.class);
		    String realname = user.getRealname();
		    

		    System.out.println(user.getRealname());
		
	
	}

}
