package com.techRevolution.spring5recipes.calculator.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UnitCalculatorImpl implements UnitCalculator {
    @Override
    public double kilogramToPound(double kilogram) {
        double result = kilogram * 2.2;
        log.info("Kilogram {} to result is :--  {}" , kilogram ,  result);
        return result;
    }

    @Override
    public double kiloMeterToMiles(double kiloMeter) {
        if(kiloMeter < 1)
            throw new IllegalArgumentException("kilo meter must be greater than zero.");
        double result = kiloMeter * 0.62;
        log.info("kilometer {} to mile is:--{}" , kiloMeter , result);
        return result;
    }
}
