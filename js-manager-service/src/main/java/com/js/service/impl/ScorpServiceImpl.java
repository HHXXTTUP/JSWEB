package com.js.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.mapper.SCorpMapper;
import com.js.pojo.SCorp;
import com.js.pojo.SCorpWithBLOBs;
import com.js.service.corp.ScorpService;
@Service
public class ScorpServiceImpl  implements ScorpService{
	@Autowired
	private SCorpMapper scorpmapper;
	
	@Override
	public List<SCorp> FindAll() {
		// TODO Auto-generated method stub
		return scorpmapper.FindAll();
	}
	

	@Override
	public int getsxscorpall(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return scorpmapper.getsxscorpall(userinfoid, startTime, endTime);
	}

	@Override
	public int getqwscorpall(Integer userinfoid, Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		return scorpmapper.getqwscorpall(userinfoid, startTime, endTime);
	}

	@Override
	public List<SCorpWithBLOBs> FindCorpInfp() {
		// TODO Auto-generated method stub
		return scorpmapper.FindCorpInfp();
	}

	@Override
	public List<SCorpWithBLOBs> FindAllotCrop(int allotid) {
		// TODO Auto-generated method stub
		return scorpmapper.FindAllotCrop(allotid);
	}


	@Override
	public int updateByPrimaryKeySelective(SCorpWithBLOBs record) {
		// TODO Auto-generated method stub
		return scorpmapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<SCorpWithBLOBs> FindTaskCorp(String userid, int Taskid) {
		// TODO Auto-generated method stub
		return scorpmapper.FindTaskCorp(userid, Taskid);
	}

	@Override
	public SCorpWithBLOBs selectByPrimaryKey(Integer ID) {
		// TODO Auto-generated method stub
		return scorpmapper.selectByPrimaryKey(ID);
	}


	@Override
	public List<SCorpWithBLOBs> Find(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return scorpmapper.Find(map);
	}


	@Override
	public Map Findcorp(int corpid) {
		// TODO Auto-generated method stub
		return scorpmapper.Findcorp(corpid);
	}





	
	


}
