package com.ssmdemo.demo.controller;

import com.ssmdemo.demo.dao.UserMapper;
import com.ssmdemo.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/pic")
    public User pic() {
        //调用dao层
        User user = userMapper.selectUserByName("2x");
        return user;
    }
}
