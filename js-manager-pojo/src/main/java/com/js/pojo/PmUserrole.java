package com.js.pojo;

import java.util.Date;

public class PmUserrole {
    private Integer id;

    private Integer roleid;

    private Integer userinfoid;

    private Integer adduserid;

    private String addueser;

    private Date addtime;

    private String adduserIP;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Integer getAdduserid() {
        return adduserid;
    }

    public void setAdduserid(Integer adduserid) {
        this.adduserid = adduserid;
    }

    public String getAddueser() {
        return addueser;
    }

    public void setAddueser(String addueser) {
        this.addueser = addueser;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAdduserIP() {
        return adduserIP;
    }

    public void setAdduserIP(String adduserIP) {
        this.adduserIP = adduserIP;
    }
}