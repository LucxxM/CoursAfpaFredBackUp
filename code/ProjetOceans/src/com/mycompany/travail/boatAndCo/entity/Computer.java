package com.mycompany.travail.boatAndCo.entity;

public class Computer {
    public static int nbPcInstancies = 0;
    private String marqueProcesseur;
    private Screen ecran;

    public Computer() {
        nbPcInstancies++;
    }

    public Computer(String marqueProcesseur, Screen ecran) {
        System.out.println("Un ordinateur est instancié avec le constructeur qui prend en paramètre la marque du processeur et un objet Ecran");
        nbPcInstancies++;
        this.marqueProcesseur = marqueProcesseur;
        this.ecran = ecran;
    }

    public Computer(String marqueProcesseur, String marqueEcran, String modeleEcran, int taille) {
        System.out.println("Un ordinateur est instancié avec le constructeur qui prend en paramètre la marque du processeur et " +
                "les propriétés de l'écran.");
        nbPcInstancies++;
        this.marqueProcesseur = marqueProcesseur;

        // Création écran
        Screen ecran = new Screen(marqueEcran, modeleEcran, taille);

        this.ecran = ecran;
    }

    public static int getNbPcInstancies() {
        return nbPcInstancies;
    }

    public static void setNbPcInstancies(int nbPcInstancies) {
        Computer.nbPcInstancies = Computer.nbPcInstancies;
    }

    public String getMarqueProcesseur() {
        return marqueProcesseur;
    }

    public void setMarqueProcesseur(String marqueProcesseur) {
        this.marqueProcesseur = marqueProcesseur;
    }

    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }
}
