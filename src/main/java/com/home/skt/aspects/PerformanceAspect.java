package com.home.skt.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {
	//경로에 AOP적용
//	@Around("execution(* com.saelobi..*.EventService.*(..))")
//	//스프링 bean에 AOP 적용
//	@Around("bean(simpleEventService)")
	//어노테이션에 AOP적용
    @Around("@annotation(MeasurePerformance)")
    public Object measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature() + " 실행 시간 : " + (endTime - startTime) + "ms");
        return result;
    }
}