package com.nhuconghaui.project.product.service;

import com.nhuconghaui.project.product.model.Manufacturer;
import com.nhuconghaui.project.product.model.Model;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ManufacturerService {
    Page<Manufacturer> findAll(Pageable pageable);

    Optional<Manufacturer> findById(Long id);

    void save(Manufacturer manufacturer);

    void remove(Long id);

    Iterable<ManufacturerService> findAllByModel(Model model);

    Page<ManufacturerService> findByNameProduct (String nameProduct, Pageable pageable);
}
