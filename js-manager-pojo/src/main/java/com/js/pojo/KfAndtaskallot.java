package com.js.pojo;

import java.util.Date;

public class KfAndtaskallot {
    private Integer id;

    private String createman;

    private String createuserid;

    private Date createtime;

    private String creatememo;

    private Integer allotid;

    private Integer taskid;

    private Integer contentid;

    private Integer tgcontentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAllotid() {
        return allotid;
    }

    public void setAllotid(Integer allotid) {
        this.allotid = allotid;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    public Integer getTgcontentid() {
        return tgcontentid;
    }

    public void setTgcontentid(Integer tgcontentid) {
        this.tgcontentid = tgcontentid;
    }
}