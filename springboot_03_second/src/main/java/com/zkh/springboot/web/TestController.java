package com.zkh.springboot.web;

import com.zkh.springboot.domain.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    private School school;

    @RequestMapping("/school")
    public @ResponseBody String school(){
        return "school:"+school;
    }
}
