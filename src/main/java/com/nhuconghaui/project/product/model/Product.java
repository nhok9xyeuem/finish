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
    @JoinColumn(name="manufacturer_id")
    private Manufacturer manufacturer; // hãng sản xuất

    @ManyToOne
    @JoinColumn(name="model_id")
    private Model model; // model sản phẩm

    private Long productPrice; // giá sản phẩm
    private Long amount;// số lượng
    private String productDescription;// mô tả sản phẩm
    private String image;//hình ảnh sản phẩm

    @OneToMany(mappedBy = "products")
    private Vote vote; // đánh giá sản phẩm

    @OneToOne
    @JoinColumn(name = "specifications_id")
    private Specifications specifications; // thông số kỹ thuật

    public Product() {
    }

    public Product(String nameProduct,
                   Manufacturer manufacturer,
                   Model model, Long productPrice,
                   Long amount,
                   String productDescription,
                   String image,
                   Vote vote,
                   Specifications specifications) {
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.model = model;
        this.productPrice = productPrice;
        this.amount = amount;
        this.productDescription = productDescription;
        this.image = image;
        this.vote = vote;
        this.specifications = specifications;
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

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    public Specifications getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }
}
