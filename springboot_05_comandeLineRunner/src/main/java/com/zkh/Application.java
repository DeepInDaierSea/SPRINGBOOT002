package com.zkh;

import com.zkh.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.Resource;


@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private User user;

    @Autowired
    public static void main(String[] args) {
        System.out.println("ready to make 容器");
//        SpringApplication.run(Application.class, args);
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        User user1 =(User) run.getBean("defaultUser");
        System.out.println("user\t:"+user1);
        System.out.println("创建好容器之后");
    }

    @Override
    public void run(String... args) throws Exception {
        user.setId(1001);
        user.setPassword("1001zkh");
        user.setUsername("zkh");
        System.out.println("user\t:"+user);
        System.out.println("紧接着创建容器的时候");
    }
}
