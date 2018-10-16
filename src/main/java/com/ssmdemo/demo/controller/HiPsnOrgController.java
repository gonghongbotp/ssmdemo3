package com.ssmdemo.demo.controller;

import com.ssmdemo.demo.dao.HiPsnOrgMapper;
import com.ssmdemo.demo.domain.HiPsnOrg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiPsnOrgController {
    @Autowired
    HiPsnOrgMapper hiPsnOrgMapper;

    @RequestMapping(value = "/getHipsnOrg")
    public HiPsnOrg getHiPsnOrg(){
        HiPsnOrg hiPsnOrg = hiPsnOrgMapper.selectHiPsnOrgByPkPsnDoc("0001A410000000005FQH");
        return hiPsnOrg;
    }
}
