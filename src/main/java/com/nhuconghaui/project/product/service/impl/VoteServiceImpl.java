package com.nhuconghaui.project.product.service.impl;

import com.nhuconghaui.project.product.model.Vote;
import com.nhuconghaui.project.product.repository.VoteRepository;
import com.nhuconghaui.project.product.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class VoteServiceImpl implements VoteService {
    @Autowired
    private VoteRepository voteRepository;

    @Override
    public Page<Vote> findAll(Pageable pageable) {
        return voteRepository.findAll(pageable);
    }

    @Override
    public Optional<Vote> findById(Long id) {
        return voteRepository.findById(id);
    }

    @Override
    public void save(Vote vote) {
        voteRepository.save(vote);
    }

    @Override
    public void remove(Long id) {
        voteRepository.deleteById(id);
    }

    @Override
    public Page<Vote> findByNameProduct(String nameProduct, Pageable pageable) {
        return voteRepository.findByNameProduct(nameProduct, pageable);
    }
}
