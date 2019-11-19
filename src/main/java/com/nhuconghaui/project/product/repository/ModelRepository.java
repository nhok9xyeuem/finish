package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Manufacturer;
import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.model.Specifications;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ModelRepository extends PagingAndSortingRepository<Model,Long> {
    Page<Model> findByNameProduct (String nameProduct, Pageable pageable);

    Page<Model> findByNameManufacturer (String nameManufacturer, Pageable pageable);

}
