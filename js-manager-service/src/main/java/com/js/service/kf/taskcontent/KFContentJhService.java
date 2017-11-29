package com.js.service.kf.taskcontent;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月19日 下午5:36:47 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFContentJhService {
    //添加规则青岛
    int insertcontentjh(String usernma,String userid,Date createtime, int contentid,int contentinfoid);
    //删除分配的规则
    int deletecontentjh(String userid,int contentid,int contentinfoid);
    //删除计划
    int  deletecontent(int contentid);
}
