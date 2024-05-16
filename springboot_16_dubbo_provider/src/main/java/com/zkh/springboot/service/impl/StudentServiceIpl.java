package com.zkh.springboot.service.impl;

import com.zkh.springboot.domain.Student;
import com.zkh.springboot.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = StudentService.class,version = "1.0.0",timeout = 5000)
public class StudentServiceIpl implements StudentService {
    @Override
    public String createStudent(Student student) {
        Student student1 = new Student();
        student1.setName("谢晓霞");
        student1.setSport("跑步");
        student1.setAge("18岁");

        return student1.toString()+"\tclient:\t"+student.toString();
    }
}
