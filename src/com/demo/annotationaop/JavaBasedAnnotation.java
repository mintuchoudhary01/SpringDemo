package com.demo.annotationaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
@EnableAspectJAutoProxy
public class JavaBasedAnnotation {
	@Before("execution(* com.demo.Triange.draw(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("From HackingBefore class logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
}
