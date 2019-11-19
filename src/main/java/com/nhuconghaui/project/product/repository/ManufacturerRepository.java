package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Manufacturer;
import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.service.ManufacturerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ManufacturerRepository extends PagingAndSortingRepository<Manufacturer,Long> {
    Page<Manufacturer> findByNameProduct (String nameProduct, Pageable pageable);

    Page<Manufacturer> findByNameModel (String nameModel, Pageable pageable);
}

