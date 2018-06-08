package com.zhousz.tmall.service.impl;

import com.zhousz.tmall.dao.UserDao;
import com.zhousz.tmall.model.UserDomain;
import com.zhousz.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(UserDomain user) {
        return userDao.insert(user);
    }
}
