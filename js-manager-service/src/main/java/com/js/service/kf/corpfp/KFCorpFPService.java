package com.js.service.kf.corpfp;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.js.pojo.KfCorpfp;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月16日 下午3:29:32 * @version 1.0 * @parameter  * @since  * @return  */
public interface KFCorpFPService {
		int insert(KfCorpfp record);
	    //批量新增
	    int insertCropFP(String username,String userid,int creategroupid, Date createtime,int Allotid,int corpid,int groupid);

	    //分配详情
	    List<Map> fpinfo(String userid);
	    //直接删除清单 小组的企业
	    int deQDXZ(int allotid,int groupid);
	    
	    int deletegroup(int groupid);
	    
	    //按任务 显示分配情况
	    List<Map> fpcorp(int taskid);
}
