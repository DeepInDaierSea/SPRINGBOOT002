package com.zkh.mybatis.web.controller.mapper;

import com.zkh.mybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
    Student selectStudentById(@Param("stuId") Integer id);
}
