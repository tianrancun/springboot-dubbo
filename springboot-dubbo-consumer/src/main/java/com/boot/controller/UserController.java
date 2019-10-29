package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
    @Reference(version = "1.0.0")
    private UserService testService;

    @GetMapping("hello")
    public String hello() {
        System.out.println("xx");
        return testService.sayHello();
    }

}
