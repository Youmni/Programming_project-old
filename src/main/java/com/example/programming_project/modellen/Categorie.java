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


    public int getCategorieNr() {
        return categorieNr;
    }

    public void setCategorieNr(int categorieNr) {
        this.categorieNr = categorieNr;
    }

    public String getCategorieNaam() {
        return categorieNaam;
    }

    public void setCategorieNaam(String categorieNaam) {
        this.categorieNaam = categorieNaam;
    }
}
