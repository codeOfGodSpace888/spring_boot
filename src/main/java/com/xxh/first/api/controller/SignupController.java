package com.xxh.first.api.controller;

import com.xxh.first.api.dao.SignupMapper;
import com.xxh.first.api.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SignupController {
    //获取属性文件的值
    @Value("${xxh.name}")
    private String xxhname;
    @Autowired
    SignupService signupService;
    @Autowired
    SignupMapper signupMapper;
    /*@RequestMapping("/{any}")
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
        System.out.println("tes");
        System.out.println("删除了value为xxhname的数据缓存");
    }*/
    @RequestMapping("/tes")
    public List test() {
        //分页插件可以直接添加依赖之后就用
        //PageHelper.startPage(0,8);
        //System.out.print(PageHelper.getLocalPage());

        //signupService.findById(2);
        List list = signupMapper.selectByIds("1");
        //list.stream().filter();//stream API
        return list;
    }
}
