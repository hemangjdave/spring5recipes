package com.techRevolution.spring5recipes.shop;

public enum ProductPrice {

    BATTERY(250.50),

    PENDRIVE(500),

    OTGCABLE(30);

    private final double productPrice;

    ProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice(){
        return this.productPrice;
    }
}
