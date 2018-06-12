package com.zhousz.blog.dao;

import com.zhousz.blog.model.TagArticle;
import com.zhousz.blog.model.TagArticleKey;

public interface TagArticleMapper {
    int deleteByPrimaryKey(TagArticleKey key);

    int insert(TagArticle record);

    int insertSelective(TagArticle record);

    TagArticle selectByPrimaryKey(TagArticleKey key);

    int updateByPrimaryKeySelective(TagArticle record);

    int updateByPrimaryKey(TagArticle record);
}