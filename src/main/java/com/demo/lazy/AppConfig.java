package com.demo.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

	@Bean(name="beanA")
	A getA() {
		return new A();
	}

	@Bean(name="beanB")
    @Lazy
	B getB() {
		return new B();
	}

}
