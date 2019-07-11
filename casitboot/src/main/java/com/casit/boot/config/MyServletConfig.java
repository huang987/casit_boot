package com.casit.boot.config;

import com.casit.boot.component.MyServlet;
import com.casit.boot.component.MyServletContainer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServletConfig {
    @Bean
    public MyServletContainer myServletContainer(){
        return new MyServletContainer();
    }

    @Bean
    public ServletRegistrationBean servletRegistration(){
        return new ServletRegistrationBean(new MyServlet(),"/myservlet");
    }
}
