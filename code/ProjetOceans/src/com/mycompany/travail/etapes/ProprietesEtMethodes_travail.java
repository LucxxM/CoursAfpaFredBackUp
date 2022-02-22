package com.mycompany.travail.etapes;

import com.mycompany.travail.etapes.entity.Person_travail;

public class ProprietesEtMethodes_travail {
    public static void main(String[] args) {
        Person_travail clientdurand = new Person_travail();
        Person_travail clientDupont = new Person_travail();

        clientdurand.firstname = "David";
        clientdurand.lastname = "Durand";
        clientdurand.age = 45;
        clientdurand.dateOfBirth = "12/02/1974";

        // pas de valeur de retour, pas de parametre
        clientdurand.sePresenter();

        // avec une valeur de retour
        System.out.println("M.Durand a " +clientdurand.renvoyerAge());

        // Avec 1 parametre
        System.out.println("M.Durand a " + clientdurand.age + " ans.");
        int nouvelAge = clientdurand.vieillir(45);
        System.out.println("Après l'appel de la méthode vieillir, l'age est = " + nouvelAge);
        System.out.println("La propriété age a toujours la valeur :  " + clientdurand.age );

        clientdurand.age = clientdurand.vieillir(45);
        System.out.println("age vaut maintenant : " +clientdurand.age);

        // Avec plusieurs parametres
        int anneeAnciennete = clientdurand.calculerAnciennete(2007, true);

        System.out.println("Monsieur " + clientdurand.firstname + " " + clientdurand.lastname + " a " + anneeAnciennete + " ans d'anciennete" );

    }
}

