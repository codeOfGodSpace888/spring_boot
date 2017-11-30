package com.xxh.first.api.controller;

import com.xxh.first.api.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    //获取属性文件的值
    @Value("${xxh.name}")
    private String xxhname;
    @Autowired
    SignupService signupService;
    @RequestMapping("/{any}")
    @Cacheable(value = "xxhname",key = "#any")
    public String signup(@PathVariable("any") String any) {
        System.out.println("获取属性文件中xxh.name的值为：" + xxhname);
        if(signupService.signup().equals("success")) {
            return any;
        }   else {
            return "fail";
        }
    }
    @RequestMapping("/remove")
    @CacheEvict(value = "xxhname")
    public void remove() {
        System.out.println("test");
        System.out.println("删除了value为xxhname的数据缓存");
    }
}
