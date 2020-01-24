package com.techRevolution.spring5recipes.shop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Battery extends Product{
    private String name;
    private double price;
    private boolean isRechargable;

    public Battery(String name, double price) {
        super(name, price);
        log.info("############### Battery instance has created ###############");
    }
}
