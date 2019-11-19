package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
    Page<Product> findByNameManufacturer (String nameManufacturer, Pageable pageable);

    Page<Product> findByNameModel (String nameModel, Pageable pageable);
}
