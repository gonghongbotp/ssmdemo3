package com.ssmdemo.demo.dao;

import com.ssmdemo.demo.domain.HiPsnOrg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface HiPsnOrgMapper {
    HiPsnOrg selectHiPsnOrgByPkPsnDoc(String pk_psndoc);
}
