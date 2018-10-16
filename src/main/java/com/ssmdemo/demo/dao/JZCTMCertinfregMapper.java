package com.ssmdemo.demo.dao;

import com.ssmdemo.demo.domain.JZCTMCertinfreg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface JZCTMCertinfregMapper {
    JZCTMCertinfreg selectJZCTMCertinfregByName(String vname);
    JZCTMCertinfreg selectJZCTMCertinfregByCode(String vcode);
}
