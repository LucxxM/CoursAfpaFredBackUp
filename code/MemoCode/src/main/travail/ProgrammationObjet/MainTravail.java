package main.travail.ProgrammationObjet;

import main.travail.ProgrammationObjet.entity.Moteur;
import main.travail.ProgrammationObjet.entity.Passager;
import main.travail.ProgrammationObjet.entity.Ville;
import main.travail.ProgrammationObjet.entity.Voiture;


public class MainTravail {
    public static void main(String[] args) {
        // instanciation d'un objet
        Voiture voitureDeMichel = new Voiture();
        Voiture voitureDeThomas = new Voiture();

        // Valorisation des proprietes
        voitureDeMichel.setImmatriculation("123AZE56");
        voitureDeMichel.setMarque("Renaut");
        System.out.println("Le nombre de porte de la voiture est " + voitureDeMichel.getNbPortes());

        // Modification de la valeur d'une propriété
        voitureDeMichel.setNbPortes(5);
        System.out.println("Le nombre de porte de la voiture est maintenant" + voitureDeMichel.getNbPortes());
        System.out.println("La voiture de Michel est de marque " + voitureDeMichel.getMarque() + ", son immatriculation est " + voitureDeMichel.getImmatriculation() + " et elle a " + voitureDeMichel.getNbPortes() + " portes");

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
        voitureDeMartin.setMarque("Citroen");
        voitureDeMartin.setImmatriculation("122ZZ62");
        voitureDeMartin.setNbPortes(4);


        String marqueDeLaVoitureDeMartin = voitureDeMartin.getMarque();
        int nbDePortesDeLaVoitureDeMartin = voitureDeMartin.getNbPortes();

        Moteur nouveauMoteur = new Moteur();
        nouveauMoteur.motorisation = "Diesel";
        nouveauMoteur.nbCylindres = 4;

        nouveauMoteur.afficheMotorisation();

        voitureDeMartin.setMoteur(nouveauMoteur);

        System.out.println("La motorisation du moteur de la voiture de Martin est " +voitureDeMartin.getMoteur().motorisation);

        System.out.println();


        // méthodes avec des parametres de type Objet

        Passager passagerDupont = new Passager();
        passagerDupont.firstname = "David";
        passagerDupont.lastname = "Dupont";

        Ville villeDeDepart = new Ville();
        villeDeDepart.nom = "Lille";

        Ville villeArrivee = voitureDeMichel.transporter(passagerDupont, villeDeDepart);
        System.out.println("Le passager est arrivé à " + villeArrivee.nom);



        // Propriétés statiques

        System.out.println("Le nombre de roues d'une voiture en général est : " +Voiture.nbRoues);

        System.out.println("La voiture de Michel a " +voitureDeMichel.nbRoues + " roues");
        System.out.println("La voiture de Martin a " +voitureDeMartin.nbRoues + " roues");

        Voiture.nbRoues = 6;
        System.out.println("La voiture de Michel a " +voitureDeMichel.nbRoues + " roues");
        System.out.println("La voiture de Martin a " +voitureDeMartin.nbRoues + " roues");

        // Méthodes statiques
        Voiture.klaxonner();
        voitureDeMartin.klaxonner();

        System.out.println("Ma nouvelle vitesse est : " + Voiture.donnerNouvelleVitesse(20));


        System.out.println();
        // Les constructeurs
        Voiture voitureDeMarcel = new Voiture();

        Voiture voitureJaune = new Voiture("jaune");
        System.out.println("La couleur de la voiture est " + voitureJaune.getCouleur());
        voitureJaune.setCouleur("verte");
        System.out.println("La nouvelle couleur est " + voitureJaune.getCouleur());

        // Constructeur avec un parametre objet
        Moteur moteurRenaut = new Moteur();
        moteurRenaut.nbCylindres = 8;
        Voiture voitureRenaud = new Voiture(moteurRenaut);
        System.out.println("La voiture a " + voitureRenaud.getMoteur().nbCylindres + " cylindres.");

        // Constructeur avec Moteur
        Voiture voitureAvecMoteur = new Voiture(4, "Essence");
        System.out.println("La voiture voitureAvecMoteur a un moteur " + voitureAvecMoteur.getMoteur().motorisation + " et a " + voitureAvecMoteur.getMoteur().nbCylindres + " cylindres");





}
}
