package com.nhuconghaui.project.product.service;

import com.nhuconghaui.project.product.model.Product;
import com.nhuconghaui.project.product.model.Specifications;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SpecificationsService {
    Page<Specifications> findAll(Pageable pageable);

    Optional<Specifications> findById(Long id);

    void save(Specifications specifications);

    void remove(Long id);

    Page<Specifications> findByNameProduct (String nameProduct, Pageable pageable);

    Page<Specifications> findByNameModel (String nameProduct, Pageable pageable);
}
