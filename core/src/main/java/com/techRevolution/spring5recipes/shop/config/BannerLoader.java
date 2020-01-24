package com.techRevolution.spring5recipes.shop.config;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j
public class BannerLoader {

    @Setter
    private Resource resource;

    public BannerLoader() {
        log.info("############### BannerLoader instance has created ###############");
    }

    @PostConstruct
    public void loadBanner(){
        try {
            InputStream inputStream = resource.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                log.info(line);
            }
        } catch (IOException e) {
            log.error("Error in getting input stream.");
        }
    }

}
