package com.zkh.mybatis.web.mapper;

import com.zkh.mybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface SchoolMapper {
    Student selectStudentById(@Param("stuId") Integer id);
}
