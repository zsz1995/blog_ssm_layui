package com.zhousz.blog.dao;

import com.zhousz.blog.model.User;
import com.zhousz.blog.model.UserWithBLOBs;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}