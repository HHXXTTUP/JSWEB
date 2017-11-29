package com.js.pojo;

import java.util.Date;

public class KfTgcontent {
    private Integer id;

    private String tgcontentName;

    private String createname;

    private Date createntime;

    private String createuserid;

    private String creatememo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTgcontentName() {
        return tgcontentName;
    }

    public void setTgcontentName(String tgcontentName) {
        this.tgcontentName = tgcontentName;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname;
    }

    public Date getCreatentime() {
        return createntime;
    }

    public void setCreatentime(Date createntime) {
        this.createntime = createntime;
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