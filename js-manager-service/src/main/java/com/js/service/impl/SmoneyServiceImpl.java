package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SMoneycorpMapper;
import com.js.service.SmoneyService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 上午11:24:18 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class SmoneyServiceImpl implements SmoneyService{
	
	@Autowired
	private SMoneycorpMapper mapper;
	@Override
	public int getjfsx(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfsx(userinfoid, startTime, endTime);
	}

	@Override
	public int getjfqw(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfqw(userinfoid, startTime, endTime);
	}

	@Override
	public int getjffj(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjffj(userinfoid, startTime, endTime);
	}

	@Override
	public int getjfrc(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfrc(userinfoid, startTime, endTime);
	}
	
}
