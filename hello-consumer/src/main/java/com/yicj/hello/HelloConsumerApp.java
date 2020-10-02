package com.yicj.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo/consumer.xml")
public class HelloConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloConsumerApp.class, args) ;
    }
}
