package com.zhousz.blog.model;

import java.util.Date;

public class ArticleWithBLOBs extends Article {
    private String introduction;

    private String htmlMaterial;

    private String mdMaterial;

    public ArticleWithBLOBs(Integer id, String title, Date gmtCreate, Date gmtModified, String introduction, String htmlMaterial, String mdMaterial) {
        super(id, title, gmtCreate, gmtModified);
        this.introduction = introduction;
        this.htmlMaterial = htmlMaterial;
        this.mdMaterial = mdMaterial;
    }

    public ArticleWithBLOBs() {
        super();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getHtmlMaterial() {
        return htmlMaterial;
    }

    public void setHtmlMaterial(String htmlMaterial) {
        this.htmlMaterial = htmlMaterial == null ? null : htmlMaterial.trim();
    }

    public String getMdMaterial() {
        return mdMaterial;
    }

    public void setMdMaterial(String mdMaterial) {
        this.mdMaterial = mdMaterial == null ? null : mdMaterial.trim();
    }
}