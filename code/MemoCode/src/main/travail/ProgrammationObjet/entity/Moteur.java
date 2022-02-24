package main.travail.ProgrammationObjet.entity;

public class Moteur {
    public int nbCylindres;
    public String motorisation;

// Constructeur

    public Moteur(int nbCylindres, String motorisation) {
        this.nbCylindres = nbCylindres;
        this.motorisation = motorisation;
    }

    public Moteur(){
        }

    // méthodes
    public void afficheMotorisation(){
        System.out.println("Il sagit d'un moteur " + motorisation);
    }
}
