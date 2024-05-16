package com.zkh.springboot.demo;

import com.zkh.springboot.demo.configClass.Human;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void testXml(){
        ApplicationContext act = new ClassPathXmlApplicationContext("beans.xml");
        Student studentBeans = act.getBean("studentBeans", Student.class);
        System.out.println("bean:"+studentBeans);
    }

    @Test
    public void testConfig(){
        ApplicationContext act = new AnnotationConfigApplicationContext(Human.class);
        Human human = act.getBean("getHuman", Human.class);
        System.out.println("bean:"+human);

    }

    @Test
    public void testConfigHuman(){
        ApplicationContext act = new AnnotationConfigApplicationContext(Human.class);
        Human human = act.getBean("configHuman", Human.class);
        System.out.println("bean:"+human);

    }

    @Test
    public void testConfigHumanAnimal(){
        ApplicationContext act = new AnnotationConfigApplicationContext(Human.class);
        Animal animal = act.getBean("animal", Animal.class);
        System.out.println("bean:"+animal);

    }


    @Test
    public void testConfigCat(){
        ApplicationContext act = new AnnotationConfigApplicationContext(Human.class);
        Cat cat = (Cat) act.getBean("cat");
        System.out.println("cat:"+cat);
    }
}
