package com.mycompany.travail.boatAndCo.entity;

public class Moteur {
    public static String carburation = "Diesel";
    private int NbCylindres = 4;
    private String anneeFabricationMoteur;

    public void demarrer(){
        System.out.println("Je démarre");
    }

    public static String getCarburation() {
        return carburation;
    }



    public static void setCarburation(String carburation) {
        Moteur.carburation = carburation;
    }

    public int getNbCylindres() {
        return NbCylindres;
    }

    public void setNbCylindres(int nbCylindres) {
        NbCylindres = nbCylindres;
    }

    public String getAnneeFabricationMoteur() {
        return anneeFabricationMoteur;
    }

    public void setAnneeFabricationMoteur(String anneeFabricationMoteur) {
        this.anneeFabricationMoteur = anneeFabricationMoteur;
    }
}
