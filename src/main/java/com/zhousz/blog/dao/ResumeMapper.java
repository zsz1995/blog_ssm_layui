package com.zhousz.blog.dao;

import com.zhousz.blog.model.Resume;
import com.zhousz.blog.model.ResumeWithBLOBs;

public interface ResumeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeWithBLOBs record);

    int insertSelective(ResumeWithBLOBs record);

    ResumeWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ResumeWithBLOBs record);

    int updateByPrimaryKey(Resume record);
}