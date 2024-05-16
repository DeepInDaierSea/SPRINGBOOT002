package com.zkh.mybatis.mapper;

import com.zkh.mybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    Student selectStudentById(@Param("stuId") Integer id);
}
