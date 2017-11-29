package com.js.service;

import java.util.Date;




/** * @author  作者 E-mail:
* @date 创建时间：2017年8月29日 上午10:24:44 
* * @version 1.0 
* * @parameter  * @since 
*  * @return  */

public interface NewsService {
	 // 获取用户提供新闻数量
	 int getcountuser(Integer userinfoid,Date startTime,Date endTime);
}
