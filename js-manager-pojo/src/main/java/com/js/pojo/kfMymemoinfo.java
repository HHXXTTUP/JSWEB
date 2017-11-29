package com.js.pojo;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月18日 下午4:00:33 * @version 1.0 * @parameter  * @since  * @return  */
public class kfMymemoinfo {
	public int getCorpmemoid() {
		return corpmemoid;
	}
	public void setCorpmemoid(int corpmemoid) {
		this.corpmemoid = corpmemoid;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public int getCorpid() {
		return corpid;
	}
	public void setCorpid(int corpid) {
		this.corpid = corpid;
	}
	public String getCorpname() {
		return corpname;
	}
	public void setCorpname(String corpname) {
		this.corpname = corpname;
	}

	public String getMemoid() {
		return memoid;
	}
	public void setMemoid(String memoid) {
		this.memoid = memoid;
	}
	public String getMemoname() {
		return memoname;
	}
	public void setMemoname(String memoname) {
		this.memoname = memoname;
	}
	public String getCorpcontentmemo() {
		return corpcontentmemo;
	}
	public void setCorpcontentmemo(String corpcontentmemo) {
		this.corpcontentmemo = corpcontentmemo;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getLinkname() {
		return linkname;
	}
	public void setLinkname(String linkname) {
		this.linkname = linkname;
	}
	public String getLinkphone() {
		return linkphone;
	}
	public void setLinkphone(String linkphone) {
		this.linkphone = linkphone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private int  corpmemoid;
	
	private int  taskid;
	private String taskname;
	private Date endtime;
	
	private int  corpid;
	private String  corpname;
	
	private String memoid;
	private String memoname;
	private String corpcontentmemo;
	
	private Date createtime;
	private int state;
	
	private int linkmanid;
	public int getLinkmanid() {
		return linkmanid;
	}
	public void setLinkmanid(int linkmanid) {
		this.linkmanid = linkmanid;
	}
	private String linkname;
	private String linkphone;
	private String username ;
	
	
}
