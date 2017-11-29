package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.pojo.KfCorpsign;
import com.js.pojo.SCorp;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月1日 上午9:28:36 * @version 1.0 * @parameter  * @since  * @return  */


public interface KFCorpSignService {
    int insert(KfCorpsign record);
    //查询收藏的企业 信息
    List<SCorp> findsigncorp(int taskid,String userid,int signid );
    
}
