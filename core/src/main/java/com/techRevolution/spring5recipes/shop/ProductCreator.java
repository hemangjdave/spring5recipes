package com.techRevolution.spring5recipes.shop;

import java.util.Map;

public class ProductCreator {

    private final Map<String, Product> productMap;

    public ProductCreator(Map<String, Product> productMap) {
        this.productMap = productMap;
    }

    public Product getProduct(String name) {
        return productMap.get(name);
    }

    public static Product getProductByStaticFactory(String name) {
        if ("pendrive".equalsIgnoreCase(name)) {
            Pendrive pendrive = new Pendrive(ProductsNames.PENDRIVE.getProductName(), ProductPrice.PENDRIVE.getProductPrice());
            pendrive.setCapacity(16);
            return pendrive;
        } else if ("battery".equalsIgnoreCase(name)) {
            Battery battery = new Battery(ProductsNames.BATTERY.getProductName(), ProductPrice.BATTERY.getProductPrice());
            battery.setRechargable(true);
            return battery;
        } else {
            return new OtgCable(ProductsNames.OTGCABLE.getProductName(), ProductPrice.OTGCABLE.getProductPrice());
        }
    }
}
