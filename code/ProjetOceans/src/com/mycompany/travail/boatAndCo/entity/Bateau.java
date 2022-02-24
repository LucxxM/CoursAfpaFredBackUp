package com.mycompany.travail.boatAndCo.entity;

public class Bateau {
    public String marque;
    public String couleur;
    public Moteur moteur;

    public static int nbBateauxCree = 0;

    public Bateau(){
        nbBateauxCree++;
    }

    public void naviguer() {
        System.out.println("Je navigue");
    }

    public void rentrerAuPort(Port port) {
        boolean restePlaceDisponible = port.restePlaceDisponible(port.emplacements);
        if (restePlaceDisponible == false) {
            System.out.println("Il n'y a plus de place, je ne peux pas rentrer au port");
        } else {
            System.out.println("Je rentre au port");
        }
    }

    public static int calculerDistanceParcourue(int duree, int vitesse){
        return duree * vitesse;
    }
}