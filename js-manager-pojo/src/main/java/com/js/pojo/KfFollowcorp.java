package com.js.pojo;

import java.util.Date;

public class KfFollowcorp {
    private Integer id;

    private String followcontent;

    private String followlinkmen;

    private String followlinkphone;

    private Integer followlinkmanid;

    private Integer taskid;

    private Integer corpid;

    private String userid;

    private Date addtime;

    private Integer state;

    private String followcompany;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFollowcontent() {
        return followcontent;
    }

    public void setFollowcontent(String followcontent) {
        this.followcontent = followcontent == null ? null : followcontent.trim();
    }

    public String getFollowlinkmen() {
        return followlinkmen;
    }

    public void setFollowlinkmen(String followlinkmen) {
        this.followlinkmen = followlinkmen == null ? null : followlinkmen.trim();
    }

    public String getFollowlinkphone() {
        return followlinkphone;
    }

    public void setFollowlinkphone(String followlinkphone) {
        this.followlinkphone = followlinkphone == null ? null : followlinkphone.trim();
    }

    public Integer getFollowlinkmanid() {
        return followlinkmanid;
    }

    public void setFollowlinkmanid(Integer followlinkmanid) {
        this.followlinkmanid = followlinkmanid;
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

    public String getFollowcompany() {
        return followcompany;
    }

    public void setFollowcompany(String followcompany) {
        this.followcompany = followcompany == null ? null : followcompany.trim();
    }
}