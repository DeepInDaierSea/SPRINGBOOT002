package com.zkh.springboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Springboot17DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot17DubboConsumerApplication.class, args);
    }

}
