package com.zkh.springboot.web.controller;

import com.zkh.springboot.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//@RestController
@Controller
public class UserController {
    @GetMapping("user/new")
    public String createUser(Model model, User user, HttpServletRequest servletRequest){
//        Object id = user.getId();
//        Object name = user.getName();
//        Object age = user.getAge();
//        Object sport = user.getSport();
        String id = user.getId();
        String name = user.getName();
        String age = user.getAge();
        String sport = user.getSport();

        servletRequest.setAttribute("id",id);
        servletRequest.setAttribute("name",name);
        servletRequest.setAttribute("age",age);
        servletRequest.setAttribute("sport",sport);
        servletRequest.setAttribute("user",user);

//        model.addAttribute("id",id);
//        model.addAttribute("name",name);
//        model.addAttribute("age",age);
//        model.addAttribute("sport",sport);
//        model.addAttribute("user",user);

        System.out.println(id+"\t"+name+"\t"+age+"\t"+sport);
        return "expression_01";
    }

    @GetMapping("link")
    public String baidu(Model model){
        model.addAttribute("modelAttr","i am model attr");
        return "link_01";
    }

}
