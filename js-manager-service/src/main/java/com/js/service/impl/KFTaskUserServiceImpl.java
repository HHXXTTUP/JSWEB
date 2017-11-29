package com.js.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfAndtaskallotMapper;
import com.js.pojo.KfAndtaskallot;
import com.js.pojo.SCorp;
import com.js.pojo.Taskuser;
import com.js.pojo.usertaskcorp;
import com.js.service.kf.task.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月24日 下午10:33:12 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class KFTaskUserServiceImpl  implements KFTaskUserService{
	@Autowired
	private KfAndtaskallotMapper mapper;
	
	@Override
	public List<Taskuser> taskuser(String userid) {
		// TODO Auto-generated method stub
		return mapper.taskuser(userid);
	}

	@Override
	public List<Map> taskcontent(int taskid) {
		// TODO Auto-generated method stub
		return mapper.taskcontent(taskid);
	}

	@Override
	public List<Map> tasktgcontent(int taskid) {
		// TODO Auto-generated method stub
		return mapper.tasktgcontent(taskid);
	}

	@Override
	public List<Map> bbtaskall() {
		// TODO Auto-generated method stub
		return mapper.bbtaskall();
	}

	@Override
	public List<Map> bbcorpinfo(int taskid) {
		// TODO Auto-generated method stub
		return mapper.bbcorpinfo(taskid);
	}

	@Override
	public List<com.js.pojo.mytaskfp> mytaskfp(String userid) {
		// TODO Auto-generated method stub
		return mapper.mytaskfp(userid);
	}


	@Override
	public List<com.js.pojo.mytaskfp> admintaskfp() {
		// TODO Auto-generated method stub
		return mapper.admintaskfp();
	}

	@Override
	public KfAndtaskallot findtaskinfo(int taskid) {
		// TODO Auto-generated method stub
		return mapper.findtaskinfo(taskid);
	}


	@Override
	public List<usertaskcorp> taskusercorp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.taskusercorp(map);
	}

	@Override
	public List<usertaskcorp> allusercorp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.allusercorp(map);
	}

	@Override
	public Map findtaskgroup(String userid, int taskid) {
		// TODO Auto-generated method stub
		return mapper.findtaskgroup(userid, taskid);
	}

	@Override
	public List<Map> mytaskfpcorp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.mytaskfpcorp(map);
	}

	@Override
	public List<Map> adminfpcorp(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.adminfpcorp(map);
	}
}
