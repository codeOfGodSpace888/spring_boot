package com.xxh.first.api.service.impl;

import com.xxh.first.api.dao.SignupMapper;
import com.xxh.first.api.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupServiceimpl implements SignupService {
    @Autowired
    SignupMapper signupMapper;
    @Override
    public String signup() {
        if(signupMapper.selectByPrimaryKey(1L).getUsername().equals("xxh")) {
            System.out.println(signupMapper.selectByPrimaryKey(1l).getUsername());
            return "success";
        }   else {
            System.out.println("fail");
            return "fail";
        }
    }
}
