package com.js.pojo;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年10月24日 下午10:21:18 * @version 1.0 * @parameter  * @since  * @return  */
public class Taskuser {
private	Integer  taskid;
private	String taskname;
private	String taskmemo;
private	Date starttime;
private	Date endtime;
private	String topuserid;
private	int groupid;
private	String groupname;
private	String glid;
private	int topgroupid;
private	String topgroupname;
private	String createman;
private	Integer fpcorp;
private	Integer successcorp;

public String getGlid() {
	return glid;
}
public void setGlid(String glid) {
	this.glid = glid;
}
public Integer getSuccesscorp() {
	return successcorp;
}
public void setSuccesscorp(Integer successcorp) {
	this.successcorp = successcorp;
}
public Integer getTaskid() {
	return taskid;
}
public void setTaskid(Integer taskid) {
	this.taskid = taskid;
}
public String getTaskname() {
	return taskname;
}
public void setTaskname(String taskname) {
	this.taskname = taskname;
}
public String getTaskmemo() {
	return taskmemo;
}
public void setTaskmemo(String taskmemo) {
	this.taskmemo = taskmemo;
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
public String getTopuserid() {
	return topuserid;
}
public void setTopuserid(String topuserid) {
	this.topuserid = topuserid;
}
public int getGroupid() {
	return groupid;
}
public void setGroupid(int groupid) {
	this.groupid = groupid;
}
public String getGroupname() {
	return groupname;
}
public void setGroupname(String groupname) {
	this.groupname = groupname;
}
public int getTopgroupid() {
	return topgroupid;
}
public void setTopgroupid(int topgroupid) {
	this.topgroupid = topgroupid;
}
public String getTopgroupname() {
	return topgroupname;
}
public void setTopgroupname(String topgroupname) {
	this.topgroupname = topgroupname;
}
public String getCreateman() {
	return createman;
}
public void setCreateman(String createman) {
	this.createman = createman;
}
public Integer getFpcorp() {
	return fpcorp;
}
public void setFpcorp(Integer fpcorp) {
	this.fpcorp = fpcorp;
}
	
	
	
	
	
}
