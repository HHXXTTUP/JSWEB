package com.js.service.kf.taskcontent;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月20日 下午2:45:12 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFAndTgContentService {
    
    //添加规则青岛
    int insertcontenttg(String usernma,String userid,Date createtime, int contentid,int contentinfoid);
    //删除分配的规则
    int  deletecontenttg(String userid,int contentid,int contentinfoid);
    
    //删除计划
     int  deletecontent(int contentid);
}
