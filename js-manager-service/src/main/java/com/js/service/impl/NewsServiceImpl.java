package com.js.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.NewsMapper;
import com.js.pojo.News;
import com.js.service.NewsService;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 上午10:25:58 * @version 1.0 * @parameter  * @since  * @return  */


@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsMapper mapper;

	@Override
	public int getcountuser(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return mapper.getcountuser(userinfoid, startTime, endTime);
	}

}
