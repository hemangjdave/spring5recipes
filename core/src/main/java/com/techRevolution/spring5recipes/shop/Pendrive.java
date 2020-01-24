package com.techRevolution.spring5recipes.shop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Pendrive extends Product {

    private String name;
    private double price;
    private int capacity;

    public Pendrive(String name, double price) {
        super(name, price);
        log.info("############### PenDrive instance has created ###############");
    }
}
