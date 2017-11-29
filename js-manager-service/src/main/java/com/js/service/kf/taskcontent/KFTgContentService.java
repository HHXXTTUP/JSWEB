package com.js.service.kf.taskcontent;

import java.util.List;
import java.util.Map;

import com.js.pojo.KfContent;
import com.js.pojo.KfTgcontent;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月20日 下午2:45:40 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFTgContentService {
    //获取  内容 下拉 
    List<Map> gettgcontentName(String userinfoid);
    //内容列表
    List<KfTgcontent> gettgcontentList(String userinfoid);
    int update(int id,String contentName);
    int insert(KfTgcontent record);
    int deleteByPrimaryKey(Integer id);
}
