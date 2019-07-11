package com.casit_boot.InterThingsServer.config;

import com.casit_boot.InterThingsServer.component.Mylistener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MylistenerConfig {
    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean= new ServletListenerRegistrationBean<Mylistener>(new Mylistener());
        return servletListenerRegistrationBean;
    }
}
