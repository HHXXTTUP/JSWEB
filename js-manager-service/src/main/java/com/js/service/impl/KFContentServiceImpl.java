package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfContentMapper;
import com.js.pojo.KfContent;
import com.js.service.kf.taskcontent.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月17日 上午11:39:09 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class KFContentServiceImpl implements KFContentService{
		@Autowired
		private KfContentMapper mapper;

		@Override
		public List<Map> getcontentName(String userinfoid) {
			// TODO Auto-generated method stub
			return mapper.getcontentName(userinfoid);
		}

		@Override
		public List<KfContent> getcontentList(String userinfoid) {
			// TODO Auto-generated method stub
			return mapper.getcontentList(userinfoid);
		}

		@Override
		public int update(int id, String contentName) {
			// TODO Auto-generated method stub
			return mapper.update(id, contentName);
		}

		@Override
		public int insert(KfContent record) {
			// TODO Auto-generated method stub
			return mapper.insert(record);
		}

		@Override
		public int deleteByPrimaryKey(Integer id) {
			// TODO Auto-generated method stub
			return mapper.deleteByPrimaryKey(id);
		}
}
