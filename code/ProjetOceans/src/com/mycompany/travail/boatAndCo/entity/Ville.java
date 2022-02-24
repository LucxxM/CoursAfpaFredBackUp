package com.mycompany.travail.boatAndCo.entity;

public class Ville {
    public String nom;
    Port port;

    public Ville(Port port) {
        System.out.println("Une ville est crée avec un port en parametre");
        this.port = port;
    }

    public Ville(String nomVille, int nbEmplacements){
        System.out.println("Une ville est crée avec un nom et un nombre d'emplacement");
        this.nom = nomVille;

        Port port = new Port();
        port.ville = nomVille;
        port.nbEmplacements = nbEmplacements;
    }


}
