package com.zhousz.blog.model;

import java.util.Date;

public class Resume {
    private Integer id;

    private String title;

    private Date gmtCreate;

    private Date gmtModified;

    public Resume(Integer id, String title, Date gmtCreate, Date gmtModified) {
        this.id = id;
        this.title = title;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public Resume() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}