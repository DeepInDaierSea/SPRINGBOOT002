package com.zkh.springboot_13_restful.web.controller;

import com.zkh.springboot_13_restful.domain.Student;
import com.zkh.springboot_13_restful.web.service.StudentService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class StudentController {
    @Resource
    private StudentService studentService;

    @Transactional
    @GetMapping("student/{stuName}/{age}/{height}/{birth}/{sex}")
    public String insertStudent(@PathVariable("stuName")String name,@PathVariable("age") Integer age,
                                @PathVariable("height")Double height,@PathVariable("birth") String birth,
                                @PathVariable("sex")String sex) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parseBirth = simpleDateFormat.parse(birth);
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setHeight(height);
        student.setBirth(parseBirth);
        student.setSex(sex);
        int count = studentService.insertStudent(student);
//        int count2 = studentService.insertStudent(student_font);
        String s = null;
        System.out.println(s.toString());
        String result = "";
        if (count > 0) {
            result = "添加了"+count+"个学生";
        }else {
            result = "服务出错了，请稍后重试";
        }
        return result;
    }

    @PutMapping("student/test")
    public String updateStudent(String aaa) {
        System.out.println(aaa);
        return "successful successful";
    }

//    @DeleteMapping("student/test1")
    @RequestMapping(value = "student/test1",method = RequestMethod.DELETE)
    public String deleteStudent() {
        return "delete successful successful";
    }

}
