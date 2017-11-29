package com.js.service;

import java.util.List;
import java.util.Map;

import com.js.pojo.KfGroupanduser;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月11日 上午11:20:39 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFgroupAndUserService {
	 int insert(KfGroupanduser record);
	    //获取小组 组员 下拉框
	    List<Map> getgroupUserName(int groupid);
	    //删除小组成员
	     int deletegroupuser(int groupid,String userid);
	     //删除组
	     int deletegroup(int groupid);
	     
	     int getgroup(String userid );
}
