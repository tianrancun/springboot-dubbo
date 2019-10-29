package com.boot.impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        System.out.println("sayhello");
        return "dj";
    }
}
