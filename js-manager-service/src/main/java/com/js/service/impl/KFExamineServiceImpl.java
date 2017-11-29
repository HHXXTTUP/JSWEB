package com.js.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfExaminememoMapper;
import com.js.pojo.KfExaminememo;
import com.js.service.kf.memo.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月26日 下午4:49:33 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class KFExamineServiceImpl implements KFExamineService {
	@Autowired
	private KfExaminememoMapper mapper;

	@Override
	public int insert(KfExaminememo record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}




	@Override
	public List<Map> topusershcorp(String userid, int taskid) {
		// TODO Auto-generated method stub
		return mapper.topusershcorp(userid, taskid);
	}




	@Override
	public int updatestate(int taskid, int corpid, String userid, int state, String operationuserid,
			Date operationtime) {
		// TODO Auto-generated method stub
		return  mapper.updatestate(taskid, corpid, userid, state, operationuserid, operationtime);
	}




	@Override
	public int updateByPrimaryKeySelective(KfExaminememo record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}



}
