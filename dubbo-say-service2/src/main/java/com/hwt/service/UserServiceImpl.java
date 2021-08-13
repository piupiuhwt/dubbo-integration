package com.hwt.service;

import com.hwt.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(timeout = 3000,weight = 200)
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name){
        return "hello2 ".concat(name);
    }
}

