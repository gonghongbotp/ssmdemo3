package com.ssmdemo.demo.controller;

import com.ssmdemo.demo.dao.UserBaseInfoMapper;
import com.ssmdemo.demo.domain.UserBaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserBaseInfoController {

    @Autowired
    UserBaseInfoMapper userBaseInfoMapper;

    @RequestMapping(value = "/getUserBase")
    public UserBaseInfo getUserBaseInfo(){
        UserBaseInfo userBaseInfo = userBaseInfoMapper.selectUserBaseInfoByCode("000508");
        return userBaseInfo;
    }

}
