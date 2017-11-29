package com.js.pojo;

public class Menu {
    private Integer MENUID;

    private Integer UPID;

    private Integer rank;

    private String title;

    private String icon;

    private String target;

    private Integer sort;

    private Integer userIDVerify;

    private String modifyID;

    private String modifyDateTime;

    private String qxname;

    private String URL;

    public Integer getMENUID() {
        return MENUID;
    }

    public void setMENUID(Integer MENUID) {
        this.MENUID = MENUID;
    }

    public Integer getUPID() {
        return UPID;
    }

    public void setUPID(Integer UPID) {
        this.UPID = UPID;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getUserIDVerify() {
        return userIDVerify;
    }

    public void setUserIDVerify(Integer userIDVerify) {
        this.userIDVerify = userIDVerify;
    }

    public String getModifyID() {
        return modifyID;
    }

    public void setModifyID(String modifyID) {
        this.modifyID = modifyID;
    }

    public String getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(String modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public String getQxname() {
        return qxname;
    }

    public void setQxname(String qxname) {
        this.qxname = qxname;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}