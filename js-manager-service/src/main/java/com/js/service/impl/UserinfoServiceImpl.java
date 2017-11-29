package com.js.service.impl;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.UserinfoMapper;
import com.js.pojo.Userinfo;
import com.js.service.UserinfoService;

@Service
public class UserinfoServiceImpl implements UserinfoService {
	@Autowired
	private UserinfoMapper userinfomapper;

	

	@Override
	public Set<String> getLoginroles(String userName) {
		// TODO Auto-generated method stub
		return userinfomapper.getLoginroles(userName);
	}

	@Override
	public Integer AddLoginUser(Userinfo userinfo) {
		// TODO Auto-generated method stub
		return userinfomapper.AddLoginUser(userinfo);
	}



	@Override
	public List<Map> getUserRealName() {
		// TODO Auto-generated method stub
		return userinfomapper.getUserRealName();
	}

	@Override
	public List<Userinfo> getUserList(String realName) {
		// TODO Auto-generated method stub
		return userinfomapper.getUserList(realName);
	}

	@Override
	public int updateByPrimaryKeySelective(Userinfo record) {
		// TODO Auto-generated method stub
		return userinfomapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Map> getmenuinfo(String userName) {
		// TODO Auto-generated method stub
		return userinfomapper.getmenuinfo(userName);
	}

	@Override
	public List<Map> getmenuone(String userName) {
		// TODO Auto-generated method stub
		return userinfomapper.getmenuone(userName);
	}

	@Override
	public List<Map> getmenutwo(String userName) {
		// TODO Auto-generated method stub
		return userinfomapper.getmenutwo(userName);
	}

	@Override
	public List<Map> getmenuthree(String userName) {
		// TODO Auto-generated method stub
		return userinfomapper.getmenuthree(userName);
	}

	@Override
	public Userinfo getUserAllList(Userinfo user) {
		// TODO Auto-generated method stub
		return userinfomapper.getUserAllList(user);
	}

	@Override
	public List<Map> getLoginUser(String userName) {
		// TODO Auto-generated method stub
		return userinfomapper.getLoginUser(userName);
	}

	@Override
	public Integer DeleteLoginUser(int id) {
		// TODO Auto-generated method stub
		return userinfomapper.DeleteLoginUser(id);
	}

	@Override
	public String getqxinfo(String userid, Integer menuid) {
		// TODO Auto-generated method stub
		return userinfomapper.getqxinfo(userid, menuid);
	}

}

