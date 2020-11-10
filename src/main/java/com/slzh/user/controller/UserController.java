package com.slzh.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Value("${projectName}")
    private String projectName;

    @GetMapping(value = "getUserInfo")
    public String getUserInfo(HttpServletRequest request){

        long v1=Math.round(Math.random()*10);
        return "服务名称："+projectName+" 服务版本：V"+v1;
    }
}
