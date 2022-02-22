package com.mycompany.boatAndCo.entity;

public class Moteur {
    public int NbCylindres = 4;
    public String anneeFabricationMoteur;
    public String carburation = "Diesel";

    public void demarrer(){
        System.out.println("Je démarre");
    }

    public String demarrer(int duree){
        return "Mon moteur tourne depuis " + duree + " minutes, ça chauffe";
    }
}
