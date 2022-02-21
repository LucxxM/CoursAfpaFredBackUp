package main.memo_Code.ProgrammationObjet;

public class Voiture {
    // Propriétés
    String marque;
    String immatriculation;
    int nbPortes = 4;

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


}
