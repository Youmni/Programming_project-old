package com.example.programming_project.dao;

import com.example.programming_project.modellen.Gebruiker;
import com.example.programming_project.modellen.Reservatie;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReservatieCrudRepository extends CrudRepository<Reservatie, Integer> {
    public List<Reservatie> findByBoekingDatum(LocalDate boekingDatum);
    public List<Reservatie> findByReservatieNr(int reservatieNr);
    public List<Reservatie> findByAfhaalDatum(LocalDate afhaalDatum);
    public List<Reservatie> findByRetourDatum(LocalDate retourDatum);
    public List<Reservatie> findByGebruiker(Gebruiker gebruiker);
    public List<Reservatie> findByStatus(String status);
    public List<Reservatie> findByOpmerking(String opmerking);
    public List<Reservatie> findByRedenContainingIgnoreCase(String reden);




}
