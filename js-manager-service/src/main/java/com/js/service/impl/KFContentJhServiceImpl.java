package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfAndcontentjhMapper;
import com.js.service.kf.taskcontent.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月19日 下午5:37:00 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class KFContentJhServiceImpl implements KFContentJhService{
	@Autowired
	private KfAndcontentjhMapper  mapper;
	@Override
	public int insertcontentjh(String usernma, String userid, Date createtime, int contentid, int contentinfoid) {
		// TODO Auto-generated method stub
		return mapper.insertcontentjh(usernma, userid, createtime, contentid, contentinfoid);
	}
	@Override
	public int deletecontentjh(String userid, int contentid, int contentinfoid) {
		// TODO Auto-generated method stub
		return mapper.deletecontentjh(userid, contentid, contentinfoid);
	}
	@Override
	public int deletecontent(int contentid) {
		// TODO Auto-generated method stub
		return mapper.deletecontent(contentid);
	}
		
}
