package com.example.programming_project;


import com.example.programming_project.dao.ProductCrudRepository;
import com.example.programming_project.modellen.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value= "/employee")

public class Employee {

    @Autowired
    ProductCrudRepository repo;

    @CrossOrigin
    @RequestMapping(value = "/producten" ,method = RequestMethod.GET)
    public List<Product> getAllProducts(){
        {
            ArrayList<Product> prodlist = new ArrayList<>();
            repo.findAll().forEach(prodlist::add);

            return prodlist;
        }
    }

    @CrossOrigin
    @GetMapping("/docent")
    public String[] getEmployeeBad()
    {
        return new String[]{"Johan", "Mehmet"};
    }
}