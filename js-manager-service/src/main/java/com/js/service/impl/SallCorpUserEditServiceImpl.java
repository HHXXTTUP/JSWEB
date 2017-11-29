package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SAllcorpusereditMapper;
import com.js.pojo.SAllcorpuseredit;
import com.js.service.SallCorpUserEditService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午3:20:49 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class SallCorpUserEditServiceImpl implements SallCorpUserEditService {
	@Autowired
	private SAllcorpusereditMapper mapper;

	@Override
	public int geteditcorp(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.geteditcorp(userinfoid, startTime, endTime);
	}

	@Override
	public int getedituser(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getedituser(userinfoid, startTime, endTime);
	}
	

}
