package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KhPointMapper;
import com.js.pojo.KhPoint;
import com.js.service.pointtestService;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月1日 下午4:59:29 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class pointtestServiceImpl implements pointtestService {
	@Autowired
	private KhPointMapper mapper;
	@Override
	public List<KhPoint> getpointinfotest() {
		// TODO Auto-generated method stub
		return mapper.getpointinfotest();
	}

}
