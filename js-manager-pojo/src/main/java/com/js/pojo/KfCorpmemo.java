package com.js.pojo;

import java.util.Date;

public class KfCorpmemo {
    private Integer id;

    private Integer corpid;

    private Integer taskid;

    private String corpcontent;

    private String corpcontentmemo;

    private String username;

    private String userid;

    private Integer groupid;

    private Integer topgroupid;

    private String glid;

    private String linkname;

    private String linkphone;

    private Date createtime;

    private Integer state;

    private Integer shstate;

    private Integer linkmanid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCorpid() {
        return corpid;
    }

    public void setCorpid(Integer corpid) {
        this.corpid = corpid;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getCorpcontent() {
        return corpcontent;
    }

    public void setCorpcontent(String corpcontent) {
        this.corpcontent = corpcontent == null ? null : corpcontent.trim();
    }

    public String getCorpcontentmemo() {
        return corpcontentmemo;
    }

    public void setCorpcontentmemo(String corpcontentmemo) {
        this.corpcontentmemo = corpcontentmemo == null ? null : corpcontentmemo.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
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
        this.glid = glid == null ? null : glid.trim();
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone == null ? null : linkphone.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public Integer getLinkmanid() {
        return linkmanid;
    }

    public void setLinkmanid(Integer linkmanid) {
        this.linkmanid = linkmanid;
    }
}