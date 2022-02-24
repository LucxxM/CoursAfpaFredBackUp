package com.mycompany.travail.boatAndCo.entity;

public class Port {
    public Bateau[] emplacements;
    public String ville;
    public int nbEmplacements;


    public Port(){

    }

    public Port(String ville, int nbEmplacements) {
        this.ville = ville;
        this.nbEmplacements = nbEmplacements;
    }

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
