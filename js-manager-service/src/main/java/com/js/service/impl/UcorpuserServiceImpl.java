package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.UCorpuserMapper;
import com.js.service.UcorpuserService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 下午4:17:21 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class UcorpuserServiceImpl implements UcorpuserService {
	@Autowired
	private UCorpuserMapper mapper;
	@Override
	public int getrcscorpall(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getrcscorpall(userinfoid, startTime, endTime);
	}

}
