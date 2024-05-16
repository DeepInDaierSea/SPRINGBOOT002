package com.zkh.springboot.web.controller;

import com.zkh.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/helloHuman")
    public String helloCtl(Model model) {
        model.addAttribute("msg", "Hello World");
        String string = userService.hello("曾克辉");
        model.addAttribute("data", string);
        return "index";
    }
}
