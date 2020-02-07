package com.techRevolution.spring5recipes.calculator.components;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorIntroduction {

    @DeclareParents(
            value = "com.techRevolution.spring5recipes.calculator.components.ArithmeticCalculatorImpl" ,
            defaultImpl = MaxCalculatorImpl.class
    )
    public MaxCalculator maxCalculator;

    @DeclareParents(
            value = "com.techRevolution.spring5recipes.calculator.components.ArithmeticCalculatorImpl" ,
            defaultImpl = MinCalculatorImpl.class
    )
    public MinCalculator minCalculator;

}
