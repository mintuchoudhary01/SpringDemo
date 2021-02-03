package com.demo.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class A {
	A() {
		System.out.println("A is initialized");
	}
}

class B {
	B() {
		System.out.println("B is initialized");
	}
}

public class AnnotationConfigMain {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	context.register(AppConfig.class);
	
	context.refresh();
	context.getBean("beanA");
}
}
/*
Output:
A is initialized
*/
