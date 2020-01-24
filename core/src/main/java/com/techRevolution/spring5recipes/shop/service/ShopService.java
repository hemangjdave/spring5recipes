package com.techRevolution.spring5recipes.shop.service;

import com.techRevolution.spring5recipes.shop.Product;

import java.util.List;

public interface ShopService {
    List<Product> getAllProducts();

    void addProduct(Product product);
}
