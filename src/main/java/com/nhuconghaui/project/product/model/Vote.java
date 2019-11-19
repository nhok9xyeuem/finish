package com.nhuconghaui.project.product.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Vote")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long point; // điểm đánh giá
    private String contentRated; // nội dung đánh giá

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product products;

    public Vote() {
    }

    public Vote(Long point, String contentRated, Product products) {
        this.point = point;
        this.contentRated = contentRated;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public String getContentRated() {
        return contentRated;
    }

    public void setContentRated(String contentRated) {
        this.contentRated = contentRated;
    }


    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }
}
