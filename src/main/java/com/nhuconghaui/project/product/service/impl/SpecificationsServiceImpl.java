package com.nhuconghaui.project.product.service.impl;

import com.nhuconghaui.project.product.model.Specifications;
import com.nhuconghaui.project.product.repository.SpecificationsRepository;
import com.nhuconghaui.project.product.service.SpecificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class SpecificationsServiceImpl implements SpecificationsService {
    @Autowired
    private SpecificationsRepository specificationsRepository;

    @Override
    public Page<Specifications> findAll(Pageable pageable) {
        return specificationsRepository.findAll(pageable);
    }

    @Override
    public Optional<Specifications> findById(Long id) {
        return specificationsRepository.findById(id);
    }

    @Override
    public void save(Specifications specifications) {
        specificationsRepository.save(specifications);
    }

    @Override
    public void remove(Long id) {
        specificationsRepository.deleteById(id);
    }

    @Override
    public Page<Specifications> findByNameProduct(String nameProduct, Pageable pageable) {
        return specificationsRepository.findByNameProduct(nameProduct, pageable);
    }

    @Override
    public Page<Specifications> findByNameModel(String nameModel, Pageable pageable) {
        return specificationsRepository.findByNameModel(nameModel, pageable);
    }
}
