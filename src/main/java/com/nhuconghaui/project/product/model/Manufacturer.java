package com.nhuconghaui.project.product.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameManufacturer;

    @OneToMany(mappedBy = "Product")
    private Set<Product> products;

    @OneToMany(mappedBy = "Model")
    private Set<Model> models;

    public Manufacturer() {
    }

    public Manufacturer(String nameManufacturer, Set<Product> products, Set<Model> models) {
        this.nameManufacturer = nameManufacturer;
        this.products = products;
        this.models = models;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }
}
