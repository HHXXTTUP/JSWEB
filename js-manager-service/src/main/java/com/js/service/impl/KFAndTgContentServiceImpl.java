package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfAndtgcontentMapper;
import com.js.service.kf.taskcontent.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月20日 下午5:47:15 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class KFAndTgContentServiceImpl implements KFAndTgContentService{
	@Autowired
	private KfAndtgcontentMapper mapper;

	@Override
	public int insertcontenttg(String usernma, String userid, Date createtime, int contentid, int contentinfoid) {
		// TODO Auto-generated method stub
		return mapper.insertcontenttg(usernma, userid, createtime, contentid, contentinfoid);
	}

	@Override
	public int deletecontenttg(String userid, int contentid, int contentinfoid) {
		// TODO Auto-generated method stub
		return mapper.deletecontenttg(userid, contentid, contentinfoid);
	}

	@Override
	public int deletecontent(int contentid) {
		// TODO Auto-generated method stub
		return mapper.deletecontent(contentid);
	}
	
}
