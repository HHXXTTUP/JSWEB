package com.js.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SDcbuymemoMapper;
import com.js.pojo.SDcbuymemo;
import com.js.pojo.kfMymemoinfo;
import com.js.service.SdcbuymemoService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午7:50:33 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class SdcbuymemoServiceImpl implements  SdcbuymemoService{

	@Autowired
	private SDcbuymemoMapper mapper;

	@Override
	public int BuyerCount(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.BuyerCount(userinfoid, startTime, endTime);
	}

	@Override
	public int YellowCount(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.YellowCount(userinfoid, startTime, endTime);
	}

	@Override
	public int ExpoCount(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.ExpoCount(userinfoid, startTime, endTime);
	}

	@Override
	public List<kfMymemoinfo> finddcbuymemo(String corpname) {
		// TODO Auto-generated method stub
		return mapper.finddcbuymemo(corpname);
	}


}
