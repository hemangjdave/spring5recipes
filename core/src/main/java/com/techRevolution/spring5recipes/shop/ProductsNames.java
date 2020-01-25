package com.techRevolution.spring5recipes.shop;

public enum ProductsNames {

    BATTERY("AAA"),
    PENDRIVE("Sony"),
    OTGCABLE("OtgCable")
    ;

    private final String levelCode;

    ProductsNames(String levelCode) {
        this.levelCode = levelCode;
    }

    public String getProductName() {
        return this.levelCode;
    }
}
