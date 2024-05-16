package com.zkh.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Set;

@RestController
public class UserController {
    @Autowired
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "user1", method = RequestMethod.POST)
    public String createUserToRedis1(Integer id, String name) {
        String resultStr = "successful create redis cache";

        ValueOperations valueOperations = redisTemplate.opsForValue();
        try {
            valueOperations.set("id", id);
            valueOperations.set("name", name);
        } catch (Exception e) {
            e.printStackTrace();
            resultStr = "failed create redis cache";
        }
        return resultStr;
    }

    @PostMapping("user")
    public String createUserToRedis(Integer id, String name) {
        String resultStr = "successful create redis cache";
//        redisTemplate.setDefaultSerializer(new Jackson2JsonRedisSerializer(String.class));
        ValueOperations valueOperations = redisTemplate.opsForValue();
        try {
            valueOperations.set("id", id);
            valueOperations.set("name", name);
        } catch (Exception e) {
            e.printStackTrace();
            resultStr = "failed create redis cache";
        }
        return resultStr;
    }

    @GetMapping("user")
    public String getUserFromRedis() {
        String resultStr = "failed get redis cache";
        Integer id = (Integer) redisTemplate.opsForValue().get("id");
        String s = String.valueOf(id);
        String name = (String) redisTemplate.opsForValue().get("name");
//        Set name = redisTemplate.keys("name");
        if (id != null || s != null) {
            resultStr = "id:\t" + s + "\tname:\t" + name + "\n";
        }
//        if (kkk!=null){
//            resultStr = "key=kkkk\tvalue=" + kkk;
//        }
//        System.out.println(kkk);
        return resultStr;
    }


    //    "重庆理工大学"
    //"www.cqut.edu.cn" "1941年"
    @PutMapping("school/hash")
    public String createHash(String schoolName, String webSite, String record) {
        String resultStr = "successful create redis hash cache";
        HashOperations<String, Object, Object> hash = stringRedisTemplate.opsForHash();
        try {
            hash.put("school", "schoolName", schoolName);
            hash.put("school", "webSite", webSite);
            hash.put("school", "record", record);
        } catch (Exception e) {
            e.printStackTrace();
            if (e != null) {
                resultStr = "failed create redis hash cache";
            }
        }
        return resultStr;
    }


    @DeleteMapping("school/hash")
    public String deleteHash(){
        String resultStr = "successful delete redis hash cache";
        String o =(String) stringRedisTemplate.opsForHash().get("school", "schoolName");
        String o1 =(String) stringRedisTemplate.opsForHash().get("school", "webSite");
        String o2 =(String) stringRedisTemplate.opsForHash().get("school", "record");
        if (o!=null||o1!=null||o2!=null){
            resultStr = "schoolName:\t"+o+"webSite:\t"+o1+"record:\t"+o2;
        }
        return resultStr;
    }

    @PutMapping("school/hash1")
    public String createHash1(String schoolName, String webSite, String record) {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new StringRedisSerializer());
        String resultStr = "successful create redis hash cache";
        HashOperations<String, Object, Object> hash = redisTemplate.opsForHash();
        try {
            hash.put("school_s", "schoolName", schoolName);
            hash.put("school_s", "webSite", webSite);
            hash.put("school_s", "record", record);
        } catch (Exception e) {
            e.printStackTrace();
            if (e != null) {
                resultStr = "failed create redis hash cache";
            }
        }
        return resultStr;
    }

    @DeleteMapping("school/hash1")
    public String deleteHash1(){
        String resultStr = "failed delete redis hash cache";
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new StringRedisSerializer());

        String o =(String) redisTemplate.opsForHash().get("school", "schoolName");
        String o1 =(String) redisTemplate.opsForHash().get("school", "webSite");
        String o2 =(String) redisTemplate.opsForHash().get("school", "record");
        if (o!=null||o1!=null||o2!=null){
            resultStr = "schoolName:\t"+o+"webSite:\t"+o1+"record:\t"+o2;
        }
        return resultStr;
    }


    @GetMapping("admin/json")
    public String testJson(String jsonName){
        String str = "failed";
        redisTemplate.setKeySerializer(new Jackson2JsonRedisSerializer(String.class));
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(String.class));

        redisTemplate.opsForValue().set("testJson",jsonName);

        Object o = redisTemplate.opsForValue().get("testJson");
        if (o != null) {
            str = ""+o;
        }
        return str;
    }


}
