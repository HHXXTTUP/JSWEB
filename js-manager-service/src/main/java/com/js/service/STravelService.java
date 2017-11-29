package com.js.service;

import java.util.Date;
import java.util.List;

import com.js.pojo.KhPoint;
import com.js.pojo.KhTime;
import com.js.pojo.STravel;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月25日 上午10:13:50 * @version 1.0 * @parameter  * @since  * @return  */
public interface STravelService {
	   
    // 得到 出差列表
    List<STravel>   getcclist(String realname,Date startTime,Date endTime);
    // 得到展会列表
    List<STravel>   getzhlist(String realname,Date startTime,Date endTime);
    
    
    //获取时间 表
    List<KhTime> gettimeinfo();
    //获取时间 表
    List<KhPoint> getpointinfo();
}
