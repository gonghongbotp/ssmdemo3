package com.ssmdemo.demo.controller;

import com.ssmdemo.demo.dao.JZCTMCertifTypeMapper;
import com.ssmdemo.demo.domain.JZCTMCertifType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JZCTMCertinfTypeController {
    @Autowired
    JZCTMCertifTypeMapper jzctmCertifTypeMapper;

    @RequestMapping(value = "/getJZCTMCertiftype")
    public JZCTMCertifType getJZCTMCertifType(){
        JZCTMCertifType jzctmCertifType = jzctmCertifTypeMapper.selectJZCTMCertifTypeByName("技术员");
        return jzctmCertifType;
    }
}
