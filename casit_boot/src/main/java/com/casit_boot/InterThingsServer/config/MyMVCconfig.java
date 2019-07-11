package com.casit_boot.InterThingsServer.config;

import com.casit_boot.InterThingsServer.component.MyWebMVCConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyMVCconfig {
    @Bean
    public MyWebMVCConfigurer myWebMVCConfigurer(){
        return new MyWebMVCConfigurer();
    }
}
