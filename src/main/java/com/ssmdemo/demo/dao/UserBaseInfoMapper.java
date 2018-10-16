package com.ssmdemo.demo.dao;

import com.ssmdemo.demo.domain.UserBaseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserBaseInfoMapper {
    UserBaseInfo selectUserBaseInfoByName(String name);
    UserBaseInfo selectUserBaseInfoByCode(String code);
}
