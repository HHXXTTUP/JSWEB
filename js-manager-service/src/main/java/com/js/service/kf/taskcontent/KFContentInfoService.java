package com.js.service.kf.taskcontent;

import java.util.List;

import com.js.pojo.KfContentinfo;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月19日 上午11:27:41 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFContentInfoService {
    //查询规则详细信息
    List<KfContentinfo> contentinfolist(String userid);
    int insert(KfContentinfo record);
    int deleteByPrimaryKey(Integer id);
    //修改备注名称
    int updatecontentName(int contentid,String memoName);
    //分配计划好之后信息
    List<KfContentinfo> contenoklist(String userid,int contentid);
    //显示分配好通过备注信息
    List<KfContentinfo> contentgoklist(String userid,int contentid);
    
    List<KfContentinfo> contentglist(String userid,int contentid);
    //分配备注信息
    List<KfContentinfo> contentinfojhlist(String userid,int contentid);
    
    String ContentnName(int contentid);
}
