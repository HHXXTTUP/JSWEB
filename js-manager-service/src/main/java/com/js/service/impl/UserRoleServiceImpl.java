package com.js.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.PmUserroleMapper;
import com.js.pojo.PmUserrole;
import com.js.service.UserRoleService;

@Service
public class UserRoleServiceImpl  implements  UserRoleService{

	@Autowired
	private PmUserroleMapper userrole;
	@Override
	public int insert(PmUserrole record) {
		// TODO Auto-generated method stub
		return userrole.insert(record);
	}

}
