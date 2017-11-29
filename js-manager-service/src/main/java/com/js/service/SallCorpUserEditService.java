package com.js.service;

import java.util.Date;

import com.js.pojo.SAllcorpuseredit;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午3:20:13 * @version 1.0 * @parameter  * @since  * @return  */
public interface SallCorpUserEditService {
    
	 // 获取用户 企业库  修改人 
    int geteditcorp(Integer userinfoid,Date startTime,Date endTime);
    
 // 获取用户 企业库  修改 企业
    int getedituser(Integer userinfoid,Date startTime,Date endTime );
}
