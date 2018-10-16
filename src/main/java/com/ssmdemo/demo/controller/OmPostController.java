package com.ssmdemo.demo.controller;

import com.ssmdemo.demo.dao.OmPostMapper;
import com.ssmdemo.demo.domain.OmPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmPostController {
    @Autowired
    OmPostMapper omPostMapper;

    @RequestMapping(value = "/getOmPost")
    public OmPost getOmPost(){
        OmPost omPost = omPostMapper.selectOmPostByCode("6J100190606");
        return omPost;
    }
}
