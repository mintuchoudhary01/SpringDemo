package com.demo;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice
		System.out.println("\nHijackAroundMethod : Before method hijacked!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println("\nHijackAroundMethod : After returning hijacked!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("\nHijackAroundMethod : Throw exception hijacked!");
			throw e;
		}
	}
}