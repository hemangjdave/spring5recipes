package com.techRevolution.spring5recipes.shop.dao;

import com.techRevolution.spring5recipes.shop.Product;

import java.util.List;

public interface ShopDao {
    List<Product> getAllProducts();

    void addProduct(Product product);
}
