package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.FCorpMapper;
import com.js.service.FcorpService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 下午4:12:33 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class FscorpServiceImpl  implements FcorpService{
	@Autowired
	private FCorpMapper mapper;

	@Override
	public int getfjscorpall(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getfjscorpall(userinfoid, startTime, endTime);
	}

}
