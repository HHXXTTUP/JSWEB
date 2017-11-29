package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.RcDistrictMapper;
import com.js.pojo.RcDistrict;
import com.js.service.RC_districtService;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月7日 下午5:44:39 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class RC_districtServiceImpl implements RC_districtService {
	@Autowired
	private RcDistrictMapper mapper;
	
	@Override
	public List<RcDistrict> findrcinfo() {
		// TODO Auto-generated method stub
		return mapper.findrcinfo();
	}

}
