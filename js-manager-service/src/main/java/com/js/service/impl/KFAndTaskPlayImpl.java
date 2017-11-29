package com.js.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfAndtaskallotMapper;
import com.js.pojo.KfAndtaskallot;
import com.js.service.kf.task.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月17日 上午11:52:12 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KFAndTaskPlayImpl  implements KFAndTaskPlay {
		@Autowired
		private KfAndtaskallotMapper  mapper;

		@Override
		public int insert(KfAndtaskallot record) {
			// TODO Auto-generated method stub
			return mapper.insert(record);
		}
}
