package com.zkh.springboot.service.impl;

import com.zkh.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String hello(String name) {
        return "你好,这里是\t"+name;
    }
}
