package com.nhuconghaui.project.product.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameModel; // tên sản phẩm

    @OneToOne
    @JoinColumn(name = "specification_id")
    private Set<Specifications> specification; // thông số kỹ thuật

    @OneToMany(mappedBy = "model")
    private Set<Product> products;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Set<Manufacturer> manufacturers;

    public Model() {
    }

    public Model(String nameModel, Set<Specifications> specification, Set<Product> products, Set<Manufacturer> manufacturers) {
        this.nameModel = nameModel;
        this.specification = specification;
        this.products = products;
        this.manufacturers = manufacturers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public Set<Specifications> getSpecification() {
        return specification;
    }

    public void setSpecification(Set<Specifications> specification) {
        this.specification = specification;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Set<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }
}
