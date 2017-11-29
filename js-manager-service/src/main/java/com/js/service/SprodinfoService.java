package com.js.service;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年8月31日 下午2:31:52 * @version 1.0 * @parameter  * @since  * @return  */
public interface SprodinfoService {
    int getcpfbjs(Integer userinfoid,Date startTime,Date endTime );
    int getcpfbhq(Integer userinfoid,Date startTime,Date endTime );
}
