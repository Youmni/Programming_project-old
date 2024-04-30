package com.example.programming_project.controllers;

import com.example.programming_project.dao.CategorieCrudRepository;
import com.example.programming_project.dao.GebruikerCrudRepository;
import com.example.programming_project.modellen.Categorie;
import com.example.programming_project.modellen.Gebruiker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/gebruiker")
public class GebruikerController {


    @Autowired
    GebruikerCrudRepository repo;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<Gebruiker> getAllGebruikers(){
        ArrayList<Gebruiker> gebruikerMandje = new ArrayList<>();
        repo.findAll().forEach(gebruikerMandje::add);
        return gebruikerMandje;
    }



    @CrossOrigin
    @GetMapping(value = "/email={email}")
    public List<Gebruiker> getAllGebruikersByEmail(@PathVariable(name = "email") String email){

        return repo.findByEmailContainingIgnoreCase(email);
    }

    @CrossOrigin
    @GetMapping(value = "/studentaantal")
    public int getAllStudententenNumber(){
        Iterable<Gebruiker> aantalStudenten = repo.findByTitel("student");
        int aantal = 0;
        for(Gebruiker student: aantalStudenten){
            aantal++;
        }
        return aantal;
    }

    @CrossOrigin
    @GetMapping(value = "/docentaantal")
    public int getAllDocentenNumber(){
        Iterable<Gebruiker> aantalDocenten = repo.findByTitel("docent");
        int aantal = 0;
        for(Gebruiker docent: aantalDocenten){
            aantal++;
        }
        return aantal;
    }

    @CrossOrigin
    @GetMapping(value = "/gebruikersaantal")
    public int getAllGebruikersNumber(){
        Iterable<Gebruiker> aantalGebruikers = repo.findAll();
        int aantal = 0;
        for(Gebruiker gebruik: aantalGebruikers){
            aantal++;
        }
        return aantal;
    }

    @CrossOrigin
    @GetMapping(value = "/voornaam={voornaam}")
    public List<Gebruiker> getAllGebruikersByVoornaam(@PathVariable(name = "voornaam") String voornaam){

        return repo.findByEmailContainingIgnoreCase(voornaam);
    }

    @CrossOrigin
    @GetMapping(value = "/achternaam={achternaam}")
    public List<Gebruiker> getAllGebruikersByAchternaam(@PathVariable(name = "achternaam") String achternaam){

        return repo.findByEmailContainingIgnoreCase(achternaam);
    }

    @CrossOrigin
    @GetMapping(value = "/naam={naam}")
    public List<Gebruiker> getAllGebruikersByName(@PathVariable(name = "naam") String naam){

        return repo.findByEmail(naam);
    }

    @CrossOrigin
    @GetMapping(value = "/titel={titel}")
    public List<Gebruiker> getAllGebruikersByTitel(@PathVariable(name = "titel") String titel){

        return repo.findByTitel(titel);
    }

    @CrossOrigin
    @GetMapping(value = "/id={id}")
    public List<Gebruiker> getAllGebruikersById(@PathVariable(name = "id") int id){

        return repo.findByGebruikerID(id);
    }
}
