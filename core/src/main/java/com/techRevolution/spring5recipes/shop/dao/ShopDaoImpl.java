package com.techRevolution.spring5recipes.shop.dao;

import com.techRevolution.spring5recipes.shop.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("shopDao")
@Scope("prototype")
@Slf4j
public class ShopDaoImpl implements ShopDao {

    private final List<Product> productList = new ArrayList<>();

    public ShopDaoImpl() {
        log.info("############### ShopDaoImpl instance has created. ###############");
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }
}
