package com.nhuconghaui.project.product.model;

import javax.persistence.*;

@Entity
@Table(name = "Specifications")
public class Specifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String screen; // màn hình
    String operatingSystem; // hệ điều hành
    String rearCamera; // camera sau
    String frontCamera; // camera trước
    String cpu;
    String ram;
    String rom;
    String sim;
    String battery;

}
