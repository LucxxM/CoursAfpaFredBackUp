package com.mycompany.boatAndCo.entity;

public class Port {
    private String nom;
    private int nbEmplacements;
    private Bateau[] emplacements;

    private int nbEmplacementsLibres;

    public boolean restePlaceDisponible(Bateau[] emplacements) {
        boolean restePlaceDisponible = false;

        for (int index = 0; index < emplacements.length; index++) {

            if (emplacements[index] == null) {
                return true;
            }
        }

        return false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEmplacements() {
        return nbEmplacements;
    }

    public void setNbEmplacements(int nbEmplacements) {
        this.nbEmplacements = nbEmplacements;
    }

    public Bateau[] getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(Bateau[] emplacements) {
        this.emplacements = emplacements;
    }

    public int getNbEmplacementsLibres() {
        return nbEmplacementsLibres;
    }

    public void setNbEmplacementsLibres(int nbEmplacementsLibres) {
        this.nbEmplacementsLibres = nbEmplacementsLibres;
    }
}


