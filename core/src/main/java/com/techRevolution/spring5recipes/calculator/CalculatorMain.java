package com.techRevolution.spring5recipes.calculator;

import com.techRevolution.spring5recipes.calculator.components.ArithmeticCalculator;
import com.techRevolution.spring5recipes.calculator.components.MaxCalculator;
import com.techRevolution.spring5recipes.calculator.components.MinCalculator;
import com.techRevolution.spring5recipes.calculator.components.UnitCalculator;
import com.techRevolution.spring5recipes.calculator.config.CalculatorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        ArithmeticCalculator arithmeticCalculator =
                applicationContext.getBean("arithmeticCalculatorImpl",ArithmeticCalculator.class);

        arithmeticCalculator.add(1, 2);
        arithmeticCalculator.subtract(4, 3);
        arithmeticCalculator.multiply(5, 6);
        arithmeticCalculator.divide(15, 5);

        MaxCalculator maxCalculator = (MaxCalculator) arithmeticCalculator;
        MinCalculator minCalculator = (MinCalculator) arithmeticCalculator;
        maxCalculator.max(100, 200);
        minCalculator.min(100, 200);

        UnitCalculator unitCalculator = applicationContext.getBean("unitCalculatorImpl",UnitCalculator.class);
        unitCalculator.kilogramToPound(85);
        unitCalculator.kiloMeterToMiles(230);
    }
}
