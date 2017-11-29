package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfGroupanduserMapper;
import com.js.pojo.KfGroupanduser;
import com.js.service.KFgroupAndUserService;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月11日 上午11:21:34 * @version 1.0 * @parameter  * @since  * @return  */


@Service
public class KFgroupAndUserServiceImpl implements KFgroupAndUserService {
	@Autowired
	private KfGroupanduserMapper mapper;

	@Override
	public int insert(KfGroupanduser record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public List<Map> getgroupUserName(int groupid) {
		// TODO Auto-generated method stub
		return mapper.getgroupUserName(groupid);
	}

	@Override
	public int deletegroupuser(int groupid, String userid) {
		// TODO Auto-generated method stub
		return mapper.deletegroupuser(groupid, userid);
	}

	@Override
	public int deletegroup(int groupid) {
		// TODO Auto-generated method stub
		return mapper.deletegroup(groupid);
	}

	@Override
	public int getgroup(String userid) {
		// TODO Auto-generated method stub
		return mapper.getgroup(userid);
	}
	
}
