package com.techRevolution.spring5recipes.calculator.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
@Order(1)
public class CalculatorLogginAspect {

    @Before("execution(* *.*(..))")
    public void logBefore(JoinPoint joinPoint){
        log.info("########## {}() method begin with arguments {} ##########" , joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));

    }

    @After("execution(* *.*(..))")
    public void logAfter(JoinPoint joinPoint){
        log.info("########## {}() method has finished with arguments {} ##########" , joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut =  "execution(* *.*(..))" ,returning = "result")
    public void logAfterReturning(JoinPoint joinPoint , Object result){
        log.info("########## {}() method returns with {}" , joinPoint.getSignature().getName(), result);
    }

    @AfterThrowing(pointcut = "execution(* *.*(..))" ,throwing = "throwable")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable throwable) {
        log.info("########## {}() method has thrown an exception {}" , joinPoint.getSignature().getName(), throwable);
    }

}
