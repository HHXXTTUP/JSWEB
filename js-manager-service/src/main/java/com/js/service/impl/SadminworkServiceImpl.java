package com.js.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SAdminworklistMapper;
import com.js.pojo.SAdminworklist;
import com.js.pojo.SAdminworklistWithBLOBs;
import com.js.pojo.STravel;
import com.js.service.SadminworkService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午8:46:01 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class SadminworkServiceImpl implements SadminworkService{
	
	@Autowired
	private SAdminworklistMapper mapper;

	@Override
	public List<SAdminworklist> getwzlist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getwzlist(userinfoid, startTime, endTime);
	}

	@Override
	public List<SAdminworklist> getyglist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getyglist(userinfoid, startTime, endTime);
	}

	@Override
	public List<SAdminworklist> getcxdzlist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getcxdzlist(userinfoid, startTime, endTime);
	}

	@Override
	public List<SAdminworklist> getzclist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getzclist(userinfoid, startTime, endTime);
	}

	@Override
	public List<SAdminworklist> gettjydlist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.gettjydlist(userinfoid, startTime, endTime);
	}


	@Override
	public int addpointuser(SAdminworklistWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.addpointuser(record);
	}

	@Override
	public Object countpoint(Integer userinfoid, Date adddatime) {
		// TODO Auto-generated method stub
		return mapper.countpoint(userinfoid, adddatime);
	}

	@Override
	public List<SAdminworklistWithBLOBs> getdflist(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getdflist(userinfoid, startTime, endTime);
	}

	@Override
	public Object countselectpoint(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.countselectpoint(userinfoid, startTime, endTime);
	}

	@Override
	public int updatepoint(int pointid, Double point) {
		// TODO Auto-generated method stub
		return mapper.updatepoint(pointid, point);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(SAdminworklistWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer ID) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(ID);
	}




}
