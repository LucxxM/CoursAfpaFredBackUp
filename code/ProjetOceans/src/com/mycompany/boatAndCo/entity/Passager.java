package com.mycompany.boatAndCo.entity;

public class Passager {
    public static int nbPassagersCréés = 0;
    private String nom;
    private String prenom;
    private Adress adress;

    public Passager() {
        System.out.println("Un passager est instancié via le constructeur sans paramètres");
        nbPassagersCréés++;
    }

    public Passager(String nom){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom du passager");
        this.nom = nom;
        nbPassagersCréés++;
    }

    public Passager (String nom, String prenom){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom et le prénom du passager");
        this.nom = nom;
        this.prenom = prenom;
        nbPassagersCréés++;
    }

    public Passager (String nom, String prenom, Adress adress){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom, le prénom  et l'adresse du passager du passager");
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        nbPassagersCréés++;
    }

    public Passager (String nom, String prenom, int number, String street, int cp, String  city){
        System.out.println("Un passager est instancié via le constructeur qui prend " +
                "en paramètre le nom, le prénom  et l'adresse détaillée du passager");
        this.nom = nom;
        this.prenom = prenom;

        Adress adresse = new Adress(number, street, cp, city);

        this.adress = adresse;

        nbPassagersCréés++;
    }

    public static int getNbPassagersCréés() {
        return nbPassagersCréés;
    }

    public static void setNbPassagersCréés(int nbPassagersCréés) {
        Passager.nbPassagersCréés = nbPassagersCréés;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
