package main.travail.ProgrammationObjet.entity;


import main.travail.ProgrammationObjet.entity.Voiture_travail;

public class Main_travail {
    public static void main(String[] args) {
        // instanciation d'un objet
        Voiture_travail voitureDeMichel = new Voiture_travail();
        Voiture_travail voitureDeThomas = new Voiture_travail();

        // Valorisation des proprietes
        voitureDeMichel.immatriculation = "123AZE56";
        voitureDeMichel.marque = "Renaut";
        System.out.println("Le nombre de porte de la voiture est " + voitureDeMichel.nbPortes);

        // Modification de la valeur d'une propriété
        voitureDeMichel.nbPortes = 5;
        System.out.println("Le nombre de porte de la voiture est maintenant" + voitureDeMichel.nbPortes);
        System.out.println("La voiture de Michel est de marque " + voitureDeMichel.marque + ", son immatriculation est " + voitureDeMichel.immatriculation + " et elle a " + voitureDeMichel.nbPortes + " portes");

        // Appel d'une méthode sans retour (void) et sans paramétres
        voitureDeMichel.klaxonner();

        // Avec une valeur de retour (utilisation d'une variable)
        int vitesseActuelle = voitureDeMichel.donnerVitesse();
        System.out.println(vitesseActuelle);

        // Avec une valeur de retour et un parametre
        System.out.println("Vitesse de départ : 45");
        System.out.println("La nouvelle vitesse est : "+voitureDeMichel.donnerNouvelleVitesse(45));

        // Avec plusieurs parametres
        System.out.println("La vitesse actuelle = 100");
        int nouvelleVitesse = voitureDeMichel.changerVitesse(100, true, 50);
        System.out.println("La nouvelle vitesse est : " + nouvelleVitesse);

        String chaine1 = "Il fait froid dehors";
        String chaine2 = "Il fait froid dehors";
        boolean sontEgaux = chaine1.equals(chaine2);
        System.out.println(sontEgaux);

        // Surcharge de méthode
        nouvelleVitesse = voitureDeMichel.changerVitesse(100, "ralentir", 50);
        System.out.println("La nouvelle vitesse est : " + nouvelleVitesse);

        voitureDeMichel.accelerer();

        int vitesseEnPlus = 40;
        System.out.println("J'accelere de " + vitesseEnPlus + " km/h");
        System.out.println("Je roule maintenant à " +voitureDeMichel.accelerer(40) + " km/h");



    }
}
