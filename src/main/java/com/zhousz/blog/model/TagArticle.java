package com.zhousz.blog.model;

import java.util.Date;

public class TagArticle extends TagArticleKey {
    private Date gmtCreate;

    private Date gmtModified;

    public TagArticle(Integer id, Integer tagId, Integer articleId, Date gmtCreate, Date gmtModified) {
        super(id, tagId, articleId);
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public TagArticle() {
        super();
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