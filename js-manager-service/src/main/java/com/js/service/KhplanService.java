package com.js.service;

import java.util.Date;
import java.util.List;

import com.js.pojo.KhPlan;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月5日 下午1:42:36 * @version 1.0 * @parameter  * @since  * @return  */
public interface KhplanService {
    //本月计划  按钮
    List<KhPlan> getUserbyjh(Integer userinfoid,Date startTime,Date endTime);
    //本月计划  默认
    KhPlan  getUserbyjhmr(Integer userinfoid,Date dqtime);
    
    //下月计划
    List<KhPlan> getUserxyjh(Integer userinfoid,Date startTime,Date endTime);
    KhPlan getUserxyjhmr(Integer userinfoid,Date dqtime);
    
    //本月问题
    List<KhPlan> getUserbywtmr(Integer userinfoid,Date dqtime);
    List<KhPlan> getUserbywt(Integer userinfoid,Date startTime,Date endTime);

    //更新
    int updateByPrimaryKey(KhPlan record);
    int updateplan(Integer id,String plan,Date updatetime);
    //月新增
    int insertplan(String cate,String plan,Date addtime,String realname,Integer userinfoid);
}
