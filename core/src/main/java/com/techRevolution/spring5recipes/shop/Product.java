package com.techRevolution.spring5recipes.shop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name of the product is " + this.name + " and its prize is:--" + this.price;
    }
}
