<<<<<<< HEAD
package com.mycompany.travail.etapes.entity;
=======
package com.mycompany.boatAndCo.entity;
>>>>>>> develop

public class Person {
    // Propriétés
    public String lastname;
    public String firstname;
    public int age;
    public int valeurParDefaut = 45;
    public String dateOfBirth;

    // Méthodes

    // Sans valeur de retour et sans parametres
    public void sePresenter(){
        System.out.println("Je m'appelle " + firstname + " " + lastname + " et j'ai " + age + " ans.");
    }

    // Avec valeur de retour
    public int renvoyerAge(){
        return age;
    }

    // Avec un parametre
    public int vieillir(int nbAnneesAAjouter){
        return age + nbAnneesAAjouter;
    }


    // Avec plusieurs parametres
    public int calculerAnciennete(int anneeArrivee, boolean cotisAjour){
        if (cotisAjour){
            System.out.println("Mes cotisations sont à jour");
        }
        else {
            System.out.println("Mes cotisations ne sont pas à jour");
        }
        int anciennete = 2022 - anneeArrivee;
        return anciennete;

        // return 2022 - anneeArrivee;  // Syntaxe simplifiee
    }
}
