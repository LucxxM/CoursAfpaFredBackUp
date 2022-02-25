package com.mycompany.travail.boatAndCo.entity;

public class Boat {
    public static String carburation = "Diesel";
    private static int nbBateauxCrees = 0;
    private String marque;
    private String couleur;
    private Moteur moteur;

    public Boat(){
        System.out.println("Un bateau est instancié à partir du constructeur vide");
        nbBateauxCrees++;
    }

    public void naviguer() {
        System.out.println("Je navigue");
    }

    public void rentrerAuPort(Port port) {
        boolean restePlaceDisponible = port.restePlaceDisponible(port.getEmplacements());

        if (restePlaceDisponible == false) {
            System.out.println("Il n'y a plus de places disponibles, je ne peux par rentrer au port");
        } else {
            System.out.println("Je rentre au port");
        }

    }
    public static int calculerDistanceParcourue(int duree, int vitesse){
        return duree* vitesse;
    }

    // Getters & Setters

    public static String getCarburation() {
        return carburation;
    }

    public static void setCarburation(String carburation) {
        Boat.carburation = carburation;
    }

    public static int getNbBateauxCrees() {
        return nbBateauxCrees;
    }

    public static void setNbBateauxCrees(int nbBateauxCrees) {
        Boat.nbBateauxCrees = nbBateauxCrees;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }
}