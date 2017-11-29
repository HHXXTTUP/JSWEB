package com.js.pojo;

import java.util.Date;

public class KfAllot {
    private Integer id;

    private String createmen;

    private String createuserid;

    private Date createtime;

    private String allotname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatemen() {
        return createmen;
    }

    public void setCreatemen(String createmen) {
        this.createmen = createmen;
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

    public String getAllotname() {
        return allotname;
    }

    public void setAllotname(String allotname) {
        this.allotname = allotname;
    }
}