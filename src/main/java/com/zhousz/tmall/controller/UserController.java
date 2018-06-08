package com.zhousz.tmall.controller;

import com.zhousz.tmall.model.UserDomain;
import com.zhousz.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/add")
    public int addUser(UserDomain userDomain){
        return userService.addUser(userDomain);
    }

}
