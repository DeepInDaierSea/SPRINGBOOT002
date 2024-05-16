package com.zkh.mybatis.web.service.impl;

import com.zkh.mybatis.domain.Student;
import com.zkh.mybatis.mapper.StudentMapper;
import com.zkh.mybatis.web.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(int id) {
        return studentMapper.selectStudentById(id);
    }
}
