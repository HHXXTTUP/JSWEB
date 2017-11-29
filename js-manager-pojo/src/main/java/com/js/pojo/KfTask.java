package com.js.pojo;

import java.util.Date;

public class KfTask {
    private Integer id;

    private String createman;

    private String createuserid;

    private Date createtime;

    private String taskname;

    private String taskmemo;

    private Date starttime;

    private Date endtime;

    private String allotname;

    private String contentname;

    private String state;

    private Integer allotid;

    private Integer contentid;

    private Integer isallcorp;

    private Integer isspoken;

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
        this.createman = createman == null ? null : createman.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getTaskmemo() {
        return taskmemo;
    }

    public void setTaskmemo(String taskmemo) {
        this.taskmemo = taskmemo == null ? null : taskmemo.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAllotname() {
        return allotname;
    }

    public void setAllotname(String allotname) {
        this.allotname = allotname == null ? null : allotname.trim();
    }

    public String getContentname() {
        return contentname;
    }

    public void setContentname(String contentname) {
        this.contentname = contentname == null ? null : contentname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getAllotid() {
        return allotid;
    }

    public void setAllotid(Integer allotid) {
        this.allotid = allotid;
    }

    public Integer getContentid() {
        return contentid;
    }

    public void setContentid(Integer contentid) {
        this.contentid = contentid;
    }

    public Integer getIsallcorp() {
        return isallcorp;
    }

    public void setIsallcorp(Integer isallcorp) {
        this.isallcorp = isallcorp;
    }

    public Integer getIsspoken() {
        return isspoken;
    }

    public void setIsspoken(Integer isspoken) {
        this.isspoken = isspoken;
    }
}