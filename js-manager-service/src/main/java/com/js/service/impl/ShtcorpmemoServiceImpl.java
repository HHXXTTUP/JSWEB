package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SHtcorpmemoMapper;
import com.js.pojo.SHtcorpmemo;
import com.js.service.ShtcorpmemoService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午3:47:30 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class ShtcorpmemoServiceImpl implements ShtcorpmemoService {

	@Autowired
	private SHtcorpmemoMapper mapper;

	@Override
	public int getphoneqw(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getphoneqw(userinfoid, startTime, endTime);
	}

	@Override
	public int getphonesx(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getphonesx(userinfoid, startTime, endTime);
	}

	@Override
	public int getphonefj(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getphonefj(userinfoid, startTime, endTime);
	}

	@Override
	public int getphonerc(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getphonerc(userinfoid, startTime, endTime);
	}
	


}
