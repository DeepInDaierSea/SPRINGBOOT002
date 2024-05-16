package com.zkh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootApplication
public class Springboot14RedisApplication {
//    @Resource
//    public RedisTemplate redisTemplate;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot14RedisApplication.class, args);
//        RedisTemplate redisTemplate1 = (RedisTemplate)run.getBean("redisTemplate");
//        ValueOperations valueOperations = redisTemplate1.opsForValue();
//        Object aaaa = valueOperations.get("aaaa");
//        System.out.println(aaaa);
    }

}
