package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KSeachinfoMapper;
import com.js.pojo.KSeachinfo;
import com.js.service.KSeachService;

@Service
public class KSeachServiceImpl  implements KSeachService {
	@Autowired
	private KSeachinfoMapper kseach;
	
	@Override
	public List<KSeachinfo> FindSeachkey() {
		// TODO Auto-generated method stub
		return  kseach.FindSeachkey();
	}

}
