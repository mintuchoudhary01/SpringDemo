package com.demo.annotationaop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAfterAspect {
	
	@After("execution(public void com.demo.annotationaop.*.set*(*))")  //Can apply After
	public void loggingAdvice(JoinPoint joinPoint) {
		
		System.out.println("After running loggingAdvice on method=" + joinPoint.toString());
		
		System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

	}
	
	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("Running After Advice. String argument passed=" + name);
	}

	@AfterThrowing("within(com.demo.annotationaop.Employee)")
	public void logException(JoinPoint joinPoint) {
		System.out.println("Exception thrown in Employee Method=" + joinPoint.toString());
	}
	
	@AfterReturning(pointcut="execution(* getName())", returning="returnString")
	public void getNameReturningAdvice(String returnString){
		System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
	}
}
