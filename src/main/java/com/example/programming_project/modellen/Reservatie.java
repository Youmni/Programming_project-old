package com.example.programming_project.modellen;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Reservatie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Reservatienr")
    private int reservatieNr;


    @ManyToOne
    @JoinColumn(name = "Gebruikerid", nullable = false)
    private Gebruiker gebruiker;

    @Column(name="Afhaaldatum")
    private LocalDate afhaalDatum;

    @Column(name="Retourdatum")
    private LocalDate retourDatum;

    @Column(name="Boekingdatum")
    private LocalDate boekingDatum;

    @OneToMany(mappedBy = "reservatie")
    private Set<ProductReservaties> productreservaties = new HashSet<>();

    protected Reservatie(){}

    public Reservatie(int reservatieNr, Gebruiker gebruiker, LocalDate afhaalDatum, LocalDate retourDatum, LocalDate boekingDatum) {
        this.reservatieNr = reservatieNr;
        this.gebruiker = gebruiker;
        this.afhaalDatum = afhaalDatum;
        this.retourDatum = retourDatum;
        this.boekingDatum = boekingDatum;
    }

    @Override
    public String toString() {
        return "Reservatie{" +
                "reservatieNr=" + reservatieNr +
                ", gebruikerID=" + gebruiker.getGebruikerID() +
                ", afhaalDatum=" + afhaalDatum +
                ", retourDatum=" + retourDatum +
                ", boekingDatum=" + boekingDatum +
                '}';
    }

    public int getReservatieNr() {
        return reservatieNr;
    }

    void setReservatieNr(int reservatieNr) {
        this.reservatieNr = reservatieNr;
    }

    public Gebruiker getGebruikerID() {
        return gebruiker;
    }

    void setGebruikerID(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public LocalDate getAfhaalDatum() {
        return afhaalDatum;
    }

    void setAfhaalDatum(LocalDate afhaalDatum) {
        this.afhaalDatum = afhaalDatum;
    }

    public LocalDate getRetourDatum() {
        return retourDatum;
    }

    void setRetourDatum(LocalDate retourDatum) {
        this.retourDatum = retourDatum;
    }

    public LocalDate getBoekingDatum() {
        return boekingDatum;
    }

    void setBoekingDatum(LocalDate boekingDatum) {
        this.boekingDatum = boekingDatum;
    }
}
