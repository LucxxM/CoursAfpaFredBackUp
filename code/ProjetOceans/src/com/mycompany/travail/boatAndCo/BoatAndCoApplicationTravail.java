package com.mycompany.travail.boatAndCo;


import com.mycompany.travail.boatAndCo.entity.*;

import java.util.Scanner;

public class BoatAndCoApplicationTravail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        bateauDeMichel.marque = "Honda";
        bateauDeMichel.couleur = "Blanc";

        Moteur moteur = new Moteur();
        moteur.anneeFabricationMoteur = "1998";
        moteur.carburation = "Diesel";
        moteur.NbCylindres = 4;

        bateauDeMichel.moteur = moteur;

        System.out.println("Le moteur du bateau de Michel est du type : " + bateauDeMichel.moteur.carburation);

        // Exercice Surcharge
        // Exercice 1
        bateauDeMichel.moteur = moteur;

        String messageRetour = bateauDeMichel.moteur.demarrer(30);
        System.out.println(messageRetour);

        // Exercice 2
        Adress adress = new Adress();
        adress.number = 45;
        adress.street = "rue Verte";
        adress.cp = 59000;
        adress.city = "Lille";

        clientdurand.adress = adress;
        System.out.println("M.Durand habite " + clientdurand.adress.number + " " + clientdurand.adress.street +
                " " + clientdurand.adress.street + " " + clientdurand.adress.cp + " " + clientdurand.adress.city);

        System.out.println();

        //Exercice ArrayList

        System.out.println("Exercice ArrayList");
        // Création du port de Calais
        Port portDeCalais = new Port();
        int nbEmplacements = 10;
        Bateau[] emplacements = new Bateau[nbEmplacements];
        portDeCalais.emplacements = emplacements;

        bateauDeMichel.rentrerAuPort(portDeCalais);


        // Des méthodes qui référencent des objets
        // a faire en direct

        // Atributs statiques
        System.out.println("Les moteurs des bateaux sont en général de type " + Moteur.carburation);
        System.out.println("Le bateau de Michel est de type " + bateauDeMichel.moteur.carburation);

        // Méthodes statiques
        System.out.println("Nous avons parcouru " + Bateau.calculerDistanceParcourue(3, 45) +
                " grace au moteur " + Moteur.carburation + " du bateau");

        // Constructeurs (1)
        Bateau bateauDeMarcel = new Bateau();
        System.out.println(Bateau.nbBateauxCree + " bateaux ont été instanciés.");

        // Constructeur (2)
        Port portDeMarseille = new Port("Marseille", 20);
        Ville villedeCalais = new Ville(portDeCalais);
        // System.out.println("La ville de Calais a un port de " + villedeCalais.);

        Ville villeDeDunkerque = new Ville("Dunkerque", 45);


        Cargo monCargo = new Cargo();

    }
}

