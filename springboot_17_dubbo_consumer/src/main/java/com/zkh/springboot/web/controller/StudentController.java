package com.zkh.springboot.web.controller;

import com.zkh.springboot.domain.Student;
import com.zkh.springboot.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @DubboReference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @GetMapping("student/create")
    public String createStudent(Student student){
        String string = studentService.createStudent(student);
        return  string;
    }
}
