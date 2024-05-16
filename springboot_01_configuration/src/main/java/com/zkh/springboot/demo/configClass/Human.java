package com.zkh.springboot.demo.configClass;

import org.springframework.context.annotation.*;

@Configuration
@ImportResource(locations = "classpath:AnimalConfig.xml")
@PropertySource(value = "classpath:beans.properties")
@ComponentScan(basePackages = "com.zkh.springboot.demo")
public class Human {
    private String name;
    private Integer age;
    private Integer id;
    private String gender;

    @Bean
    public  Human getHuman() {
        Human human = new Human();
        human.setId(1001);
        human.setAge(18);
        human.setName("曾克辉");
        human.setGender("male");
        return human;
    }

    @Bean(name = "configHuman")
    public  Human getHumanConfig() {
        Human human = new Human();
        human.setId(1002);
        human.setAge(17);
        human.setName("谢晓霞");
        human.setGender("women");
        return human;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
