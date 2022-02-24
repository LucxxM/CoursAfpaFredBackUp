package com.mycompany.boatAndCo;


import com.mycompany.boatAndCo.entity.Bateau;
import com.mycompany.boatAndCo.entity.Moteur;
import com.mycompany.boatAndCo.entity.Person;
import com.mycompany.boatAndCo.entity.Port;

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

        System.out.println("M.Durand a " +clientdurand.renvoyerAge());

        System.out.println();

        // Avec 1 parametre
        System.out.println("Avec 1 parametre");

        System.out.println("M.Durand a " + clientdurand.age + " ans.");
        int nouvelAge = clientdurand.vieillir(45);
        System.out.println("Après l'appel de la méthode vieillir, l'age est = " + nouvelAge);
        System.out.println("La propriété age a toujours la valeur :  " + clientdurand.age );

        clientdurand.age = clientdurand.vieillir(45);
        System.out.println("age vaut maintenant : " +clientdurand.age);

        System.out.println();

        // Avec plusieurs parametres
        System.out.println("Avec plusieurs parametres");

        int anneeAnciennete = clientdurand.calculerAnciennete(2007, true);

        System.out.println("Monsieur " + clientdurand.firstname + " " + clientdurand.lastname + " a " + anneeAnciennete + " ans d'anciennete" );

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

        System.out.println("Le moteur du bateau de Michel est du type : " +bateauDeMichel.moteur.carburation);

        System.out.println();

        // Exercice Surcharge
        System.out.println("Exercice Surcharge");


        System.out.println();

        // Exercice Ocean : ArrayList

        System.out.println("Exercice Ocean : ArrayList");
        Port portDeCalais = new Port();

        int nbEmplacements = 0;
        Bateau[] emplacements = new Bateau[nbEmplacements];

        portDeCalais.emplacements = emplacements;

        bateauDeMichel.rentrerAuPort(portDeCalais);
    }
}

