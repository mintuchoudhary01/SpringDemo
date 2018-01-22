package com.demo.annotationaop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJoinPoint {
	
	@Before("execution(public void com.demo.annotationaop.*.set*(*))")  //Can apply After
	public void loggingAdvice(JoinPoint joinPoint) {
		
		System.out.println("Before running loggingAdvice on method=" + joinPoint.toString());
		
		System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

	}
	
	//Advice arguments, will be applied to bean methods with single String argument
		@Before("args(name)")
		public void logStringArguments(String name){
			System.out.println("String argument passed="+name);
		}
		
		@Before("args(name,lname)")
		public void logStringArguments(String name,String lname){
			System.out.println("2 String argument passed="+name + " "+lname);
		}
}