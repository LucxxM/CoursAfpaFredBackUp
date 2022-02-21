package main.memo_Code.ProgrammationObjet;


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
    }
}
