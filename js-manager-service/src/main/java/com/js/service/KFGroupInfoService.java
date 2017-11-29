package com.js.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.js.pojo.KfGroupinfo;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月11日 上午9:32:34 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFGroupInfoService {
    //查询组员列表
    List<KfGroupinfo> Grouplist(String userid);
    //新增
    int insert(KfGroupinfo record);
    
    int deleteByPrimaryKey(Integer id);
    
    int updateByPrimaryKey(KfGroupinfo record);
    
    //获取小组下拉框
    List<Map> getgroupName(String userid);
    List<Map> getmygroup(String userid);
    //查询族谱ID
    String getgroupglid(int groupid);
    //添加子 菜单
   int insertgrouptwo(String createman,String createuserid,Date createtime,String groupname,String groupmemo,int topgroupid,String topglid,int myid);
   //获取最大id
   int getmyid();
}
