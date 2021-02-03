package com.demo;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HijackAfterMethod implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object returnValue, Method method,
		Object[] args, Object target) throws Throwable {
	        System.out.println("\nHijackAfterMethod : After method hijacked!");
	}
}