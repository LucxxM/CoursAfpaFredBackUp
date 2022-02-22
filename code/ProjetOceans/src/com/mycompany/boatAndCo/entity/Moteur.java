package com.mycompany.boatAndCo.entity;

public class Moteur {
    public int NbCylindres = 4;
    public String anneeFabricationMoteur;
    public String carburation = "Diesel";

    public void demarrer(){
        System.out.println("Je démarre");
    }
}
