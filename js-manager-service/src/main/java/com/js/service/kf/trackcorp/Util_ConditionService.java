package com.js.service.kf.trackcorp;

import java.util.List;

import com.js.pojo.UtilCondition;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月7日 下午7:34:17 * @version 1.0 * @parameter  * @since  * @return  */
public interface Util_ConditionService {
	  //获取企业类别 接口
    List<UtilCondition> selectinfo(String typename);
}
