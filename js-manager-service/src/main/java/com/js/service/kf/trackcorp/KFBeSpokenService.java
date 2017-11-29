package com.js.service.kf.trackcorp;

import java.util.List;
import java.util.Map;

import com.js.pojo.KfBespoken;
import com.js.pojo.kfMymemoinfo;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月14日 下午2:01:20 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFBeSpokenService {
    int insert(KfBespoken record);
    int  updatestate(int spokenid);

    List<KfBespoken>  KfBespokeninfo(Map<String,Object> map);
    int deleteByPrimaryKey(Integer id);
    int dedefault(int corpid,int taskid,String userid);
}
