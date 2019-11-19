package com.nhuconghaui.project.product.repository;

import com.nhuconghaui.project.product.model.Vote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VoteRepository extends PagingAndSortingRepository<Vote,Long> {
    Page<Vote> findByNameProduct (String nameProduct, Pageable pageable);

}
