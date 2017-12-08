package com.xxh.first.api.service;


import com.xxh.first.api.pojo.Signup;
import com.xxh.first.api.utils.Service.BaseService;

public interface SignupService extends BaseService<Signup> {
    public String signup();
}
