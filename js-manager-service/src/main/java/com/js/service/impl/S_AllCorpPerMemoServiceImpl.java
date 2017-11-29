package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SAllcorppermemoMapper;
import com.js.pojo.SAllcorppermemo;
import com.js.service.S_AllCorpPerMemoService;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月6日 上午9:28:40 * @version 1.0 * @parameter  * @since  * @return  */


@Service
public class S_AllCorpPerMemoServiceImpl implements S_AllCorpPerMemoService {
	@Autowired
	private SAllcorppermemoMapper mapper;
	@Override
	public List<SAllcorppermemo> findcorpcontent(String corpname) {
		// TODO Auto-generated method stub
		return mapper.findcorpcontent(corpname);
	}

}
