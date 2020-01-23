package com.techRevolution.spring5recipes.sequence;

import com.techRevolution.spring5recipes.sequence.config.SequenceConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SequenceMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        Sequence sequence = applicationContext.getBean(Sequence.class);
        log.info(sequence.toString());
    }
}
