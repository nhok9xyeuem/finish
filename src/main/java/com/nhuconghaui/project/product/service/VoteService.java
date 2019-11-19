package com.nhuconghaui.project.product.service;

import com.nhuconghaui.project.product.model.Specifications;
import com.nhuconghaui.project.product.model.Vote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface VoteService {
    Page<Vote> findAll(Pageable pageable);

    Optional<Vote> findById(Long id);

    void save(Vote vote);

    void remove(Long id);

    Page<Vote> findByNameProduct (String nameProduct, Pageable pageable);
}
