package com.js.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfCorpfpMapper;
import com.js.pojo.KfCorpfp;
import com.js.service.kf.corpfp.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月16日 下午3:29:45 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class KFCorpFPServiceImpl  implements KFCorpFPService{
	@Autowired
	private KfCorpfpMapper mapper;

	@Override
	public int insert(KfCorpfp record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}



	@Override
	public List<Map> fpinfo(String userid) {
		// TODO Auto-generated method stub
		return mapper.fpinfo(userid);
	}

	@Override
	public int deQDXZ(int allotid, int groupid) {
		// TODO Auto-generated method stub
		return mapper.deQDXZ(allotid, groupid);
	}

	@Override
	public int deletegroup(int groupid) {
		// TODO Auto-generated method stub
		return mapper.deletegroup(groupid);
	}

	@Override
	public List<Map> fpcorp(int taskid) {
		// TODO Auto-generated method stub
		return mapper.fpcorp(taskid);
	}



	@Override
	public int insertCropFP(String username, String userid, int creategroupid, Date createtime, int Allotid, int corpid,
			int groupid) {
		// TODO Auto-generated method stub
		return mapper.insertCropFP(username, userid, creategroupid, createtime, Allotid, corpid, groupid);
	}

	
	
}
