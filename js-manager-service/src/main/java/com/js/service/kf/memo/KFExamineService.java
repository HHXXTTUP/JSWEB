package com.js.service.kf.memo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.js.pojo.KfExaminememo;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月26日 下午4:49:09 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFExamineService {
    int insert(KfExaminememo record);
    //需要审核的内容
    List<Map> topusershcorp(String userid,int taskid);
    int updateByPrimaryKeySelective(KfExaminememo record);
    //修改状态
    int updatestate(int taskid,int corpid,String userid,int state,String operationuserid,Date operationtime);
}
