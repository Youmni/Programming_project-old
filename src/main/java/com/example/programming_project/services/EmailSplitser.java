package com.example.programming_project.services;

import org.springframework.stereotype.Service;


@Service
public class EmailSplitser {

    private String voornaam;
    private String achternaam;


    public static String EmailSplitserMethod(String email){
        String[] emailStukjes = email.split("@")[0].split("\\.");
        String voornaam = emailStukjes[0];
        StringBuilder achternaam = new StringBuilder();

        for(int i = 1; i < emailStukjes.length; i++){
            achternaam.append(emailStukjes[i]).append(" ");
        }
        return (voornaam+" "+achternaam.toString());
    }

    public static String EmailSplitserVoornaam(String email){
        String[] emailStukjes = email.split("@")[0].split("\\.");
        String voornaam = emailStukjes[0];

        return (voornaam);
    }

    public static String EmailSplitserAchternaam(String email){
        String[] emailStukjes = email.split("@")[0].split("\\.");
        StringBuilder achternaam = new StringBuilder();

        for(int i = 1; i < emailStukjes.length; i++){
            achternaam.append(emailStukjes[i]).append(" ");
        }
        return (achternaam.toString());
    }
}
