package com.js.pojo;

import java.util.Date;

public class KfContent {
    private Integer id;

    private String contentname;

    private String createman;

    private Date createtime;

    private String createuserid;

    private String creatememo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContentname() {
        return contentname;
    }

    public void setContentname(String contentname) {
        this.contentname = contentname;
    }

    public String getCreateman() {
        return createman;
    }

    public void setCreateman(String createman) {
        this.createman = createman;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public String getCreatememo() {
        return creatememo;
    }

    public void setCreatememo(String creatememo) {
        this.creatememo = creatememo;
    }
}