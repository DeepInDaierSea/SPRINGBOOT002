package com.zkh.config;

import com.zkh.servlet.ServletDemo;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;


@Configuration
public class MyServlet {

    @Bean
    public ServletRegistrationBean getServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(new ServletDemo());
        bean.addUrlMappings("/myServlet","/myServlet2","/myServlet3");
        return bean;
    }
}
