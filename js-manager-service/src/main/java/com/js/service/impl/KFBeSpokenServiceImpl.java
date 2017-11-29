package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfBespokenMapper;
import com.js.pojo.KfBespoken;
import com.js.pojo.kfMymemoinfo;
import com.js.service.kf.trackcorp.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月14日 下午2:01:39 * @version 1.0 * @parameter  * @since  * @return  */
@Service	
public class KFBeSpokenServiceImpl  implements KFBeSpokenService {
	@Autowired
	private KfBespokenMapper  mapper;
	@Override
	public int insert(KfBespoken record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int updatestate(int spokenid) {
		// TODO Auto-generated method stub
		return mapper.updatestate(spokenid);
	}
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}
	@Override
	public int dedefault(int corpid, int taskid, String userid) {
		// TODO Auto-generated method stub
		return mapper.dedefault(corpid, taskid, userid);
	}

	@Override
	public List<KfBespoken> KfBespokeninfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.KfBespokeninfo(map);
	}





}
