package com.techRevolution.spring5recipes.shop.config;

import com.techRevolution.spring5recipes.shop.Battery;
import com.techRevolution.spring5recipes.shop.OtgCable;
import com.techRevolution.spring5recipes.shop.Pendrive;
import com.techRevolution.spring5recipes.shop.Product;
import com.techRevolution.spring5recipes.shop.ProductCreator;
import com.techRevolution.spring5recipes.shop.ProductPrice;
import com.techRevolution.spring5recipes.shop.ProductsNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.techRevolution.spring5recipes.shop")
@PropertySource(value = "classpath:discount.properties")
@Slf4j
public class ShopConfiguration {

    private static final int PEN_DRIVE_STORAGE_CAPACITY = 16;

    @Value("${specialCustomer.discount}")
    private double discountValue;

    @Value("classpath:banner.txt")
    private Resource resource;

    @PostConstruct
    public void disCountValue(){
      log.info("$$$$$$$$$$$$$$$ discount value is :- {} $$$$$$$$$$$$$$$" , discountValue);
    }

    @Bean
    public BannerLoader bannerLoader(){
        BannerLoader bannerLoader = new BannerLoader();
        bannerLoader.setResource(resource);
        return bannerLoader;
    }

    @Bean
    public Product pendrive(){
        //ProductCreator.getProductByStaticFactory("pendrive");
        return productCreator().getProduct("pendrive");
    }

    @Bean
    public Product battery(){
        //ProductCreator.getProductByStaticFactory("battery");
        return productCreator().getProduct("battery");
    }

    @Bean
    public Product otgCable(){
        //ProductCreator.getProductByStaticFactory("otgCable");
        return productCreator().getProduct("otgCable");
    }

//    @Bean
    public ProductCreator productCreator(){
        Map<String ,Product> map = new HashMap<>();
        Battery battery = new Battery(ProductsNames.BATTERY.getProductName() , ProductPrice.BATTERY.getProductPrice());
        battery.setRechargable(true);
        map.put("battery", battery);
        Pendrive pendrive;
        pendrive = new Pendrive(ProductsNames.PENDRIVE.getProductName() , ProductPrice.PENDRIVE.getProductPrice());
        pendrive.setCapacity(PEN_DRIVE_STORAGE_CAPACITY);
        map.put("pendrive", pendrive);
        map.put("otgCable", new OtgCable(ProductsNames.OTGCABLE.getProductName(), ProductPrice.OTGCABLE.getProductPrice()));
        return new ProductCreator(map);
    }
}
