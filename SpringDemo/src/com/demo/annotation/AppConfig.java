package com.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo.annotation")
public class AppConfig {

    @Bean(name="custBean")   
    //For @Bean bean name will be custInfo
    public Cust custInfo() {
        return new CustImpl();
    }

}