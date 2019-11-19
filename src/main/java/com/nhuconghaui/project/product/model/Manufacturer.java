package com.nhuconghaui.project.product.model;

import javax.persistence.*;

@Entity
@Table(name = "Manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nameManufacturer;
}
