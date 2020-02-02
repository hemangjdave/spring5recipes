package com.techRevolution.spring5recipes.calculator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages="com.techRevolution.spring5recipes.calculator")
@EnableAspectJAutoProxy
public class CalculatorConfiguration {
}
