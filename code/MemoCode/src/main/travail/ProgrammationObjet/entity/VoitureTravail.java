package main.travail.ProgrammationObjet.entity;

public class VoitureTravail {
    // Propriétés
    public String marque;
    public String immatriculation;
    public int nbPortes = 4;
    public int vitesseEngagee = 0;
    public int vitesseCourante = 0;
    public int vitesse = 0;

    public MoteurTravail moteur;


    // Méthodes (comportements)

    // Mehode sans retour (void) et sans paramétres
    public void klaxonner(){
        System.out.println("Tut tut");
    }

    // Methode avec retour
    public int donnerVitesse(){
        return 100;
    }

    // Methode avec 1 parametre
    public int donnerNouvelleVitesse(int vitesseActuelle){
        return vitesseActuelle+10;
    }

    // Methode avec plusieurs parametres
    public int changerVitesse(int vitesseActuelle, boolean accelerer, int ecartVitesse){
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
    public int changerVitesse(int vitesseActuelle, String accelererOuRalentir, int ecartVitesse){
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

    public int passerUneVitesse(int vitesseaEngageeCourante, boolean passerVitesseSuperieure){
        if (passerVitesseSuperieure = true){
            vitesseaEngageeCourante = vitesseaEngageeCourante + 1;
        }

        else {
            vitesseaEngageeCourante = vitesseaEngageeCourante -1;
        }

        return vitesseaEngageeCourante;
    }

    public void accelerer(){
        System.out.println("J'accelere");
    }

    /*int accelerer(int vitesseEnPlus){
        System.out.println("J'accelere de " + vitesseEnPlus + " km/h");
        return vitesseCourante + vitesseEnPlus;
    }*/

    // this
    public int accelerer(int vitesse){
        System.out.println("J'accelere de " + vitesse + " km/h");
        return this.vitesse + vitesse;
    }



}
