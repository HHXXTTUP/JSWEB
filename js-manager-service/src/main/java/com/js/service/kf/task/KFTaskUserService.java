package com.js.service.kf.task;

import java.util.List;
import java.util.Map;

import com.js.pojo.KfAndtaskallot;
import com.js.pojo.SCorp;
import com.js.pojo.Taskuser;
import com.js.pojo.usertaskcorp;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月24日 下午10:32:59 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFTaskUserService {
    //查询登陆 任务清单
    List<Taskuser> taskuser(String userid);
    Map findtaskgroup(String userid,int taskid);
    //查询任务对应的规则
    List<Map> taskcontent(int taskid);
    //查询任务对应的通过规则
    List<Map> tasktgcontent(int taskid);
    
    //查询用户登陆尽量 点击任务 对应的 企业
    List<usertaskcorp>taskusercorp(Map<String,Object> map);
    //查询用户点击全部的所有 企业
    List<usertaskcorp>allusercorp(Map<String,Object> map);
    
    //报表功能   查看所有的任务信息
    List<Map> bbtaskall();
    
    //报表功能   查看某个任务 对应分配企业性质
    List<Map> bbcorpinfo(int taskid);
    //获取我的任务 以及我的清单
    List<com.js.pojo.mytaskfp>mytaskfp(String userid);
    List<com.js.pojo.mytaskfp>admintaskfp();
    //获取我的任务 以及我的清单之外的企业
    //获取我的任务 以及我的清单之外的企业
    List<Map>mytaskfpcorp(Map<String,Object> map);
    List<Map>adminfpcorp(Map<String,Object> map);
    KfAndtaskallot findtaskinfo(int taskid);
    
}
