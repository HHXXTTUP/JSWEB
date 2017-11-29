package com.js.service.corp;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.js.pojo.SAllcorp;
import com.js.pojo.SAllcorpWithBLOBs;
import com.js.pojo.kfMymemoinfo;
import com.js.pojo.oldmemoinfo;



/** * @author  作者 E-mail: * @date 创建时间：2017年8月29日 下午2:57:09 * @version 1.0 * @parameter  * @since  * @return  */
public interface SallcorpService {
    // 获取用户 企业库  新增 人
    int getadduser( Integer userinfoid,Date startTime,Date endTime);
    
    // 获取用户 企业库  新增 人
    int getaddzsman(Integer userinfoid,Date startTime,Date endTime );
    
    
    // 获取用户 企业库  新增 人
    int getaddzsqy(Integer userinfoid,Date startTime,Date endTime );
    
    // 获取用户微信号
    int getcountwxh(Integer userinfoid,Date startTime,Date endTime );
    List<Map> getcorpcontent(String corpname);
    int upcorpname(String oldcorpname,String corpname );
    int updateByPrimaryKeySelective(SAllcorpWithBLOBs record);
    
    //获取 企业的 备注信息
    List<kfMymemoinfo> findcorpmemo(int corpid);
    
    //获取 企业的 备注信息
    List<kfMymemoinfo> findcorplinkmemo(int corpid);
}
