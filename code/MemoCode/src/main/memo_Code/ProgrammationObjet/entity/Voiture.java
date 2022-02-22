package main.memo_Code.ProgrammationObjet.entity;

public class Voiture {
    // Propriétés
    String marque;
    String immatriculation;
    int nbPortes = 4;
    int vitesseEngagee = 0;
    int vitesseCourante = 0;
    int vitesse = 0;

    Moteur moteur;


    // Méthodes (comportements)

    // Mehode sans retour (void) et sans paramétres
    void klaxonner(){
        System.out.println("Tut tut");
    }

    // Methode avec retour
    int donnerVitesse(){
        return 100;
    }

    // Methode avec 1 parametre
    int donnerNouvelleVitesse(int vitesseActuelle){
        return vitesseActuelle+10;
    }

    // Methode avec plusieurs parametres
    int changerVitesse(int vitesseActuelle, boolean accelerer, int ecartVitesse){
        if(accelerer){
            System.out.println("J'accelere");
            vitesseActuelle +=ecartVitesse;
        }
        else {
            System.out.println("Je ralentis");
            vitesseActuelle -=ecartVitesse;
        }

        return vitesseActuelle;
    }

    // Surcharge de méthode
    int changerVitesse(int vitesseActuelle, String accelererOuRalentir, int ecartVitesse){
        if(accelererOuRalentir == "accelerer"){
            System.out.println("J'accelere");
            vitesseActuelle +=ecartVitesse;
        }
        else {
            System.out.println("Je ralentis");
            vitesseActuelle -=ecartVitesse;
        }

        return vitesseActuelle;
    }

    int passerUneVitesse(int vitesseaEngageeCourante, boolean passerVitesseSuperieure){
        if (passerVitesseSuperieure = true){
            vitesseaEngageeCourante = vitesseaEngageeCourante + 1;
        }

        else {
            vitesseaEngageeCourante = vitesseaEngageeCourante -1;
        }

        return vitesseaEngageeCourante;
    }

    void accelerer(){
        System.out.println("J'accelere");
    }

    /*int accelerer(int vitesseEnPlus){
        System.out.println("J'accelere de " + vitesseEnPlus + " km/h");
        return vitesseCourante + vitesseEnPlus;
    }*/

    // this
    int accelerer(int vitesse){
        System.out.println("J'accelere de " + vitesse + " km/h");
        return this.vitesse + vitesse;
    }



}
