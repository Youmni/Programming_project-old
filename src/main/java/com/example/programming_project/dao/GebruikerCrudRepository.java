package com.example.programming_project.dao;

import com.example.programming_project.modellen.Gebruiker;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GebruikerCrudRepository extends CrudRepository<Gebruiker, Integer> {

    public List<Gebruiker> findByGebruikerID(int gebruikerID);
    public List<Gebruiker> findByEmail(String email);

    public List<Gebruiker> findByEmailContainingIgnoreCase(String email);
    public List<Gebruiker> findByTitel(String titel);

    public List<Gebruiker> findByBlacklist(String blacklist);
}
