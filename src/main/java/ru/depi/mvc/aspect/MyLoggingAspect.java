package ru.depi.mvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Made by DePi
 **/
@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* ru.depi.mvc.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint)
        throws Throwable {
        MethodSignature methodSignature
                = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("BEGIN OF " + methodName);

        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("END OF " + methodName);

        return targetMethodResult;
    }
}
