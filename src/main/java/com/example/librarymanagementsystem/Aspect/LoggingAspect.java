package com.example.librarymanagementsystem.Aspect;


import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Log4j2
@Component
public class LoggingAspect {

    @Around("execution(* com.example.librarymanagementsystem.service..*(..))")
    public Object executionTime(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = point.proceed();
        long endTime = System.currentTimeMillis();
        log.info("Class Name: {}. Method Name: {}. Time taken for Execution is: {} ms",
                point.getSignature().getDeclaringTypeName(),
                point.getSignature().getName(),
                (endTime - startTime));
        return object;
    }
}
