package com.zhousz.blog.dao;

import com.zhousz.blog.model.AdminUser;
import com.zhousz.blog.model.AdminUserWithBLOBs;

public interface AdminUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminUserWithBLOBs record);

    int insertSelective(AdminUserWithBLOBs record);

    AdminUserWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdminUserWithBLOBs record);

    int updateByPrimaryKey(AdminUser record);
}