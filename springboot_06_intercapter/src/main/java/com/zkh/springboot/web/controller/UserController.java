package com.zkh.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("user/query")
    @ResponseBody
    public String query() {
        return "执行查询操作query";
    }

    @RequestMapping("user/update")
    @ResponseBody
    public String update() {
        return "执行了修改操作";
    }
}
