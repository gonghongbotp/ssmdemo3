package com.ssmdemo.demo.dao;

import com.ssmdemo.demo.domain.OmPost;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OmPostMapper {
    OmPost selectOmPostByName(String postname);
    OmPost selectOmPostByCode(String postcode);
}
