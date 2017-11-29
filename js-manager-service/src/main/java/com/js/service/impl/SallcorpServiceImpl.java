package com.js.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SAllcorpMapper;
import com.js.mapper.SAllcorppermemoMapper;
import com.js.mapper.SHtcorpmemoMapper;
import com.js.pojo.SAllcorp;
import com.js.pojo.SAllcorpWithBLOBs;
import com.js.pojo.kfMymemoinfo;
import com.js.pojo.oldmemoinfo;
import com.js.service.corp.SallcorpService;


/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午2:57:56 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class SallcorpServiceImpl implements SallcorpService {
	@Autowired
	private  SAllcorpMapper mapper;
	@Autowired
	private  SAllcorppermemoMapper memomapper;
	@Autowired
	private  SHtcorpmemoMapper linkmemomapper;

	@Override
	public int getadduser(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getadduser(userinfoid, startTime, endTime);
	}

	@Override
	public int getaddzsman(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getaddzsman(userinfoid, startTime, endTime);
	}

	@Override
	public int getaddzsqy(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getaddzsqy(userinfoid, startTime, endTime);
	}

	@Override
	public int getcountwxh(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getcountwxh(userinfoid, startTime, endTime);
	}

	@Override
	public int upcorpname(String oldcorpname, String corpname) {
		// TODO Auto-generated method stub
		return mapper.upcorpname(oldcorpname, corpname);
	}

	@Override
	public int updateByPrimaryKeySelective(SAllcorpWithBLOBs record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<kfMymemoinfo> findcorpmemo(int corpid) {
		// TODO Auto-generated method stub
		return memomapper.findcorpmemo(corpid);
	}

	@Override
	public List<kfMymemoinfo> findcorplinkmemo(int corpid) {
		// TODO Auto-generated method stub
		return linkmemomapper.findcorplinkmemo(corpid);
	}

	@Override
	public List<Map> getcorpcontent(String corpname) {
		// TODO Auto-generated method stub
		return mapper.getcorpcontent(corpname);
	}



}
