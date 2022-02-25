package com.mycompany.travail.boatAndCo.entity;

import java.security.spec.ECField;

public class Computer {
    public static int nbPcInstanciés;
    private String marqueProcesseur;
    private Screen ecran;

    public Computer() {
    }

    public Computer(String marqueProcesseur, Screen ecran) {
        this.marqueProcesseur = marqueProcesseur;
        this.ecran = ecran;
    }

    public static int getNbPcInstanciés() {
        return nbPcInstanciés;
    }

    public static void setNbPcInstanciés(int nbPcInstanciés) {
        Computer.nbPcInstanciés = nbPcInstanciés;
    }

    public String getMarqueProcesseur() {
        return marqueProcesseur;
    }

    public void setMarqueProcesseur(String marqueProcesseur) {
        this.marqueProcesseur = marqueProcesseur;
    }

    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }
}
