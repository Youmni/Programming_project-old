package com.example.programming_project.controllers;


import com.example.programming_project.dao.ProductReservatieCrudRepository;
import com.example.programming_project.modellen.ProductModel;
import com.example.programming_project.modellen.ProductReservatie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/product-reservatie")
public class ProductReservatieController {

    @Autowired
    ProductReservatieCrudRepository repo;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<ProductReservatie> getAllProductReservaties() {
        ArrayList<ProductReservatie> productReservatieMandje = new ArrayList<>();
        repo.findAll().forEach(productReservatieMandje::add);
        return productReservatieMandje;
    }

    @CrossOrigin
    @GetMapping(value = "/producten/id={id}")
    public List<ProductReservatie> getAllProductenById(@PathVariable(name = "id") int id) {
        return repo.findByProduct_ProductID(id);
    }

    @CrossOrigin
    @GetMapping(value = "/reservaties/id={id}")
    public List<ProductReservatie> getAllReservatiesById(@PathVariable(name = "id") int id) {
        return repo.findByReservatie_ReservatieNr(id);
    }
}
