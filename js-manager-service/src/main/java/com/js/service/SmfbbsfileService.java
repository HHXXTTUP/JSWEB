package com.js.service;

import java.util.Date;

import com.js.pojo.SMfbbsfile;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 上午11:46:53 * @version 1.0 * @parameter  * @since  * @return  */
public interface SmfbbsfileService {
	   // 获取用户提供新闻数量
    int getfilecount(Integer userinfoid,Date startTime,Date endTime);
}
