package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.MenuMapper;
import com.js.service.MenuService;

@Service
public class MenuServiceImpl  implements MenuService{

	@Autowired
	private MenuMapper menu;

	@Override
	public List<Map> gettitleall() {
		// TODO Auto-generated method stub
		return menu.gettitleall();
	}
}
