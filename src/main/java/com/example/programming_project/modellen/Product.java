package com.example.programming_project.modellen;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Productid" )
    private int productID;

    @ManyToOne
    @JoinColumn(name = "Productmodelnr", nullable = false)
    private ProductModel productModel;

    @Column(name="Productnaam")
    private String productNaam;

    @Column(name="Status")
    private String status;

    @OneToMany(mappedBy = "product")
    private Set<ProductReservaties> productreservaties = new HashSet<>();


    public Product(int productID, ProductModel productModel, String productNaam, String status) {
        this.productID = productID;
        this.productModel = productModel;
        this.productNaam = productNaam;
        this.status = status;
    }

    protected Product() {}

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productModelNr=" + productModel.getProductModelNr() +
                ", productNaam='" + productNaam + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getProductID() {
        return productID;
    }

    void setProductID(int productID) {
        this.productID = productID;
    }

    public ProductModel getProductModelNr() {
        return productModel;
    }

    void setProductModelNr(ProductModel productModel) {
        this.productModel = productModel;
    }

    public String getProductNaam() {
        return productNaam;
    }

    void setProductNaam(String productNaam) {
        this.productNaam = productNaam;
    }

    public String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }
}
