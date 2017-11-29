package com.js.service.kf.memo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.js.pojo.KFSPMemoInfo;
import com.js.pojo.KF_My_MemoTime;
import com.js.pojo.KfCorpmemo;
import com.js.pojo.UserCorpMemo;
import com.js.pojo.groupsuccess;
import com.js.pojo.kfMymemoinfo;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月26日 上午9:58:40 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFCorpMemoService {
    // 获取任务 中 用户 备注过的 企业
    List<Map> taskmemocorp(String userid,int taskid);
    // 获取任务 中 用户 备注过的 企业 点击进去 获取 企业备注信息
    int insert(KfCorpmemo record);
    
    //查询用户 备注 任务 企业 的信息
   List<KFSPMemoInfo> taskmemocorpinfo(String userid,int taskid,int corpid);
    
    //修改选中备注信息
    int updatememo(int memoid,int contentinfoid,String contentmemo);
    
    int deleteByPrimaryKey(Integer id);
    
    //按时间 查询 备注信息 
    List<kfMymemoinfo> taskmemotime(String userid,Date starttime,Date endtime,int taskid);
    
    //按企业 查询 备注信息
    List<KF_My_MemoTime> taskmemofocorp(int taskid,int corpid);
    int updatememostate(int taskid,int corpid,String userid,int state);
    int updateByPrimaryKeySelective(KfCorpmemo record);
    
    //报表功能  显示个人完成情况
    List<UserCorpMemo> taskmemouser(int taskid); 
    //个人小组下面完成情况
    List<Map> groupmemoinfo(String userid,int taskid); 
    
    //小组下面个人完成情况
    List<Map> groupmaninfo(int taskid,int groupid); 
    //获取任务完成天数 
    List<Map> getmemocountDay(int taskid,int memoday);
    
    //获取任务完成天数 
    List<Map> getmemocorpcate(int taskid);
    
    //小组下面小组完成情况 
    List<groupsuccess> groupoderinfo(int taskid,int groupid);
    
    //查询公司 所有备注信息
    List<kfMymemoinfo> memocorpinfo(int corpid);
    //查询页 信息
    List<kfMymemoinfo> memoselect(Map<String,Object> map);
    //需 审核 信息 
    List<kfMymemoinfo> shmemoinfo(String topuserid,int taskid);
    
    //审核状态
    int updatestate(int corpmemoid,int state);
}
