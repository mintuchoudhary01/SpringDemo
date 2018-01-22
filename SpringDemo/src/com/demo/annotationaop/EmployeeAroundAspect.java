package com.demo.annotationaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAroundAspect {
	@Around("execution(* getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJointPoint) {
		System.out.println("Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJointPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		System.out.println("After invoking getName() method. Return value=" + value);
		return value;
	}
}
