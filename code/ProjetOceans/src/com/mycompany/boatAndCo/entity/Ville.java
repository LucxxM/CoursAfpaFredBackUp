package com.mycompany.boatAndCo.entity;

public class Ville {
    public String nom;
    public Port port;

    public Ville(String nom, Port port) {
        System.out.println("J'instancie une ville avec son nom et un objet Port");
        this.nom = nom;
        this.port = port;
    }

    public Ville(Port port) {
        System.out.println("J'instancie une ville avec un objet Port");
        this.port = port;
    }

    public Ville(String nom, int nbEmplacements) {
        System.out.println("J'instancie une ville avec son nom et le nombre d'empalcements");
        this.nom = nom;
    }
}
