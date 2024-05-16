package com.zkh.springboot.configClass;

import com.zkh.springboot.interceptorClass.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyInterceptor myInterceptor = new MyInterceptor();
        String [] path = {"/user/update"};
        String [] excludePath = {"/user/query"};
        registry.addInterceptor(myInterceptor).addPathPatterns(path).excludePathPatterns(excludePath);

    }
}
