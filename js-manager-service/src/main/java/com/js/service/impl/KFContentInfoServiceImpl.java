package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfContentinfoMapper;
import com.js.pojo.KfContentinfo;
import com.js.service.kf.taskcontent.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月19日 上午11:27:57 * @version 1.0 * @parameter  * @since  * @return  */


@Service
public class KFContentInfoServiceImpl implements KFContentInfoService {
	@Autowired
	private KfContentinfoMapper mapper;

	@Override
	public List<KfContentinfo> contentinfolist(String userid) {
		// TODO Auto-generated method stub
		return mapper.contentinfolist(userid);
	}

	@Override
	public int insert(KfContentinfo record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updatecontentName(int contentid, String memoName) {
		// TODO Auto-generated method stub
		return mapper.updatecontentName(contentid, memoName);
	}

	@Override
	public List<KfContentinfo> contentinfojhlist(String userid, int contentid) {
		// TODO Auto-generated method stub
		return mapper.contentinfojhlist(userid, contentid);
	}

	@Override
	public List<KfContentinfo> contenoklist(String userid, int contentid) {
		// TODO Auto-generated method stub
		return mapper.contenoklist(userid, contentid);
	}

	@Override
	public List<KfContentinfo> contentglist(String userid, int contentid) {
		// TODO Auto-generated method stub
		return mapper.contentglist(userid, contentid);
	}

	@Override
	public List<KfContentinfo> contentgoklist(String userid, int contentid) {
		// TODO Auto-generated method stub
		return mapper.contentgoklist(userid, contentid);
	}

	@Override
	public String ContentnName(int contentid) {
		// TODO Auto-generated method stub
		return mapper.ContentnName(contentid);
	}
}
