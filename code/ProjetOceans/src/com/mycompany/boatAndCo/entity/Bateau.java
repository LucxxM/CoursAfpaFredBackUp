package com.mycompany.boatAndCo.entity;

public class Bateau {
    public static String carburation = "Diesel";
    public static int nbBateauxCrees = 0;
    public String marque;
    public String couleur;
    public Moteur moteur;

    public Bateau() {
    }

    public Bateau(Bateau bateau){
        System.out.println("Un bateau est instancié à partir du constructeur vide");
        nbBateauxCrees++;
    }

    public void naviguer() {
        System.out.println("Je navigue");
    }

    public void rentrerAuPort(Port port) {
        boolean restePlaceDisponible = port.restePlaceDisponible(port.emplacements);

        if (restePlaceDisponible == false) {
            System.out.println("Il n'y a plus de places disponibles, je ne peux par rentrer au port");
        } else {
            System.out.println("Je rentre au port");
        }

    }
    public static int calculerDistanceParcourue(int duree, int vitesse){
        return duree* vitesse;
    }




}