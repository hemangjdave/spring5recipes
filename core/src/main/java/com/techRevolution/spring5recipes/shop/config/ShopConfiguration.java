package com.techRevolution.spring5recipes.shop.config;

import com.techRevolution.spring5recipes.shop.Battery;
import com.techRevolution.spring5recipes.shop.OtgCable;
import com.techRevolution.spring5recipes.shop.Pendrive;
import com.techRevolution.spring5recipes.shop.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan(basePackages = "com.techRevolution.spring5recipes.shop")
@PropertySource(value = "classpath:discount.properties")
@Slf4j
public class ShopConfiguration {

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
        Pendrive pendrive = new Pendrive("Sony", 500);
        pendrive.setCapacity(16);
        return pendrive;
    }

    @Bean
    public Product battery(){
        Battery battery = new Battery("AAA", 250.50);
        battery.setRechargable(true);
        return battery;
    }

    @Bean
    public Product otgCable(){
        return new OtgCable("cable", 30);
    }
}
