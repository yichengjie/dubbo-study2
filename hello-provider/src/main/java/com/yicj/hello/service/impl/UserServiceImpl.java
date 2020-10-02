package com.yicj.hello.service.impl;

import com.yicj.hello.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService(version = "${service.version}" , interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public String login(String username) {
        log.info(username);
        return "hello yicj ,rpc -->" +username;
    }
}
