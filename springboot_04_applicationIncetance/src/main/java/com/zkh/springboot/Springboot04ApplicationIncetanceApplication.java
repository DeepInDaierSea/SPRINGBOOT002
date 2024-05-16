package com.zkh.springboot;

import com.zkh.springboot.service.UserService;
import com.zkh.springboot.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class Springboot04ApplicationIncetanceApplication {

    public static void main(String[] args) {
//        SpringApplication.run(Springboot04ApplicationIncetanceApplication.class, args);
        ApplicationContext act = SpringApplication.run(Springboot04ApplicationIncetanceApplication.class, args);
        UserService userServiceImpl = act.getBean("userServiceImpl", UserServiceImpl.class);
        String string = userServiceImpl.hello("谢晓霞");
        System.out.println(string);
    }

}
