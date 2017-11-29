package com.js.service;

import java.util.Date;

import com.js.pojo.SHtcorpmemo;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午3:46:39 * @version 1.0 * @parameter  * @since  * @return  */
public interface ShtcorpmemoService {

	   // 打电话 纤维  条
    int getphoneqw( Integer userinfoid,Date startTime,Date endTime);
    
    // 打电话 纱线  条
    int getphonesx( Integer userinfoid,Date startTime,Date endTime );
    
    // 打电话 纺机  条
    int getphonefj( Integer userinfoid,Date startTime,Date endTime );
    
    // 打电话 人才  条
    int getphonerc(Integer userinfoid,Date startTime,Date endTime);
    
    

}
