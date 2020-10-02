package com.yicj.hello.controller;

import com.yicj.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService ;

    @GetMapping("/hello")
    public String hello(String username){
        String login = userService.login(username);
        return login ;
    }
}
