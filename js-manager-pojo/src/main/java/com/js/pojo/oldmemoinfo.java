package com.js.pojo;/** * @author  作者 E-mail: * @date 创建时间：2017年11月20日 上午10:42:34 * @version 1.0 * @parameter  * @since  * @return  */
public class oldmemoinfo {
	private int CORPID;
	private int userid;
	private String UserName;
	private String MEMO;
	private String HuiMemo;
	public int getCORPID() {
		return CORPID;
	}
	public void setCORPID(int cORPID) {
		CORPID = cORPID;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getMEMO() {
		return MEMO;
	}
	public void setMEMO(String mEMO) {
		MEMO = mEMO;
	}
	public String getHuiMemo() {
		return HuiMemo;
	}
	public void setHuiMemo(String huiMemo) {
		HuiMemo = huiMemo;
	}
	public String getADDdATE() {
		return ADDdATE;
	}
	public void setADDdATE(String aDDdATE) {
		ADDdATE = aDDdATE;
	}
	public String getSxwname() {
		return sxwname;
	}
	public void setSxwname(String sxwname) {
		this.sxwname = sxwname;
	}
	private String ADDdATE;
	private String sxwname;
}
