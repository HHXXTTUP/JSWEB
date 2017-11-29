package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SProdinfoMapper;
import com.js.service.SprodinfoService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 下午2:32:21 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class SprodinfoServiceImpl implements SprodinfoService {
	
	@Autowired
	private SProdinfoMapper mapper;
	
	@Override
	public int getcpfbjs(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getcpfbjs(userinfoid, startTime, endTime);
	}

	@Override
	public int getcpfbhq(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getcpfbhq(userinfoid, startTime, endTime);
	}
	
}
