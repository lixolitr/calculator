package com.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorContext {

    @Bean
    public CalculatorService calculatorService() {
        return new CalculatorService();
    }
}
