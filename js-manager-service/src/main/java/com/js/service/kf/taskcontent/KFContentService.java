package com.js.service.kf.taskcontent;

import java.util.List;
import java.util.Map;

import com.js.pojo.KfContent;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月17日 上午11:38:40 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFContentService {
    //获取  内容 下拉 
    List<Map> getcontentName(String userinfoid);
    
    //内容列表
    List<KfContent> getcontentList(String userinfoid);
    
    int update(int id,String contentName);
    int insert(KfContent record);
    int deleteByPrimaryKey(Integer id);
}
