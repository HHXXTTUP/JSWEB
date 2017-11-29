package com.js.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.STravelMapper;
import com.js.pojo.KhPoint;
import com.js.pojo.KhTime;
import com.js.pojo.STravel;
import com.js.service.STravelService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月25日 上午10:14:27 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class StravelServiceImpl  implements STravelService{
	
	@Autowired
	private STravelMapper mapper;



	@Override
	public List<KhTime> gettimeinfo() {
		// TODO Auto-generated method stub
		return mapper.gettimeinfo();
	}

	@Override
	public List<KhPoint> getpointinfo() {
		// TODO Auto-generated method stub
		return mapper.getpointinfo();
	}

	@Override
	public List<STravel> getcclist(String realname, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getcclist(realname, startTime, endTime);
	}

	@Override
	public List<STravel> getzhlist(String realname, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getzhlist(realname, startTime, endTime);
	}

}
