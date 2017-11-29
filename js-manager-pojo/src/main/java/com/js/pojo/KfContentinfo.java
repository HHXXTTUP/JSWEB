package com.js.pojo;

import java.util.Date;

public class KfContentinfo {
    private Integer id;

    private String memoname;

    private String createman;

    private String createuserid;

    private Date createtime;

    private String creatememo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemoname() {
        return memoname;
    }

    public void setMemoname(String memoname) {
        this.memoname = memoname;
    }

    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatememo() {
        return creatememo;
    }

    public void setCreatememo(String creatememo) {
        this.creatememo = creatememo;
    }
}