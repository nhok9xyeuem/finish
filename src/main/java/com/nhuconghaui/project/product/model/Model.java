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

    @OneToMany(mappedBy = "specification")
    private Set<Specifications> specification; // thông số kỹ thuật

    @OneToMany(mappedBy = "Product")
    private Set<Product> products;

    public Model() {
    }

    public Model(String nameModel, Set<Specifications> specification, Set<Product> products) {
        this.nameModel = nameModel;
        this.specification = specification;
        this.products = products;
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
}
