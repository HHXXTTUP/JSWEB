package com.js.pojo;

import java.util.Date;

public class KfExaminememo {
    private Integer id;

    private Integer taskid;

    private Integer corpid;

    private Integer groupid;

    private String userid;

    private Integer topgroupid;

    private String glid;

    private Integer state;

    private Integer shstate;

    private Date addtime;

    private String operationuserid;

    private Date operationtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getCorpid() {
        return corpid;
    }

    public void setCorpid(Integer corpid) {
        this.corpid = corpid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getTopgroupid() {
        return topgroupid;
    }

    public void setTopgroupid(Integer topgroupid) {
        this.topgroupid = topgroupid;
    }

    public String getGlid() {
        return glid;
    }

    public void setGlid(String glid) {
        this.glid = glid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getShstate() {
        return shstate;
    }

    public void setShstate(Integer shstate) {
        this.shstate = shstate;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getOperationuserid() {
        return operationuserid;
    }

    public void setOperationuserid(String operationuserid) {
        this.operationuserid = operationuserid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}