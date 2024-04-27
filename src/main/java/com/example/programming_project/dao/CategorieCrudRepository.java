package com.example.programming_project.dao;

import com.example.programming_project.modellen.Categorie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategorieCrudRepository extends CrudRepository<Categorie, Integer> {

    public List<Categorie> findByCategorieNr(int categorieNr);
    public List<Categorie> findByCategorieNaam(String categorieNaam);

}
