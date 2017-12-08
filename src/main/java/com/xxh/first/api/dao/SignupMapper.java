package com.xxh.first.api.dao;

import com.xxh.first.api.utils.MyMapper;
import com.xxh.first.api.pojo.Signup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SignupMapper extends MyMapper<Signup> {
    int deleteByPrimaryKey(Long id);

    int insert(Signup record);

    int insertSelective(Signup record);

    Signup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Signup record);

    int updateByPrimaryKey(Signup record);

//    上面的接口有对应的mapper文件，来自mybatis的逆向工程
//    下面采用mybatis注解的方式进行接口的实现

    @Select("select *from signup")
    List<Signup> findAll();

    @Select("SELECT * FROM signup WHERE username = #{name}")
    Signup findByName(@Param("name") String name);
}
