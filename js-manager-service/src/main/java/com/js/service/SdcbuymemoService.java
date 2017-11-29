package com.js.service;

import java.util.Date;
import java.util.List;

import com.js.pojo.kfMymemoinfo;


/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午7:49:48 * @version 1.0 * @parameter  * @since  * @return  */
public interface SdcbuymemoService {
	   // 获取  企业库  买家 条
    int BuyerCount( Integer userinfoid,Date startTime,Date endTime );
    
    //获取 企业的 备注信息
    List<kfMymemoinfo> finddcbuymemo(String corpname);
    
    
    // 获取 黄页 条
    int YellowCount( Integer userinfoid,Date startTime,Date endTime);
    
    // 获取 展会 条
    int ExpoCount( Integer userinfoid,Date startTime,Date endTime );
}
