package com.nhuconghaui.project;

import com.nhuconghaui.project.product.service.ManufacturerService;
import com.nhuconghaui.project.product.service.impl.ManufacturerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Bean
    public ManufacturerService manufacturerService() {
        return  new ManufacturerServiceImpl();
    }

}
