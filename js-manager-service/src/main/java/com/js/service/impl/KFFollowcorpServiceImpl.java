package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfFollowcorpMapper;
import com.js.pojo.KfFollowcorp;
import com.js.service.kf.trackcorp.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月16日 上午9:55:50 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KFFollowcorpServiceImpl implements KFFollowcorpService {
	@Autowired
	private KfFollowcorpMapper mapper;
	@Override
	public int insert(KfFollowcorp record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<KfFollowcorp> selectfollowinfo(String userid) {
		// TODO Auto-generated method stub
		return mapper.selectfollowinfo(userid);
	}

}
