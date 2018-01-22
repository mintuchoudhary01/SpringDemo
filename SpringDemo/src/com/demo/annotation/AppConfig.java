package com.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="custBean")   
    //For @Bean bean name will be custInfo
    public Cust custInfo() {
        return new CustImpl();
    }

}