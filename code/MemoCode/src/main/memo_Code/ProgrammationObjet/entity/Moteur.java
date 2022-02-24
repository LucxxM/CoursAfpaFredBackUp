package main.memo_Code.ProgrammationObjet.entity;

public class Moteur {
    public int nbCylindres;
    public String motorisation;

    public Moteur() {
    }

    public Moteur(int nbCylindres, String motorisation){
        this.nbCylindres = nbCylindres;
        this.motorisation = motorisation;
    }


    // méthodes
    public void afficheMotorisation(){
        System.out.println("Il sagit d'un moteur " + motorisation);
    }
}
