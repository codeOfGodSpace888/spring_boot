package com.xxh.first.api.dao;

import com.xxh.first.api.pojo.Signup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Signup record);

    int insertSelective(Signup record);

    Signup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Signup record);

    int updateByPrimaryKey(Signup record);
}