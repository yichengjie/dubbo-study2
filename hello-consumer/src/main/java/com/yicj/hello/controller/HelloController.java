package com.yicj.hello.controller;

import com.yicj.hello.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference(version = "1.0.0")
    private UserService userService ;

    @GetMapping("/hello")
    public String hello(String username){
        String login = userService.login(username);
        return login ;
    }
}
