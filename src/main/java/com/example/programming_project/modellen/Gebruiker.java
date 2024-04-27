package com.example.programming_project.modellen;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "GEBRUIKERS")
public class Gebruiker {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Gebruikerid")
    private int gebruikerID;

    @Column(name="Email" )
    private String email;

    @Column(name="Wachtwoord")
    private String wachtwoord;

    @Column(name="Titel")
    private String titel;

    @OneToMany(mappedBy = "gebruiker")
    private Set<Reservatie> reservaties= new HashSet<>();

    public Gebruiker(int gebruikerID, String email, String wachtwoord, String titel) {
        this.gebruikerID = gebruikerID;
        this.email = email;
        this.wachtwoord = wachtwoord;
        this.titel = titel;
    }


    protected Gebruiker() {

    }

    @Override
    public String toString() {
        return "Gebruiker{" +
                "gebruikerID=" + gebruikerID +
                ", email='" + email + '\'' +
                ", wachtwoord='" + wachtwoord + '\'' +
                ", titel='" + titel + '\'' +
                '}';
    }

    public int getGebruikerID() {
        return gebruikerID;
    }

    void setGebruikerID(int gebruikerID) {
        this.gebruikerID = gebruikerID;
    }

    public String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getTitel() {
        return titel;
    }

    void setTitel(String titel) {
        this.titel = titel;
    }
}
