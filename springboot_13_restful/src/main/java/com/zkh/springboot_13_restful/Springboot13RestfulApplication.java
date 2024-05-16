package com.zkh.springboot_13_restful;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.zkh.springboot_13_restful.mapper")
public class Springboot13RestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot13RestfulApplication.class, args);
    }

}
