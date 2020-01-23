package com.techRevolution.spring5recipes.sequence;

import com.techRevolution.spring5recipes.sequence.config.SequenceConfiguration;
import com.techRevolution.spring5recipes.sequence.service.SequenceService;
import com.techRevolution.spring5recipes.sequence.service.SequenceServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SequenceMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SequenceConfiguration.class);
        SequenceService sequenceService = applicationContext.getBean(SequenceServiceImpl.class);
        Sequence sequence = sequenceService.getSequenceByName("firstSequence");
        log.info(sequence.toString());
    }
}
