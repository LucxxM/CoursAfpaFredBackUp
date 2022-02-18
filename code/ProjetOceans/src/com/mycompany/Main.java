package com.mycompany;

public class Main {
    public static void main(String[] args) {
        System.out.println("### Les variables");
        int nbEspecesEn2018 = 182854;
        int ndEspecesQuidisparait = 26000;
        int nbEspecesEn2019 = nbEspecesEn2018 - ndEspecesQuidisparait;
        int valeurActuelle;

        String texteAAfficher;
        texteAAfficher = "Chaque année, 26000 espèces disparaissent de la surface de la planète.";
        System.out.println(texteAAfficher);

        texteAAfficher = "En 2018, elles étaient au nombre de ";
        System.out.println(texteAAfficher + nbEspecesEn2018 + ".");

        valeurActuelle = nbEspecesEn2018 - ndEspecesQuidisparait;
        texteAAfficher = "En 2019 elles n’étaient plus que ";
        System.out.println(texteAAfficher + valeurActuelle + ".");

        texteAAfficher = "En une journée, elles sont peut être passée de " + valeurActuelle + " à " + --valeurActuelle;
        System.out.println(texteAAfficher);

        System.out.println();

        System.out.println("### If");
        ;
        if (valeurActuelle <= 156854) {
            System.out.println("ça craint");
        } else {
            System.out.println("On est sauvés");
        }
        System.out.println();

        System.out.println("### Operateur ternaire");
        System.out.println(valeurActuelle <= 156854 ? "ça craint" : "On est sauvés");

        System.out.println("switch case");
        int nbEspeces = 15;
        switch (nbEspeces) {
            case 156854:
                System.out.println("ça craint");
                break;
            case 157000:
                System.out.println("c'est un peu mieux");
                break;

            default:
                System.out.println("valeur non traitée");

        }
        System.out.println();

        System.out.println("### For");
        for (int nb = 0; nb < 7; nb++) {
            System.out.println("Les océans sont magnifique");
        }

        System.out.println();

        System.out.println("### While");
        int compteur = 0;
        while (compteur < 7) {
            System.out.println("Les océans sont magnifique");
            compteur++;
        }
        System.out.println();

        System.out.println("### do - while");
        do {
            System.out.println("Les océans sont magnifique");
            compteur--;
        }
        while (compteur != 0);
    }
}

