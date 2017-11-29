package com.js.pojo;

import java.util.Date;

public class PmRole {
    private Integer id;

    private String roleName;

    private Integer rolelead;

    private Integer rolelevel;

    private Integer isEnabled;

    private String htOperName;

    private Date htOperDate;

    private Integer htOperState;

    private String htOperMemo;

    private String source;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRolelead() {
        return rolelead;
    }

    public void setRolelead(Integer rolelead) {
        this.rolelead = rolelead;
    }

    public Integer getRolelevel() {
        return rolelevel;
    }

    public void setRolelevel(Integer rolelevel) {
        this.rolelevel = rolelevel;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getHtOperName() {
        return htOperName;
    }

    public void setHtOperName(String htOperName) {
        this.htOperName = htOperName;
    }

    public Date getHtOperDate() {
        return htOperDate;
    }

    public void setHtOperDate(Date htOperDate) {
        this.htOperDate = htOperDate;
    }

    public Integer getHtOperState() {
        return htOperState;
    }

    public void setHtOperState(Integer htOperState) {
        this.htOperState = htOperState;
    }

    public String getHtOperMemo() {
        return htOperMemo;
    }

    public void setHtOperMemo(String htOperMemo) {
        this.htOperMemo = htOperMemo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}