package com.js.service.kf.trackcorp;

import java.util.List;

import com.js.pojo.KfFollowcorp;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月16日 上午9:48:18 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFFollowcorpService {
    int insert(KfFollowcorp record);
    int deleteByPrimaryKey(Integer id);
    List<KfFollowcorp> selectfollowinfo(String userid);
}
