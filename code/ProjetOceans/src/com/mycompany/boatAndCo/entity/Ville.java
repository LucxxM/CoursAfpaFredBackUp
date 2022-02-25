package com.mycompany.boatAndCo.entity;

public class Ville {
    private String nom;
    private Port port;

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }
}
