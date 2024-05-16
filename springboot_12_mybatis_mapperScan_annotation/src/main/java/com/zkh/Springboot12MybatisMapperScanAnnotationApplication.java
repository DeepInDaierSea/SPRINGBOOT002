package com.zkh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zkh.mybatis.mapper","com.zkh.mybatis.web.mapper","com.zkh.mybatis.web.controller.mapper"})
public class Springboot12MybatisMapperScanAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot12MybatisMapperScanAnnotationApplication.class, args);
    }

}
