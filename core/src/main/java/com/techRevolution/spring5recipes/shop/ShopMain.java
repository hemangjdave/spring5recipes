package com.techRevolution.spring5recipes.shop;

import com.techRevolution.spring5recipes.shop.config.ShopConfiguration;
import com.techRevolution.spring5recipes.shop.service.ShopService;
import com.techRevolution.spring5recipes.shop.service.ShopServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@Slf4j
public class ShopMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ShopConfiguration.class);

        ShopService shopService = (ShopService) applicationContext.getBean("shopService");

        Product battery = applicationContext.getBean(Battery.class);
        Product pendrive = applicationContext.getBean(Pendrive.class);

        shopService.addProduct(battery);
        shopService.addProduct(pendrive);

        log.info(shopService.getAllProducts().toString());

        Product otgCable = applicationContext.getBean(OtgCable.class);
        ShopService shopService2 = applicationContext.getBean(ShopServiceImpl.class);
        shopService2.addProduct(otgCable);
        log.info(shopService2.getAllProducts().toString());

        new ShopMain().readDiscountProperty();
    }

    private void readDiscountProperty(){
        Resource resource = new ClassPathResource("discount.properties");
        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(resource);
            log.info("And Don't forget out discounts.");
            log.info("{}", properties);
        } catch (IOException e) {
            log.error("Error in loading properties file.");
        }
    }

}
