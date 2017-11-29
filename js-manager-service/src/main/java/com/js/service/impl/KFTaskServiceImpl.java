package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfTaskMapper;
import com.js.pojo.KFTaskInfo;
import com.js.pojo.KfTask;
import com.js.service.kf.task.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月27日 上午9:46:03 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KFTaskServiceImpl implements KFTaskService {
	@Autowired
	private KfTaskMapper mapper;

	@Override
	public List<KfTask> gettaskall(String userinfoid) {
		// TODO Auto-generated method stub
		return mapper.gettaskall(userinfoid);
	}

	@Override
	public List<Map> gettaskName(String userinfoid) {
		// TODO Auto-generated method stub
		return mapper.gettaskName(userinfoid);
	}

	@Override
	public int insert(KfTask record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(KfTask record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<KfTask> gettaskinfo(String userinfoid) {
		// TODO Auto-generated method stub
		return mapper.gettaskinfo(userinfoid);
	}

	@Override
	public int updatestate(int taskid, String state) {
		// TODO Auto-generated method stub
		return mapper.updatestate(taskid, state);
	}

}
