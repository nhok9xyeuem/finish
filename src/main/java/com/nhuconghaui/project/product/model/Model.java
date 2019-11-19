package com.nhuconghaui.project.product.model;

import javax.persistence.*;

@Entity
@Table(name = "Model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nameModel; // tên sản phẩm
    String specifications; // thông số kỹ thuật
}
