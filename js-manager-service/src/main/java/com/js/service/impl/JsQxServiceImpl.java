package com.js.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.PmJsqxMapper;
import com.js.pojo.PmJsqx;
import com.js.service.JsQxService;

@Service
public class JsQxServiceImpl  implements JsQxService{

	@Autowired
	private PmJsqxMapper jsmapper;
	@Override
	public int insert(PmJsqx record) {
		// TODO Auto-generated method stub
		return jsmapper.insert(record);
	}

}
