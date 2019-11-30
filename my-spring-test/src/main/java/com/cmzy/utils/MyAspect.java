package com.cmzy.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* com.cmzy.service..*.*(..))")
	public void pointCut(){

	}

	@Pointcut("@annotation(com.cmzy.utils.MyAnnotation)")
	public void myAnnotationPonitCut(){

	}

	@Around("myAnnotationPonitCut() && @annotation(myAnnotation)")
	public void beforeAdvice(ProceedingJoinPoint joinPoint,MyAnnotation myAnnotation) throws Throwable {
		System.out.println("执行AOP around start");
		System.out.println("打印自定义注解传入值："+myAnnotation.value());
		Object proceed = joinPoint.proceed();
		System.out.println("执行AOP around after");
	}



}
