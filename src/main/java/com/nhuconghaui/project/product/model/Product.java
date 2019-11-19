package com.nhuconghaui.project.product.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nameProduct; // tên sản phẩm
    String manufacturer; // hãng sản xuất
    String model; // model sản phẩm
    Long productPrice; // giá sản phẩm
    Long amount;//giá sản phẩm
    String productDescription;// mô tả sản phẩm
    String image;//hình ảnh sản phẩm
    String vote; // đánh giá sản phẩm

}
