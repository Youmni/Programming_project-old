package com.example.programming_project.controllers;

import com.example.programming_project.dao.GebruikerCrudRepository;
import com.example.programming_project.dao.ProductCrudRepository;
import com.example.programming_project.modellen.Gebruiker;
import com.example.programming_project.modellen.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/product")
public class ProductController {



        @Autowired
        ProductCrudRepository repo;

        @CrossOrigin
        @RequestMapping(method = RequestMethod.GET)
        public List<Product> getAllProducts(){
            ArrayList<Product> productMandje = new ArrayList<>();
            repo.findAll().forEach(productMandje::add);
            return productMandje;
        }

        @CrossOrigin
        @GetMapping(value = "/beschikbaaraantal")
        public int getAllBeschikbaarNumber(){
            Iterable<Product> aantalBeschikbaar = repo.findByStatusIgnoreCase("beschikbaar");
            int aantal = 0;
            for(Product beschikbaar: aantalBeschikbaar){
                aantal++;
            }
            return aantal;
        }

        @CrossOrigin
        @GetMapping(value = "/gereserveerdaantal")
        public int getAllGereserveerdNumber(){
            Iterable<Product> aantalGereserveerd = repo.findByStatusIgnoreCase("gereserveerd");
            int aantal = 0;
            for(Product gereserveerd: aantalGereserveerd){
                aantal++;
            }
            return aantal;
        }

        @CrossOrigin
        @GetMapping(value = "/uitgeleenddaantal")
        public int getAllUitgeleendNumber(){
            Iterable<Product> aantalUitgeleend = repo.findByStatusIgnoreCase("uitgeleend");
            int aantal = 0;
            for(Product uitgeleend: aantalUitgeleend){
                aantal++;
            }
            return aantal;
        }


        @CrossOrigin
        @GetMapping(value = "/id={id}")
        public List<Product> getAllProductenById(@PathVariable(name = "id") int id){
            return repo.findByProductID(id);
        }

        @CrossOrigin
        @GetMapping(value = "/naam={naam}")
        public List<Product> getAllProductenByNaam(@PathVariable(name = "naam") String naam) {
            return repo.findByProductNaamContainingIgnoreCase(naam);
        }

        @CrossOrigin
        @GetMapping("/status={status}")
        public List<Product> getAllProductenByStatus(@PathVariable(name = "status") String status) {
            return repo.findByStatusIgnoreCase(status);
        }

        @CrossOrigin
        @GetMapping(value = "/naam={naam}/status={status}")
        public List<Product> getAllProductenByNameAndStatus(@PathVariable(name = "naam") String naam,
                                                            @PathVariable(name = "status") String status) {

            return repo.findByProductNaamContainingIgnoreCaseAndStatusContainingIgnoreCase(naam, status);
        }

        @CrossOrigin
        @GetMapping(value = "/id={id}/status={status}")
        public List<Product> getAllProductenByIdAndStatus(@PathVariable(name = "id") int id,
                                                            @PathVariable(name = "status") String status) {

            return repo.findByProductIDAndStatusContainingIgnoreCase(id, status);
        }

    }

