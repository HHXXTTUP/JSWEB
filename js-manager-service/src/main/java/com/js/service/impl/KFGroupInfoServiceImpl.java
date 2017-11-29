package com.js.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfGroupinfoMapper;
import com.js.pojo.KfGroupinfo;
import com.js.service.KFGroupInfoService;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月11日 上午9:33:04 * @version 1.0 * @parameter  * @since  * @return  */


@Service
public class KFGroupInfoServiceImpl  implements KFGroupInfoService{
	
	@Autowired
	private KfGroupinfoMapper mapper;

	@Override
	public List<KfGroupinfo> Grouplist(String userid) {
		// TODO Auto-generated method stub
		return mapper.Grouplist(userid);
	}

	@Override
	public int insert(KfGroupinfo record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(KfGroupinfo record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Map> getgroupName(String userid) {
		// TODO Auto-generated method stub
		return mapper.getgroupName(userid);
	}

	@Override
	public List<Map> getmygroup(String userid) {
		// TODO Auto-generated method stub
		return mapper.getmygroup(userid);
	}

	@Override
	public String getgroupglid(int groupid) {
		// TODO Auto-generated method stub
		return mapper.getgroupglid(groupid);
	}

	@Override
	public int insertgrouptwo(String createman, String createuserid, Date createtime, String groupname,
			String groupmemo, int topgroupid, String topglid, int myid) {
		// TODO Auto-generated method stub
		return mapper.insertgrouptwo(createman, createuserid, createtime, groupname, groupmemo, topgroupid, topglid, myid);
	}

	@Override
	public int getmyid() {
		// TODO Auto-generated method stub
		return mapper.getmyid();
	}




}
