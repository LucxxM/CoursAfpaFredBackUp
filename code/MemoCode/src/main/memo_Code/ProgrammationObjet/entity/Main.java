package main.memo_Code.ProgrammationObjet.entity;


import main.memo_Code.ProgrammationObjet.entity.Voiture;

public class Main {
    public static void main(String[] args) {
        // instanciation d'un objet
        Voiture voitureDeMichel = new Voiture();
        Voiture voitureDeThomas = new Voiture();

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

        int vitesseEngagee = voitureDeMichel.passerUneVitesse(3, true);
        System.out.println("Je roule en vitesse " + vitesseEngagee);

        // Comparaison d'objets avec equals
        boolean sontEgaux = voitureDeMichel == voitureDeThomas;

        String chaine1 = "Il Fait froid dehors";
        String chaine2 = "Il fait froid dehors";

        sontEgaux = chaine1.equalsIgnoreCase(chaine2);
        System.out.println(sontEgaux);

        voitureDeMichel.changerVitesse(45, true, 20);
        System.out.println("Vitesse actuelle : " + vitesseActuelle);

        voitureDeMichel.changerVitesse(50, "accelerer", 30);
        System.out.println("Vitesse actuelle : " + vitesseActuelle);

        voitureDeMichel.accelerer();
        voitureDeMichel.accelerer(40);

        System.out.println();
        // Mot cle this
        System.out.println("Utilisation de this");

        nouvelleVitesse = voitureDeMichel.accelerer(40);
        System.out.println(nouvelleVitesse);


        Voiture voitureDeMartin = new Voiture();
        voitureDeMartin.marque = "Citroen";
        voitureDeMartin.immatriculation = "122ZZ62";
        voitureDeMartin.nbPortes = 4;


        String marqueDeLaVoitureDeMartin = voitureDeMartin.marque;
        int nbDePortesDeLaVoitureDeMartin = voitureDeMartin.nbPortes;

        Moteur nouveauMoteur = new Moteur();
        nouveauMoteur.motorisation = "Diesel";
        nouveauMoteur.nbCylindres = 4;

        nouveauMoteur.afficheMotorisation();

        voitureDeMartin.moteur = nouveauMoteur;

        System.out.println("La motorisation du moteur de la voiture de Martin est " +voitureDeMartin.moteur.motorisation);

        System.out.println();

        // ArrayList

        System.out.println("ArrayList");

        int[] tableauInt =  new int[5];

        String[] tableauString = new String[5];

        Voiture[] tableauDeVoitures = new Voiture[5];

        tableauInt[0] = 9;
        System.out.println("Le premier élément du tableau de int est " + tableauInt[0]);

        tableauString[1] = "toto";
        System.out.println("Le deuxielme élément du tableau de String est  " + tableauString[1]);

        Voiture newVoiture = new Voiture();
        tableauDeVoitures[2] = newVoiture;

        tableauDeVoitures[3] = new Voiture();

        int tailleTableauInt = tableauString.length;
        System.out.println("La taille du tableau de int est : " + tailleTableauInt);







    }
}
