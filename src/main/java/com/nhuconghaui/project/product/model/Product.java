package com.nhuconghaui.project.product.model;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String nameProduct; // tên sản phẩm

    @ManyToOne
    @JoinColumn(name="Manufacturer")
    private Manufacturer manufacturer; // hãng sản xuất

    @ManyToOne
    @JoinColumn(name="Model")
    private Model model; // model sản phẩm

    private Long productPrice; // giá sản phẩm
    private Long amount;// số lượng
    private String productDescription;// mô tả sản phẩm
    private String image;//hình ảnh sản phẩm

    @ManyToOne
    @JoinColumn(name="Vote")
    private String vote; // đánh giá sản phẩm

    @ManyToOne
    @JoinColumn(name="Specifications")
    private Specifications specifications; // thông số kỹ thuật

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }
}
