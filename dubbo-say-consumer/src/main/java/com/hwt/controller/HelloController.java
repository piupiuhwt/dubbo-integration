package com.hwt.controller;

import com.hwt.UserService;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(loadbalance = LoadbalanceRules.ROUND_ROBIN)
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return userService.sayHello(name);
    }
}
