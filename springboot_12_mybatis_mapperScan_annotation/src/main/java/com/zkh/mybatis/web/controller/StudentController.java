package com.zkh.mybatis.web.controller;

import com.zkh.mybatis.domain.Student;
import com.zkh.mybatis.web.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("queryStudent")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student = studentService.queryStudentById(id);
        return "student:"+student.toString();
    }
}
