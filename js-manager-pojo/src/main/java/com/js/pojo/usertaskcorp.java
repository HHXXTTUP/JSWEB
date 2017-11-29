package com.js.pojo;

import java.util.Date;

/** * @author  作者 E-mail: * @date 创建时间：2017年11月13日 下午5:14:13 * @version 1.0 * @parameter  * @since  * @return  */
public class usertaskcorp {
	 private int ID; 
	 private String corpName;
	 private Date RegDate;
	 private Date EndDate;
	 private Date LoginDate;
	 private int loginCount;
	 private String sxwlinkname;

	 private int istry ;
	 public int getIstry() {
		return istry;
	}
	public void setIstry(int istry) {
		this.istry = istry;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCorpName() {
		return corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}
	public Date getRegDate() {
		return RegDate;
	}
	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public Date getLoginDate() {
		return LoginDate;
	}
	public void setLoginDate(Date loginDate) {
		LoginDate = loginDate;
	}
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public String getSxwlinkname() {
		return sxwlinkname;
	}
	public void setSxwlinkname(String sxwlinkname) {
		this.sxwlinkname = sxwlinkname;
	}
	public String getSxwHtName() {
		return SxwHtName;
	}
	public void setSxwHtName(String sxwHtName) {
		SxwHtName = sxwHtName;
	}
	public int getIsFibre() {
		return IsFibre;
	}
	public void setIsFibre(int isFibre) {
		IsFibre = isFibre;
	}
	public int getIsGood() {
		return IsGood;
	}
	public void setIsGood(int isGood) {
		IsGood = isGood;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
	}
	public int getIsMaybeMoney() {
		return IsMaybeMoney;
	}
	public void setIsMaybeMoney(int isMaybeMoney) {
		IsMaybeMoney = isMaybeMoney;
	}
	private String SxwHtName;
	 private int IsFibre;
	 private int IsGood;
	 private int Money;
	 private int IsMaybeMoney;

}
