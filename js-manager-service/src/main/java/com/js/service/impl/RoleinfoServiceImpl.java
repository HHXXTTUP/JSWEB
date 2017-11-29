package com.js.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.PmRoleMapper;
import com.js.service.RoleinfoService;

@Service
public class RoleinfoServiceImpl  implements RoleinfoService {

	
	@Autowired
	private PmRoleMapper pmmapper;
	@Override
	public List<Map> getrolename() {
		// TODO Auto-generated method stub
		return pmmapper.getrolename();
	}

	
	
}
