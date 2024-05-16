package com.zkh.springboot.web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

@Controller
public class UserController {

    @RequestMapping("user/query")
    @ResponseBody
    public String query(ServletRequest servletRequest){
        String data = (String)servletRequest.getAttribute("data");
        return "hello query user"+data;
    }

    @RequestMapping("student/query")
    @ResponseBody
    public String queryStudent(ServletRequest servletRequest){
        String data = (String)servletRequest.getAttribute("data");
        return "hello query student "+data;
    }

}
