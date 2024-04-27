package com.example.programming_project.dao;

import com.example.programming_project.modellen.Categorie;
import com.example.programming_project.modellen.Gebruiker;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Locale;

public interface CategorieCrudRepository extends CrudRepository<Categorie, Integer> {

    public List<Categorie> findByCategorieNr(int categorieNr);
    public List<Categorie> findByCategorieNaam(String categorieNaam);

}
