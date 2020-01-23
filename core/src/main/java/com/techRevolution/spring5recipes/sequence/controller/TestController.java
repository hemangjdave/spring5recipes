package com.techRevolution.spring5recipes.sequence.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class TestController {
    public TestController() {
        log.info("########## TestController instance is created ##########");
    }
}
