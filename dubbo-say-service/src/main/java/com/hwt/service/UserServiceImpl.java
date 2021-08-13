package com.hwt.service;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.hwt.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(timeout = 3000,weight = 100)
public class UserServiceImpl implements UserService {

    @NacosValue(value = "${say-service-prefix}",autoRefreshed = true)
    private String prefix;

    @Override
    public String sayHello(String name){
        System.out.println(".....");
        return prefix.concat("hello ").concat(name);
    }
}

