package com.js.service.corp;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.js.pojo.SCorp;
import com.js.pojo.SCorpWithBLOBs;



public interface ScorpService {
    SCorpWithBLOBs selectByPrimaryKey(Integer ID);
    
	List<SCorp>FindAll();
    int updateByPrimaryKeySelective(SCorpWithBLOBs record);
    
	Map Findcorp(int corpid);
    
    // 
    List<SCorpWithBLOBs>Find(Map<String,Object> map);
	
    List<SCorpWithBLOBs> FindCorpInfp();
    int getsxscorpall(Integer userinfoid,Date startTime,Date endTime );
	int getqwscorpall(Integer userinfoid,Date startTime,Date endTime );
    //查询清单对应企业
	List<SCorpWithBLOBs> FindAllotCrop(int allotid);
    
	   //显示选择任务的企业 
    List<SCorpWithBLOBs> FindTaskCorp(String userid,int Taskid);
}
