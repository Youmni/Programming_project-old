package com.example.programming_project.modellen;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "PRODUCTMODELLEN")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Productmodelnr")
    private int productModelNr;

    @ManyToOne
    @JoinColumn(name = "categorieNr", nullable = false)
    private Categorie categorie;

    @Column(name="Productmodelnaam")
    private String productModelNaam;

    @Column(name="Productmodelmerk")
    private String productModelMerk;

    @Column(name="Productmodelfoto")
    private String productModelFoto;

    @Column(name="Productmodelbeschrijving")
    private String productModelBeschrijving;

    @OneToMany(mappedBy = "productModel")
    private Set<Product> producten = new HashSet<>();

    public ProductModel(int productModelNr, Categorie categorie, String productModelNaam, String productModelMerk, String productModelFoto, String productModelBeschrijving) {
        this.productModelNr = productModelNr;
        this.categorie = categorie;
        this.productModelNaam = productModelNaam;
        this.productModelMerk = productModelMerk;
        this.productModelFoto = productModelFoto;
        this.productModelBeschrijving = productModelBeschrijving;
    }

    protected ProductModel(){};

    @Override
    public String toString() {
        return "ProductModel{" +
                "productModelNr=" + productModelNr +
                ", categorieNr=" + categorie.getCategorieNr() +
                ", productModelNaam='" + productModelNaam + '\'' +
                ", productModelMerk='" + productModelMerk + '\'' +
                ", productModelFoto='" + productModelFoto + '\'' +
                ", productModelBeschrijving='" + productModelBeschrijving + '\'' +
                '}';
    }

    public int getProductModelNr() {
        return productModelNr;
    }

    void setProductModelNr(int productModelNr) {
        this.productModelNr = productModelNr;
    }


    public String getProductModelNaam() {
        return productModelNaam;
    }

    void setProductModelNaam(String productModelNaam) {
        this.productModelNaam = productModelNaam;
    }

    public String getProductModelMerk() {
        return productModelMerk;
    }

    void setProductModelMerk(String productModelMerk) {
        this.productModelMerk = productModelMerk;
    }

    public String getProductModelFoto() {
        return productModelFoto;
    }

    void setProductModelFoto(String productModelFoto) {
        this.productModelFoto = productModelFoto;
    }

    public String getProductModelBeschrijving() {
        return productModelBeschrijving;
    }

    void setProductModelBeschrijving(String productModelBeschrijving) {
        this.productModelBeschrijving = productModelBeschrijving;
    }
}
