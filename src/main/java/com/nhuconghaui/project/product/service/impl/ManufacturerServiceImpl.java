package com.nhuconghaui.project.product.service.impl;

import com.nhuconghaui.project.product.model.Manufacturer;
import com.nhuconghaui.project.product.model.Model;
import com.nhuconghaui.project.product.repository.ManufacturerRepository;
import com.nhuconghaui.project.product.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    public ManufacturerRepository manufacturerRepository;

    @Override
    public Page<Manufacturer> findAll(Pageable pageable) {
        return manufacturerRepository.findAll(pageable);
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return manufacturerRepository.findById(id);
    }

    @Override
    public void save(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }

    @Override
    public void remove(Long id) {
        manufacturerRepository.deleteById(id);

    }

    @Override
    public Iterable<ManufacturerService> findAllByModel(Model model) {
        return manufacturerRepository.findAllByModel(model);
    }

    @Override
    public Page<ManufacturerService> findByNameProduct(String nameProduct, Pageable pageable) {
        return manufacturerRepository.findByNameProduct(nameProduct, pageable);
    }
}
