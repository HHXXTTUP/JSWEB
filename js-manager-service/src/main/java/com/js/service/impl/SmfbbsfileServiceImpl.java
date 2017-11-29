package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SMfbbsfileMapper;
import com.js.pojo.SMfbbsfile;
import com.js.service.SmfbbsfileService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 上午11:47:26 * @version 1.0 * @parameter  * @since  * @return  */




@Service
public class SmfbbsfileServiceImpl implements SmfbbsfileService {
	@Autowired
	private SMfbbsfileMapper mapper;

	@Override
	public int getfilecount(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getfilecount(userinfoid, startTime, endTime);
	}
	


}
