package com.techRevolution.spring5recipes.calculator.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

    @Override
    public double add(double a, double b) {
        double result = a + b;
        log.info("a + b = {}" , result);
        return result;
    }

    @Override
    public double subtract(double a, double b) {
        double result = a - b;
        log.info("a-b:--{}" , result);
        return result;
    }

    @Override
    public double multiply(double a, double b) {
        double result = a * b;
        log.info("a*b:--{}" , result);
        return result;
    }

    @Override
    public double divide(double a, double b) {
        double result = a / b;
        log.info("a/b:--{}" , result);
        return result;
    }
}
