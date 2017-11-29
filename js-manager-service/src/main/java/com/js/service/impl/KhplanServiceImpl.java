package com.js.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KhPlanMapper;
import com.js.pojo.KhPlan;
import com.js.service.KhplanService;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月5日 下午1:43:14 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KhplanServiceImpl  implements KhplanService{

	
	@Autowired
	private KhPlanMapper  mapper;

	@Override
	public List<KhPlan> getUserbyjh(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getUserbyjh(userinfoid, startTime, endTime);
	}

	

	@Override
	public List<KhPlan> getUserxyjh(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getUserxyjh(userinfoid, startTime, endTime);
	}


	@Override
	public List<KhPlan> getUserbywtmr(Integer userinfoid, Date dqtime) {
		// TODO Auto-generated method stub
		return mapper.getUserbywtmr(userinfoid, dqtime);
	}





	@Override
	public KhPlan getUserbyjhmr(Integer userinfoid, Date dqtime) {
		// TODO Auto-generated method stub
		return mapper.getUserbyjhmr(userinfoid, dqtime);
	}



	@Override
	public KhPlan getUserxyjhmr(Integer userinfoid, Date dqtime) {
		// TODO Auto-generated method stub
		return mapper.getUserxyjhmr(userinfoid, dqtime);
	}



	@Override
	public List<KhPlan> getUserbywt(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getUserbywt(userinfoid, startTime, endTime);
	}



	@Override
	public int updateByPrimaryKey(KhPlan record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}



	@Override
	public int updateplan(Integer id, String plan, Date updatetime) {
		// TODO Auto-generated method stub
		return mapper.updateplan(id, plan, updatetime);
	}



	@Override
	public int insertplan(String cate, String plan, Date addtime, String realname, Integer userinfoid) {
		// TODO Auto-generated method stub
		return mapper.insertplan(cate, plan, addtime, realname, userinfoid);
	}





	

}
