package com.js.service;

import java.util.Date;


/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午2:24:02 * @version 1.0 * @parameter  * @since  * @return  */
public interface SalllinkcorpService {
    // ��ȡ�û���ҵ��������ҵ�����ˣ�
    int getusercorp( Integer userinfoid,Date startTime,Date endTime);
}
