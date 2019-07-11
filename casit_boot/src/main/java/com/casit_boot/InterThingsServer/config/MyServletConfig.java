package com.casit_boot.InterThingsServer.config;

import com.casit_boot.InterThingsServer.component.MyServlet;
import com.casit_boot.InterThingsServer.component.MyServletContainer;
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
