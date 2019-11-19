package com.nhuconghaui.project.product.service.impl;

import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.model.Specifications;
import com.nhuconghaui.project.product.repository.ModelRepository;
import com.nhuconghaui.project.product.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ModelServiceImpl implements ModelService {
    @Autowired
    private ModelRepository modelRepository;

    @Override
    public Page<Model> findAll(Pageable pageable) {
        return modelRepository.findAll(pageable);
    }

    @Override
    public Optional<Model> findById(Long id) {
        return modelRepository.findById(id);
    }

    @Override
    public void save(Model model) {
        modelRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        modelRepository.deleteById(id);
    }


    @Override
    public Page<Model> findByNameProduct(String nameProduct, Pageable pageable) {
        return modelRepository.findByNameProduct(nameProduct, pageable);
    }

    @Override
    public Page<Model> findByNameManufacturer(String nameManufacturer, Pageable pageable) {
        return modelRepository.findByNameManufacturer(nameManufacturer, pageable);
    }
}
