package com.yicj.hello.service.impl;

import com.yicj.hello.service.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService(version = "${service.version}" , interfaceClass = IHelloService.class)
public class HelloServiceImpl implements IHelloService {
    @Override
    public String login(String username) {
        log.info(username);
        return "hello yicj ,rpc -->" +username;
    }
}
