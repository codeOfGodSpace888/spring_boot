package com.xxh.first.api.controller;

import com.xxh.first.api.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    @Autowired
    SignupService signupService;
    @RequestMapping("/{any}")
    public String signup(@PathVariable("any") String any) {
        if(signupService.signup().equals("success")) {
            System.out.println(signupService.signup());
            System.out.println("dad");
            return any;
        }   else {
            return "dada";
        }
    }
}
