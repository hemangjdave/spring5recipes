package com.techRevolution.spring5recipes.sequence.config;

import com.techRevolution.spring5recipes.sequence.Sequence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceConfiguration {

    @Bean
    public Sequence sequence(){
        Sequence sequence = new Sequence();
        sequence.setInitial("H");
        sequence.setPrefix("J");
        sequence.setSuffix("Dave");
        return sequence;
    }
}
