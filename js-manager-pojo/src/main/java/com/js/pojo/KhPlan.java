package com.js.pojo;

import java.util.Date;

public class KhPlan {
    private Integer id;

    private String cate;

    private String planContent;

    private Date addtime;

    private String addrealname;

    private Integer adduserinfoid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddrealname() {
        return addrealname;
    }

    public void setAddrealname(String addrealname) {
        this.addrealname = addrealname;
    }

    public Integer getAdduserinfoid() {
        return adduserinfoid;
    }

    public void setAdduserinfoid(Integer adduserinfoid) {
        this.adduserinfoid = adduserinfoid;
    }
}