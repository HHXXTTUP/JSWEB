package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SBuyinfoMapper;
import com.js.service.SbuyinfoService;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月6日 下午2:30:26 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class SbuyinfoServiceImpl  implements SbuyinfoService{
	@Autowired
	private SBuyinfoMapper mapper;
	@Override
	public int countbuy(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.countbuy(userinfoid, startTime, endTime);
	}

}
