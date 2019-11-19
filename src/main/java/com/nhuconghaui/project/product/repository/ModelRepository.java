package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Model;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ModelRepository extends PagingAndSortingRepository<Model,Long> {
}
