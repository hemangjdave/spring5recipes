package com.techRevolution.spring5recipes.sequence.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(
        basePackages = "com.techRevolution.spring5recipes",
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = {"com.techRevolution.spring5recipes.sequence.service.*",
                                "com.techRevolution.spring5recipes.sequence.dao.*"}
                )
        },
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {Controller.class}
                )
        }
)
@Slf4j
public class SequenceConfiguration {
    public SequenceConfiguration() {
        log.info("########## SequenceConfiguration instance created. ##########");
    }
}
