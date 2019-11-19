package com.nhuconghaui.project.product.service;

import com.nhuconghaui.project.product.model.Manufacturer;
import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ManufacturerService {
    Page<Manufacturer> findAll(Pageable pageable);

    Optional<Manufacturer> findById(Long id);

    void save(Manufacturer manufacturer);

    void remove(Long id);

    Page<Manufacturer> findByNameProduct (String nameProduct, Pageable pageable);

    Page<Manufacturer> findByNameModel (String nameModel, Pageable pageable);
}
