package com.zkh.springboot_13_restful.web.service.impl;

import com.zkh.springboot_13_restful.domain.Student;
import com.zkh.springboot_13_restful.mapper.StudentMapper;
import com.zkh.springboot_13_restful.web.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public int insertStudent(Student student) {
        int insertCount = studentMapper.insert(student);
        return insertCount;
    }
}
