package com.example.programming_project.dao;

import com.example.programming_project.modellen.Product;
import com.example.programming_project.modellen.ProductModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    public List<Product> findByProductID(int productID);
    public List<Product> findByProductNaamContainingIgnoreCase(String productNaam);
    public List<Product> findByStatusIgnoreCase(String status);
    public List<Product> findByProductNaamContainingIgnoreCaseAndStatusContainingIgnoreCase (String naam, String status);
    public List<Product> findByProductIDAndStatusContainingIgnoreCase (int id, String status);
}
