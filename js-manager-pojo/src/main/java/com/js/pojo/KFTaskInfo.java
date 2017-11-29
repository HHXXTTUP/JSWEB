package com.js.pojo;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月28日 下午4:26:24 * @version 1.0 * @parameter  * @since  * @return  */
public class KFTaskInfo {

	private  Integer id;
	
	private  String  taskname;
	
	private String createman;
	
	private Date starttime;
	
	private Date endtime;
	
	private String  taskmemo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public String getCreateman() {
		return createman;
	}

	public void setCreateman(String createman) {
		this.createman = createman;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getTaskmemo() {
		return taskmemo;
	}

	public void setTaskmemo(String taskmemo) {
		this.taskmemo = taskmemo;
	}

}
