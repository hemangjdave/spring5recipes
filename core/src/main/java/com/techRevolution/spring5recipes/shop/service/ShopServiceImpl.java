package com.techRevolution.spring5recipes.shop.service;

import com.techRevolution.spring5recipes.shop.Product;
import com.techRevolution.spring5recipes.shop.dao.ShopDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("shopService")
@Scope("prototype")
@Slf4j
public class ShopServiceImpl implements ShopService {

    @Resource(name = "shopDao")
    private ShopDao shopDao;

    public ShopServiceImpl() {
      log.info("############### ShopServiceImpl instance has created ###############");
    }

    @Override
    public List<Product> getAllProducts() {
        return shopDao.getAllProducts();
    }

    @Override
    public void addProduct(Product product) {
        shopDao.addProduct(product);
    }
}
