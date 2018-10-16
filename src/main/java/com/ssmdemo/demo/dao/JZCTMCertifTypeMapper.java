package com.ssmdemo.demo.dao;

import com.ssmdemo.demo.domain.JZCTMCertifType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface JZCTMCertifTypeMapper {
    JZCTMCertifType selectJZCTMCertifTypeByName(String vname);
    JZCTMCertifType selectJZCTMCertifTypeByCode(String vcode);
}
