package com.js.pojo;

import java.util.Date;

public class KfBespoken {
    private Integer id;

    private String spokencontent;

    private Date spokentime;

    private String spokenlinkmen;

    private String spokenlinkphone;

    private Integer spokenlinkmanid;

    private Integer taskid;

    private Integer corpid;

    private String userid;

    private Date addtime;

    private Integer state;

    private String spokencompany;

    private Integer isdefault;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpokencontent() {
        return spokencontent;
    }

    public void setSpokencontent(String spokencontent) {
        this.spokencontent = spokencontent == null ? null : spokencontent.trim();
    }

    public Date getSpokentime() {
        return spokentime;
    }

    public void setSpokentime(Date spokentime) {
        this.spokentime = spokentime;
    }

    public String getSpokenlinkmen() {
        return spokenlinkmen;
    }

    public void setSpokenlinkmen(String spokenlinkmen) {
        this.spokenlinkmen = spokenlinkmen == null ? null : spokenlinkmen.trim();
    }

    public String getSpokenlinkphone() {
        return spokenlinkphone;
    }

    public void setSpokenlinkphone(String spokenlinkphone) {
        this.spokenlinkphone = spokenlinkphone == null ? null : spokenlinkphone.trim();
    }

    public Integer getSpokenlinkmanid() {
        return spokenlinkmanid;
    }

    public void setSpokenlinkmanid(Integer spokenlinkmanid) {
        this.spokenlinkmanid = spokenlinkmanid;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getSpokencompany() {
        return spokencompany;
    }

    public void setSpokencompany(String spokencompany) {
        this.spokencompany = spokencompany == null ? null : spokencompany.trim();
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }
}