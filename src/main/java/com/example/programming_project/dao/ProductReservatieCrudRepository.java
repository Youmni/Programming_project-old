package com.example.programming_project.dao;

import com.example.programming_project.modellen.Product;
import com.example.programming_project.modellen.ProductReservaties;
import com.example.programming_project.modellen.Reservatie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductReservatieCrudRepository extends CrudRepository<ProductReservaties, Integer> {
    public List<ProductReservaties> findByProduct_ProductID(int productID);
    public List<ProductReservaties> findByReservatie_ReservatieNr(int reservatieNr);
}

