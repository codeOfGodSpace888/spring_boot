package com.xxh.first.api.service.impl;

import com.xxh.first.api.dao.SignupMapper;
import com.xxh.first.api.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SignupServiceimpl implements SignupService {
    @Autowired
    SignupMapper signupMapper;
    //spring-boot中使用事务，建议相应的service层在处理相关的事务时，应该选择合适的事务注解来进行完善
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public String signup() {
        String name = signupMapper.selectByPrimaryKey(1L).getUsername();
        if(name.equals("xxh")) {
            return "success";
            //throw new IllegalArgumentException("xxh已经存在，数据将回滚");
        }   else {
            return "success";
        }
    }
}
