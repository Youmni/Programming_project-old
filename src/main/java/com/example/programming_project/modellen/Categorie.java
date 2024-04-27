package com.example.programming_project.modellen;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CATEGORIEËN")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Categorienr")
    private int categorieNr;
    @OneToMany(mappedBy = "categorie")
    private Set<ProductModel> productModellen = new HashSet<>();

    @Column(name= "Categorienaam")
    private String categorieNaam;

    protected Categorie(){}

    public Categorie(int categorieNr, String categorieNaam) {
        this.categorieNr = categorieNr;
        this.categorieNaam = categorieNaam;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "categorieNr=" + categorieNr +
                ", categorieNaam='" + categorieNaam + '\'' +
                '}';
    }

    public int getCategorieNr() {
        return categorieNr;
    }

    void setCategorieNr(int categorieNr) {
        this.categorieNr = categorieNr;
    }

    public String getCategorieNaam() {
        return categorieNaam;
    }

    void setCategorieNaam(String categorieNaam) {
        this.categorieNaam = categorieNaam;
    }
}
