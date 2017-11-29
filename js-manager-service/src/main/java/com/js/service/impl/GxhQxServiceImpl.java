package com.js.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.PmGxhqxMapper;
import com.js.pojo.PmGxhqx;
import com.js.service.GxhQxService;

@Service
public class GxhQxServiceImpl implements GxhQxService {

	@Autowired
	private PmGxhqxMapper mapper;

	@Override
	public int insert(PmGxhqx record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}


}
