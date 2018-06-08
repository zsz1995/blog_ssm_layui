package com.zhousz.tmall.dao;

import com.zhousz.tmall.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    int insert(UserDomain user);

    List<UserDomain> selectUsers();
}
