package com.demo.annotationaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Triangle;

public class MainAopRun {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.getEmployee().getName());

//		employeeService.getEmployee().setName("Mintu");
    //	employeeService.getEmployee().setName("Mintu","Choudhary");
	//	System.out.println(employeeService.getEmployee().getName());
		// employeeService.getEmployee().throwException();

	}
}
