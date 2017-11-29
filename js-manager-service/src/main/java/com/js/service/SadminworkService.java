package com.js.service;

import java.util.Date;
import java.util.List;

import com.js.pojo.SAdminworklist;
import com.js.pojo.SAdminworklistWithBLOBs;
import com.js.pojo.STravel;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午8:44:41 * @version 1.0 * @parameter  * @since  * @return  */
public interface SadminworkService {
    // 得到  文章列表
    List<SAdminworklist>   getwzlist(Integer userinfoid,Date startTime,Date endTime);
    
    // 得到  文章列表
    List<SAdminworklist>   getyglist(Integer userinfoid,Date startTime,Date endTime);
    
    // 得到  文章列表
    List<SAdminworklist>   getcxdzlist(Integer userinfoid,Date startTime,Date endTime);
    
    // 得到  文章列表
    List<SAdminworklist>   getzclist(Integer userinfoid,Date startTime,Date endTime);
    
    // 得到  文章列表
    List<SAdminworklist>   gettjydlist(Integer userinfoid,Date startTime,Date endTime);
    
    // 得到  获取总分
    Object countpoint(Integer userinfoid,Date adddatime);
    // 得到  自定义查询 获取总分
    Object countselectpoint(Integer userinfoid,Date startTime,Date endTime);
    
    
    int addpointuser(SAdminworklistWithBLOBs record);

 // 得到得分列表
    List<SAdminworklistWithBLOBs> getdflist(Integer userinfoid,Date startTime,Date endTime);
    
    //更改分数
    int updatepoint(int pointid,Double point);
    
    int updateByPrimaryKeyWithBLOBs(SAdminworklistWithBLOBs record);
    

    int deleteByPrimaryKey(Integer ID);
}
