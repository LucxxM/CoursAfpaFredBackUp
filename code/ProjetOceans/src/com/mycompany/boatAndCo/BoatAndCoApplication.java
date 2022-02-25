package com.mycompany.boatAndCo;

import com.mycompany.boatAndCo.entity.*;

public class BoatAndCoApplication {
    public static void main(String[] args) {
        Person clientdurand = new Person();
        Person clientDupont = new Person();

        clientdurand.firstname = "David";
        clientdurand.lastname = "Durand";
        clientdurand.age = 45;
        clientdurand.dateOfBirth = "12/02/1974";

        // pas de valeur de retour, pas de parametre
        System.out.println("pas de valeur de retour, pas de parametre");

        clientdurand.sePresenter();

        System.out.println();

        // Avec une valeur de retour
        System.out.println("Avec une valeur de retour");

        System.out.println("M.Durand a " + clientdurand.renvoyerAge());

        System.out.println();

        // Avec 1 parametre
        System.out.println("Avec 1 parametre");

        System.out.println("M.Durand a " + clientdurand.age + " ans.");
        int nouvelAge = clientdurand.vieillir(45);
        System.out.println("Après l'appel de la méthode vieillir, l'age est = " + nouvelAge);
        System.out.println("La propriété age a toujours la valeur :  " + clientdurand.age);

        clientdurand.age = clientdurand.vieillir(45);
        System.out.println("age vaut maintenant : " + clientdurand.age);

        System.out.println();

        // Avec plusieurs parametres
        System.out.println("Avec plusieurs parametres");

        int anneeAnciennete = clientdurand.calculerAnciennete(2007, true);

        System.out.println("Monsieur " + clientdurand.firstname + " " + clientdurand.lastname + " a " + anneeAnciennete + " ans d'anciennete");

        System.out.println();

        // Surcharge
        System.out.println("Surcharge de méthodes");

        clientdurand.sePresenter();
        clientdurand.sePresenter(false);
        clientdurand.sePresenter("cotisPasAJour");

        System.out.println();

        // Ajout d'une propriété de type objet
        System.out.println("Ajout d'une propriété de type objet");

        Bateau bateauDeMichel = new Bateau();
        bateauDeMichel.setMarque("Honda");
        bateauDeMichel.setCouleur("Blanc");

        Moteur moteur = new Moteur();
        moteur.setAnneeFabricationMoteur("1998");
        moteur.carburation = "Diesel";
        moteur.setNbCylindres(4);

        bateauDeMichel.setMoteur(moteur);
        System.out.println(bateauDeMichel.getCouleur());

        System.out.println("Le moteur du bateau de Michel est du type : " + Bateau.getCarburation());

        System.out.println();

        // Exercice Surcharge
        System.out.println("Exercice Surcharge");


        System.out.println();

        // Exercice Ocean : ArrayList

        System.out.println("Exercice Ocean : ArrayList");
        Port portDeCalais = new Port();
        portDeCalais.setNom("Calais");
        portDeCalais.setNbEmplacements(4);

        int nbEmplacements = 5;

        portDeCalais.setEmplacements(new Bateau[nbEmplacements]);

        bateauDeMichel.rentrerAuPort(portDeCalais);

        Port monPort = new Port();

        System.out.println();
        // Proprietes statiques
        System.out.println("Proprietes statiques");

        System.out.println("Grace à la propriété statique, tous les bateaux instanciés ont un moteur " + Moteur.carburation);

        System.out.println();
        // Exercice Ocean
        System.out.println("exercice Ocean");

        // int distanceParcourue = Bateau.calculerDistanceParcourue(3,45);

        System.out.println("Nous avons parcouru " + Bateau.calculerDistanceParcourue(3, 45) +
                " kms grace au moteur " + Moteur.carburation + " du bateau");

        System.out.println();

        // Les constructeurs
        System.out.println("Les constructeurs");
        Bateau newBateau = new Bateau();

        System.out.println(Bateau.getNbBateauxCrees() + " bateaux ont été instanciés");

        Ville villeDeCalais = new Ville("Calais", portDeCalais);
        System.out.println("La ville de " + villeDeCalais.getNom() + " a un port de " + villeDeCalais.getPort().getNom() + " emplacements.");
    }

}