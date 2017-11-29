package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfTgcontentMapper;
import com.js.pojo.KfContent;
import com.js.pojo.KfTgcontent;
import com.js.service.kf.taskcontent.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月20日 下午2:46:49 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KFTgContentServiceImpl implements KFTgContentService{

	@Autowired
	private KfTgcontentMapper mapper;

	@Override
	public List<Map> gettgcontentName(String userinfoid) {
		// TODO Auto-generated method stub
		return mapper.gettgcontentName(userinfoid);
	}

	@Override
	public List<KfTgcontent> gettgcontentList(String userinfoid) {
		// TODO Auto-generated method stub
		return mapper.gettgcontentList(userinfoid);
	}

	@Override
	public int update(int id, String contentName) {
		// TODO Auto-generated method stub
		return mapper.update(id, contentName);
	}

	@Override
	public int insert(KfTgcontent record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}
	
	
}
