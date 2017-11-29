package com.js.service;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 上午11:25:46 * @version 1.0 * @parameter  * @since  * @return  */
public interface SmoneyService {
	  // 获取 缴费新增企业  纱线
    int getjfsx(Integer userinfoid,Date startTime,Date endTime );
    
    // 获取 缴费新增企业  纱线
    int getjfqw(Integer userinfoid,Date startTime,Date endTime );
    
    // 获取 缴费新增企业  纱线
    int getjffj(Integer userinfoid,Date startTime,Date endTime );
    
    // 获取 缴费新增企业  纱线
    int getjfrc(Integer userinfoid,Date startTime,Date endTime );
    
}
