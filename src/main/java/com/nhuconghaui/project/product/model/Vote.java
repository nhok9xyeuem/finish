package com.nhuconghaui.project.product.model;

import javax.persistence.*;

@Entity
@Table(name = "Vote")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long point; // điểm đánh giá
    String contentRated; // nội dung đánh giá
}
