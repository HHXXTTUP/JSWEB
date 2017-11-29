package com.js.pojo;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月1日 上午9:52:02 * @version 1.0 * @parameter  * @since  * @return  */
public class KFSPMemoInfo {

	  private int id;
	  private String memoname;
	  private String  corpcontentmemo;
	  private String username;
	  private Date createtime;
	  private String linkname;
	  private String linkphone ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
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
	
}
