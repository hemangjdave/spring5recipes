package com.techRevolution.spring5recipes.shop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OtgCable extends Product {
    private String name;
    private double price;

    public OtgCable(String name, double price) {
        super(name, price);
        log.info("############### OtgCable instance has created ###############");
    }
}
