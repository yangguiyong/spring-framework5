package com.cmzy.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
public class MyAspect {

	@Pointcut("execution(* com.cmzy.service..*.*(..))")
	public void pointCut(){

	}

	@Pointcut("execution(* com.cmzy.dao..*.*(..))")
	public void pointCutOther(){

	}

	@Pointcut("@annotation(com.cmzy.utils.MyAnnotation)")
	public void myAnnotationPonitCut(){

	}

	@Around("myAnnotationPonitCut() && @annotation(myAnnotation)")
	public void beforeAdvice(ProceedingJoinPoint joinPoint,MyAnnotation myAnnotation) throws Throwable {
		System.out.println("执行AOP around start");
		System.out.println("打印自定义注解："+myAnnotation.value());
		Object proceed = joinPoint.proceed();
		System.out.println("执行AOP around after");
	}

	@After("myAnnotationPonitCut()")
	public void afterAdvice(){
		System.out.println("exec before advice");
	}


	@AfterReturning("pointCutOther()")
	public void afterReturning(){
		System.out.println("exec afterReturning advice");
	}
}
