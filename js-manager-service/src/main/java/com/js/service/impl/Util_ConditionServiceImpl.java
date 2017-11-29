package com.js.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.UtilConditionMapper;
import com.js.pojo.UtilCondition;
import com.js.service.kf.trackcorp.*;
/** * @author  作者 E-mail: * @date 创建时间：2017年11月7日 下午7:34:57 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class Util_ConditionServiceImpl  implements Util_ConditionService{
	@Autowired
	private UtilConditionMapper mapper;
	@Override
	public List<UtilCondition> selectinfo(String typename) {
		// TODO Auto-generated method stub
		return mapper.selectinfo(typename);
	}

}
