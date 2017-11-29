package com.js.service.kf.task;

import java.util.List;
import java.util.Map;

import com.js.pojo.KfAllot;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月29日 下午3:09:46 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFAllotService {
	//查询清单列表
    List<KfAllot> allotlist(String userid);
    //新增清单
    int insert(KfAllot record);
    //删除
    int deleteByPrimaryKey(Integer id);
    
    int updateByPrimaryKey(KfAllot record);
    
    
    //获取 清单下拉 
    List<Map> getallotName(String userinfoid);
}
