package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SAlllinkcorpMapper;
import com.js.pojo.SAlllinkcorp;
import com.js.service.SalllinkcorpService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午2:24:37 * @version 1.0 * @parameter  * @since  * @return  */


@Service
public class SalllinkcorpServiceImpl implements  SalllinkcorpService{
	
	@Autowired
	private SAlllinkcorpMapper mapper;

	@Override
	public int getusercorp(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getusercorp(userinfoid, startTime, endTime);
	}
	
	

}
