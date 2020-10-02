package com.yicj.hello;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import java.io.IOException;


@SpringBootApplication
@MapperScan("com.yicj.hello.mapper")
@ImportResource("classpath:dubbo/provider.xml")
@EnableDubbo(scanBasePackages = "com.yicj.hello.service.impl")
public class HelloProviderApp {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(HelloProviderApp.class, args) ;
       // System.in.read() ;
    }
}
