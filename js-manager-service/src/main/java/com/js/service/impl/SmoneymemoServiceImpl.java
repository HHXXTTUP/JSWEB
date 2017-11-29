package com.js.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SMoneycorpmemoMapper;
import com.js.service.SmoneymemoService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 上午11:48:22 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class SmoneymemoServiceImpl implements SmoneymemoService{
	
	@Autowired
	private SMoneycorpmemoMapper mapper;
	
	
	@Override
	public int getjfyfsx(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfyfsx(userinfoid, startTime, endTime);
	}

	@Override
	public int getjfyfqw(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfyfqw(userinfoid, startTime, endTime);
	}

	@Override
	public int getjfyffj(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfyffj(userinfoid, startTime, endTime);
	}

	@Override
	public int getjfyfrc(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfyfrc(userinfoid, startTime, endTime);
	}

	@Override
	public List<Map> getjflist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjflist(userinfoid, startTime, endTime);
	}

	@Override
	public List<Map> getjfxflist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getjfxflist(userinfoid, startTime, endTime);
	}

}
