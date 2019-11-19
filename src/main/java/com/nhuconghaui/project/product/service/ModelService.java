package com.nhuconghaui.project.product.service;

import com.nhuconghaui.project.product.model.Manufacturer;
import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.model.Product;
import com.nhuconghaui.project.product.model.Specifications;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ModelService {
    Page<Model> findAll(Pageable pageable);

    Optional<Model> findById(Long id);

    void save(Model model);

    void remove(Long id);

    Page<Model> findByNameProduct (String nameProduct, Pageable pageable);

    Page<Model> findByNameManufacturer (String nameManufacturer, Pageable pageable);
}
