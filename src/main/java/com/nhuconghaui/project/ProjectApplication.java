package com.nhuconghaui.project;

import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.service.*;
import com.nhuconghaui.project.product.service.impl.*;
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
        return new ManufacturerServiceImpl();
    }

    @Bean
    public ModelService modelService() {
        return new ModelServiceImpl();
    }
    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }
    @Bean
    public SpecificationsService specificationsService(){
        return new SpecificationsServiceImpl();
    }
    @Bean
    public VoteService voteService(){
        return new VoteServiceImpl();
    }
}
