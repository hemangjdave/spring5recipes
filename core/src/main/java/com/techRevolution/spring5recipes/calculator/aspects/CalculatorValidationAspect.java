package com.techRevolution.spring5recipes.calculator.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@Order(0)
public class CalculatorValidationAspect {

    @Before("execution(* *.*(double , double))")
    public void validateBeforeCal(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            validate((double) arg);
        }
        log.info("Validation done for {}() method", joinPoint.getSignature().getName());
    }

    private void validate(double value) {
        if (value < 1) {
            throw new IllegalArgumentException("value must be greater than zero");
        }
    }

}
