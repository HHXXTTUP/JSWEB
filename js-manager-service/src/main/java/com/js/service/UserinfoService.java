package com.js.service;


import java.util.List;
import java.util.Map;
import java.util.Set;

import com.js.pojo.Userinfo;

public interface UserinfoService {
    List<Userinfo> getUserList(String realName);
    List<Map> getLoginUser(String userName);
    Set<String> getLoginroles(String userName);
    
    //添加登陆用户
    Integer AddLoginUser(Userinfo userinfo);
    Integer DeleteLoginUser(int id);
    
    
    Userinfo getUserAllList(Userinfo user);
    //查询所用用户真实姓名 及ID
    List<Map> getUserRealName();
    
    int updateByPrimaryKeySelective(Userinfo record);
    
    //查询登陆用户所有栏目以及权限
    List<Map> getmenuinfo(String userName);
    
    
    
    //查询登陆用户1级栏目
    List<Map> getmenuone(String userName);
    //查询登陆用户2级栏目
    List<Map> getmenutwo(String userName);
    //查询登陆用户3级栏目
    List<Map> getmenuthree(String userName);
  //获取权限
    String getqxinfo(String userid,Integer menuid);
    
}
