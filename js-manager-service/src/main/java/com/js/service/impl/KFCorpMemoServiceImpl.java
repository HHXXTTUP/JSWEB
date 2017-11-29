package com.js.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.KfCorpmemoMapper;
import com.js.pojo.KFSPMemoInfo;
import com.js.pojo.KF_My_MemoTime;
import com.js.pojo.KfCorpmemo;
import com.js.pojo.UserCorpMemo;
import com.js.pojo.groupsuccess;
import com.js.pojo.kfMymemoinfo;
import com.js.service.kf.memo.*;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月26日 上午9:58:59 * @version 1.0 * @parameter  * @since  * @return  */

@Service
public class KFCorpMemoServiceImpl implements KFCorpMemoService{
	@Autowired
	private KfCorpmemoMapper mapper;
	
	@Override
	public List<Map> taskmemocorp(String userid, int taskid) {
		// TODO Auto-generated method stub
		return mapper.taskmemocorp(userid, taskid);
	}
	@Override
	public int insert(KfCorpmemo record) {
		// TODO Auto-generated method stub
		return mapper.insert(record);
	}

	@Override
	public int updatememo(int memoid, int contentinfoid, String contentmemo) {
		// TODO Auto-generated method stub
		return mapper.updatememo(memoid, contentinfoid, contentmemo);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updatememostate(int taskid, int corpid, String userid, int state) {
		// TODO Auto-generated method stub
		return mapper.updatememostate(taskid, corpid, userid, state);
	}


	@Override
	public List<KF_My_MemoTime> taskmemofocorp(int taskid, int corpid) {
		// TODO Auto-generated method stub
		return mapper.taskmemofocorp(taskid, corpid);
	}


	@Override
	public List<KFSPMemoInfo> taskmemocorpinfo(String userid, int taskid, int corpid) {
		// TODO Auto-generated method stub
		return mapper.taskmemocorpinfo(userid, taskid, corpid);
	}
	@Override
	public List<Map> groupmemoinfo(String userid, int taskid) {
		// TODO Auto-generated method stub
		return mapper.groupmemoinfo(userid, taskid);
	}
	@Override
	public List<Map> groupmaninfo(int taskid, int groupid) {
		// TODO Auto-generated method stub
		return mapper.groupmaninfo(taskid, groupid);
	}
	@Override
	public List<Map> getmemocountDay(int taskid, int memoday) {
		// TODO Auto-generated method stub
		return mapper.getmemocountDay(taskid, memoday);
	}
	@Override
	public List<Map> getmemocorpcate(int taskid) {
		// TODO Auto-generated method stub
		return mapper.getmemocorpcate(taskid);
	}
	@Override
	public List<groupsuccess> groupoderinfo(int taskid, int groupid) {
		// TODO Auto-generated method stub
		return mapper.groupoderinfo(taskid, groupid);
	}
	@Override
	public List<UserCorpMemo> taskmemouser(int taskid) {
		// TODO Auto-generated method stub
		return mapper.taskmemouser(taskid);
	}

	@Override
	public int updateByPrimaryKeySelective(KfCorpmemo record) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public List<kfMymemoinfo> taskmemotime(String userid, Date starttime, Date endtime, int taskid) {
		// TODO Auto-generated method stub
		return mapper.taskmemotime(userid, starttime, endtime, taskid);
	}
	@Override
	public List<kfMymemoinfo> memoselect(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.memoselect(map);
	}
	@Override
	public List<kfMymemoinfo> memocorpinfo(int corpid) {
		// TODO Auto-generated method stub
		return mapper.memocorpinfo(corpid);
	}
	@Override
	public List<kfMymemoinfo> shmemoinfo(String topuserid, int taskid) {
		// TODO Auto-generated method stub
		return mapper.shmemoinfo(topuserid, taskid);
	}
	@Override
	public int updatestate(int corpmemoid, int state) {
		// TODO Auto-generated method stub
		return mapper.updatestate(corpmemoid, state);
	}

	





	

}
