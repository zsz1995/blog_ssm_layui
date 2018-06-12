package com.zhousz.blog.model;

import java.util.Date;

public class UserWithBLOBs extends User {
    private String hobby;

    private String motto;

    private String mdInfo;

    public UserWithBLOBs(Integer id, String username, String password, Date birthDate, String nickname, String email, String github, String qq, String wecaht, String avatar, Integer status, Integer level, Date gmtCreate, Date gmtModified, String hobby, String motto, String mdInfo) {
        super(id, username, password, birthDate, nickname, email, github, qq, wecaht, avatar, status, level, gmtCreate, gmtModified);
        this.hobby = hobby;
        this.motto = motto;
        this.mdInfo = mdInfo;
    }

    public UserWithBLOBs() {
        super();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto == null ? null : motto.trim();
    }

    public String getMdInfo() {
        return mdInfo;
    }

    public void setMdInfo(String mdInfo) {
        this.mdInfo = mdInfo == null ? null : mdInfo.trim();
    }
}