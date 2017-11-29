package com.js.service;

import java.util.List;

import com.js.pojo.SAllcorppermemo;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月6日 上午9:28:06 * @version 1.0 * @parameter  * @since  * @return  */
public interface S_AllCorpPerMemoService {
    //查找企业联系人 
    List<SAllcorppermemo> findcorpcontent(String corpname);
}
