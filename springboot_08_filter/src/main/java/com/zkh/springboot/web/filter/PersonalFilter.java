package com.zkh.springboot.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class PersonalFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
        System.out.println("====执行了doFilter====");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        request.setAttribute("data","你好");
    }
}
