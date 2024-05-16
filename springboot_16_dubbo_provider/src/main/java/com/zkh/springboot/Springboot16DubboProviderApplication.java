package com.zkh.springboot;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableDubboConfig
//@DubboComponentScan
@SpringBootApplication
@EnableDubbo
public class Springboot16DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot16DubboProviderApplication.class, args);
    }

}
