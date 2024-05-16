package com.zkh.springboot_13_restful.web.service;

import com.zkh.springboot_13_restful.domain.Student;

public interface StudentService {
    Student getStudentById(int id);
    int insertStudent(Student student);
}
