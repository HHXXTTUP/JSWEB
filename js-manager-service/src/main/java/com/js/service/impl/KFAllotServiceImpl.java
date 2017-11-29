package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfAllotMapper;
import com.js.pojo.KfAllot;
import com.js.service.kf.task.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月29日 下午3:10:09 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KFAllotServiceImpl  implements KFAllotService{
	@Autowired
	private KfAllotMapper mapper;
	@Override
	public List<KfAllot> allotlist(String userid) {
		// TODO Auto-generated method stub
		return mapper.allotlist(userid);
	}
	@Override
	public int insert(KfAllot record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKey(KfAllot record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}
	@Override
	public List<Map> getallotName(String userinfoid) {
		// TODO Auto-generated method stub
		return mapper.getallotName(userinfoid);
	}
}
