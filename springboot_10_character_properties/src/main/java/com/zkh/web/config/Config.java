package com.zkh.web.config;

import com.zkh.web.servlet.TestServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class Config {
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        TestServlet servlet = new TestServlet();
        ServletRegistrationBean bean = new ServletRegistrationBean();
        bean.setServlet(servlet);
        bean.addUrlMappings("/test");
        return bean;
    }

//    @Bean
//    public FilterRegistrationBean encodingFilter() {
//        FilterRegistrationBean beanFilter = new FilterRegistrationBean();
//
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//        filter.setEncoding("utf-8");
//        filter.setForceEncoding(true);
//
//        String encoding = filter.getEncoding();
//        System.out.println(encoding);
//        System.out.println("aaaaaa");
//
//        beanFilter.setFilter(filter);
//        beanFilter.addUrlPatterns("/*");
//        return beanFilter;
//    }

//    //注册Servlet
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        ServletRegistrationBean reg = new ServletRegistrationBean(new TestServlet(),"/servlet");
//        return reg;
//    }
//
//
//    //注册Filter
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean reg = new FilterRegistrationBean();
//
//        //使用框架中的过滤器类
//        CharacterEncodingFilter filter  = new CharacterEncodingFilter();
//        //指定使用的编码方式
//        filter.setEncoding("utf-8");
//        //指定request ， response都使用encoding的值
//        filter.setForceEncoding(true);
//
//        reg.setFilter(filter);
//        //指定 过滤的url地址
//        reg.addUrlPatterns("/*");
//
//
//        return reg;
//    }

}
