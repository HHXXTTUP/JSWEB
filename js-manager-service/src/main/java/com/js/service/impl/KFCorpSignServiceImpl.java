package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfCorpsignMapper;
import com.js.pojo.KfCorpsign;
import com.js.pojo.SCorp;
import com.js.service.KFCorpSignService;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月1日 上午9:30:06 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KFCorpSignServiceImpl implements KFCorpSignService {
	@Autowired
	private KfCorpsignMapper mapper;
	@Override
	public int insert(KfCorpsign record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}
	@Override
	public List<SCorp> findsigncorp(int taskid, String userid, int signid) {
		// TODO Auto-generated method stub
		return mapper.findsigncorp(taskid, userid, signid);
	}

}
