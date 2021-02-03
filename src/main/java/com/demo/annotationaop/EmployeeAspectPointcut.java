package com.demo.annotationaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

	public static final String constant ="within(com.demo.annotationaop.*)"; 
	@Pointcut("execution(public String getName())")
	public void getPointcutName() {
	}

	@Before("getPointcutName()")
	public void loggingAdvice() {
		System.out.println("Executing loggingAdvice on getName()");
	}

	@Before("getPointcutName()")
	public void secondAdvice() {
		System.out.println("Executing secondAdvice on getName()");
	}

	// Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.demo.annotationaop.*)")
	public void allMethodsPointcut() {
	}

	@Before(constant)
	public void allServiceMethodsAdvice() {
		System.out.println("Before executing service method");
	}
}
