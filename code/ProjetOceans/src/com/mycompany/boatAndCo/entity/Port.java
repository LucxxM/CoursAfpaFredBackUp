package com.mycompany.boatAndCo.entity;

public class Port {
    public int nbEmplacements;
    public Bateau[] emplacements;

    public boolean restePlaceDisponible(Bateau[] emplacements) {
        boolean restePlaceDisponible = false;

        for (int index = 0; index < emplacements.length; index++) {
            Bateau bateau = emplacements[index];

            if (emplacements[index] == null) {
                return true;
            }
        }

        return false;
        }
}


