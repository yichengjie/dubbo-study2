package com.yicj.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@ImportResource("classpath:dubbo/provider.xml")
@SpringBootApplication
public class HelloProviderApp {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(HelloProviderApp.class, args) ;
        System.in.read() ;
    }
}
