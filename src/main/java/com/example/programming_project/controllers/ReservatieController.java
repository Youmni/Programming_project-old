package com.example.programming_project.controllers;

import com.example.programming_project.dao.ProductReservatieCrudRepository;
import com.example.programming_project.dao.ReservatieCrudRepository;
import com.example.programming_project.modellen.Gebruiker;
import com.example.programming_project.modellen.ProductReservatie;
import com.example.programming_project.modellen.Reservatie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/reservatie")
public class ReservatieController {


    @Autowired
    ReservatieCrudRepository repo;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Reservatie> getAllReservaties() {
        ArrayList<Reservatie> reservatieMandje = new ArrayList<>();
        repo.findAll().forEach(reservatieMandje::add);
        return reservatieMandje;
    }

    @CrossOrigin
    @GetMapping(value = "/id={id}")
    public List<Reservatie> getAllProductenByReservatieId(@PathVariable(name = "id") int id) {
        return repo.findByReservatieNr(id);
    }

    //@CrossOrigin
    //@GetMapping(value = "/gebruikerId={id}")
    //public List<Reservatie> getAllReservatiesByGebruikerId(@PathVariable(name = "gebruiker") Gebruiker gebruiker) {
    //    return repo.findByGebruiker(gebruiker);
    //}

    @CrossOrigin
    @GetMapping(value = "/afhaaldatum={date}")
    public List<Reservatie> getAllProductenByAfhaalDatum(@PathVariable(name = "id") LocalDate date) {
        return repo.findByAfhaalDatum(date);
    }

    @CrossOrigin
    @GetMapping(value = "/retourDatum={date}")
    public List<Reservatie> getAllReservatiesByRetourDatum(@PathVariable(name = "date") LocalDate date) {
        return repo.findByRetourDatum(date);
    }

    @CrossOrigin
    @GetMapping(value = "/boekingDatum={date}")
    public List<Reservatie> getAllReservatieByBoekingDatum(@PathVariable(name = "date") LocalDate date) {
        return repo.findByBoekingDatum(date);
    }

}
