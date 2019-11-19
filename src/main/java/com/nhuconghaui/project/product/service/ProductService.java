package com.nhuconghaui.project.product.service;

import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.model.Product;
import com.nhuconghaui.project.product.model.Specifications;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Optional<Product> findById(Long id);

    void save(Product product);

    void remove(Long id);

    Page<Product> findByNameManufacturer (String nameManufacturer, Pageable pageable);

    Page<Product> findByNameModel (String nameModel, Pageable pageable);
}
