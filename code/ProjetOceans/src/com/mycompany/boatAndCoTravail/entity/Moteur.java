package com.mycompany.travail.entity;

public class Moteur {
    public int NbCylindres = 4;
    public String anneeFabricationMoteur;

    public void demarrer(){
        System.out.println("Je démarre");
    }

    public String demarrer(int duree){
        System.out.println("Je démarre pendant " + duree);
        return "Mon moteur tourne depuis " + duree + " minutes, ça chauffe";

    }
}
