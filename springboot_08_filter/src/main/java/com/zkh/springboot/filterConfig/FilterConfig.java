package com.zkh.springboot.filterConfig;

import com.zkh.springboot.web.filter.PersonalFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean setFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new PersonalFilter());
        bean.addUrlPatterns("/user/*");
        return bean;
    }
}
