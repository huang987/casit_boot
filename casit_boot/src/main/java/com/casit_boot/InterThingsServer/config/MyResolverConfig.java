package com.casit_boot.InterThingsServer.config;

import com.casit_boot.InterThingsServer.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class MyResolverConfig {
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
