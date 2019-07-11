package com.casit.boot.config;

import com.casit.boot.component.MyWebMVCConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyMVCconfig {
    @Bean
    public MyWebMVCConfigurer myWebMVCConfigurer(){
        return new MyWebMVCConfigurer();
    }
}
