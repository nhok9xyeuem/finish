package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Specifications;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpecificationsRepository extends PagingAndSortingRepository<Specifications,Long> {
    Page<Specifications> findByNameProduct (String nameProduct, Pageable pageable);

    Page<Specifications> findByNameModel (String nameProduct, Pageable pageable);
}
