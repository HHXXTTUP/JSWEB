package com.js.pojo;

import java.util.Date;

public class SHtcorpmemo {
    private Integer ID;

    private String bigCate;

    private String corpCate;

    private Integer corpID;

    private String corpName;

    private String sxwName;

    private Date addDate;

    private String addIP;

    private Integer status;

    private Integer userinfoid;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBigCate() {
        return bigCate;
    }

    public void setBigCate(String bigCate) {
        this.bigCate = bigCate;
    }

    public String getCorpCate() {
        return corpCate;
    }

    public void setCorpCate(String corpCate) {
        this.corpCate = corpCate;
    }

    public Integer getCorpID() {
        return corpID;
    }

    public void setCorpID(Integer corpID) {
        this.corpID = corpID;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getSxwName() {
        return sxwName;
    }

    public void setSxwName(String sxwName) {
        this.sxwName = sxwName;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getAddIP() {
        return addIP;
    }

    public void setAddIP(String addIP) {
        this.addIP = addIP;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }
}