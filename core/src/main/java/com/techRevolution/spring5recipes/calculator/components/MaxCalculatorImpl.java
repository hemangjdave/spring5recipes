package com.techRevolution.spring5recipes.calculator.components;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxCalculatorImpl implements MaxCalculator,Cloneable {
    @Override
    public double max(double a, double b) {
        double result = (a >= b) ? a : b;
        log.info("max({},{}):--{}" , a , b , result);
        return result;
    }
}
