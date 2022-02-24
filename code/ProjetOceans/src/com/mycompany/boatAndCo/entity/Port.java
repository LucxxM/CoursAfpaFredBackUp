package com.mycompany.boatAndCo.entity;

public class Port {
    public String nom;
    public int nbEmplacements;
    public Bateau[] emplacements;

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
}


