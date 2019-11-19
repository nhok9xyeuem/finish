package com.nhuconghaui.project.product.service.impl;

import com.nhuconghaui.project.product.model.Product;
import com.nhuconghaui.project.product.repository.ProductRepository;
import com.nhuconghaui.project.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
    productRepository.save(product);
    }

    @Override
    public void remove(Long id) {
productRepository.deleteById(id);
    }

    @Override
    public Page<Product> findByNameManufacturer(String nameManufacturer, Pageable pageable) {
        return productRepository.findByNameManufacturer(nameManufacturer,pageable);
    }

    @Override
    public Page<Product> findByNameModel(String nameModel, Pageable pageable) {
        return productRepository.findByNameModel(nameModel, pageable);
    }
}
