package com.casit.boot.config;

import com.casit.boot.component.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filter=new FilterRegistrationBean();
        filter.setFilter(new MyFilter());
        filter.addUrlPatterns("/myfilter");
        return filter;
    }
}
