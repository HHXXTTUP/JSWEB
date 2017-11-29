package com.js.service.kf.task;

import java.util.List;
import java.util.Map;

import com.js.pojo.KFTaskInfo;
import com.js.pojo.KfTask;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月27日 上午9:45:41 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFTaskService {
    //获取任务 列表 
    List<KfTask> gettaskall(String userinfoid);
  
    //获取任务 列表 
    List<KfTask> gettaskinfo(String userinfoid);
    
    //获取 任务下拉 
    List<Map> gettaskName(String userinfoid);
    
    //新增任务
    int insert(KfTask record);
    //删除任务
    int deleteByPrimaryKey(Integer id);
    
    int updateByPrimaryKey(KfTask record);
    
    int updatestate(int taskid,String state);
}
