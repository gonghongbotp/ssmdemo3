package com.ssmdemo.demo.controller;

import com.ssmdemo.demo.dao.JZCTMCertinfregMapper;
import com.ssmdemo.demo.domain.JZCTMCertinfreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JZCTMCertinfregController {
    @Autowired
    JZCTMCertinfregMapper jzctmCertinfregMapper;

    @RequestMapping(value = "/getCertinfreg")
    public JZCTMCertinfreg getJZCTMCertinfreg(){
        JZCTMCertinfreg jzctmCertinfreg = jzctmCertinfregMapper.selectJZCTMCertinfregByCode("A08071000000000556");
        return jzctmCertinfreg;
    }
}
