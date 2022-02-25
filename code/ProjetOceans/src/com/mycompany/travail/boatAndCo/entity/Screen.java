package com.mycompany.travail.boatAndCo.entity;

public class Screen {
    public static int nbEcranInstancies;
    private String marque;
    private String modele;
    private int taille;

    public Screen() {
    }

    public Screen(String marque, String modele, int taille) {
        this.marque = marque;
        this.modele = modele;
        this.taille = taille;
    }

    public static int getNbEcranInstancies() {
        return nbEcranInstancies;
    }

    public static void setNbEcranInstancies(int nbEcranInstancies) {
        Screen.nbEcranInstancies = nbEcranInstancies;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
