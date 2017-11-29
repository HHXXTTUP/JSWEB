package com.js.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 上午11:47:49 * @version 1.0 * @parameter  * @since  * @return  */
public interface SmoneymemoService {
	  List<Map> getjflist(Integer userinfoid,Date startTime,Date endTime );
	  List<Map> getjfxflist(Integer userinfoid,Date startTime,Date endTime );
	    
	  // 获取 缴费  续费企业  纱线
    int getjfyfsx(Integer userinfoid,Date startTime,Date endTime );
    
    // 获取 缴费    续费企业 纤维
    int getjfyfqw(Integer userinfoid,Date startTime,Date endTime );
    
    // 获取 缴费   续费企业 纺机
    int getjfyffj(Integer userinfoid,Date startTime,Date endTime );
    
    // 获取 缴费  续费企业  人才
    int getjfyfrc(Integer userinfoid,Date startTime,Date endTime );
}
