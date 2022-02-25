package com.mycompany.travail.boatAndCo.entity;

public class Port {
    private String nom;
    private int nbEmplacements;
    private Boat[] emplacements;

    private int nbEmplacementsLibres;

    public boolean restePlaceDisponible(Boat[] emplacements) {
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

    public Boat[] getEmplacements() {
        return emplacements;
    }

    public void setEmplacements(Boat[] emplacements) {
        this.emplacements = emplacements;
    }

    public int getNbEmplacementsLibres() {
        return nbEmplacementsLibres;
    }

    public void setNbEmplacementsLibres(int nbEmplacementsLibres) {
        this.nbEmplacementsLibres = nbEmplacementsLibres;
    }
}


