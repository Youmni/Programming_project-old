package com.example.programming_project.dao;

import com.example.programming_project.modellen.Categorie;
import com.example.programming_project.modellen.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductModelCrudRepository extends CrudRepository<ProductModel, Integer> {
    public List<ProductModel> findByProductModelNr(int productModelNr);
    public List<ProductModel> findByProductModelNaamContainingIgnoreCase(String productModelNaam);
    public List<ProductModel> findByProductModelMerkContainingIgnoreCase(String productModelMerk);
    public List<ProductModel> findByCategorie(Categorie categorie);
}
