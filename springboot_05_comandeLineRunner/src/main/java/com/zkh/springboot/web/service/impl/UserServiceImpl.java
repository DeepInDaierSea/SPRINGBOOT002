package com.zkh.springboot.web.service.impl;

import com.zkh.springboot.web.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String hello(String name) {
        return "你好：\t"+name;
    }
}
