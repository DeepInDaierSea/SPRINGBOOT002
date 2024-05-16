package com.zkh.springboot.domain;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 2465114494984263062L;
    private String name;
    private String age;
    private String sport;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sport='" + sport + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
