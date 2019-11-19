package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
}
