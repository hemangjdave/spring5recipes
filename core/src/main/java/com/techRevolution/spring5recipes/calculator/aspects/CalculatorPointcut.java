package com.techRevolution.spring5recipes.calculator.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CalculatorPointcut {
    @Pointcut("execution(* *.*(..))")
    public void sharedLoggingPointcut(){}

    @Pointcut("within(com.techRevolution.spring5recipes.calculator..*)")
    public void within(){}
}
