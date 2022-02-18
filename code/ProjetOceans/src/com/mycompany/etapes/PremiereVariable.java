package com.mycompany.etapes;

public class PremiereVariable {
    public class Main {
        public static void main(String[] args) {

            int nbEspecesEn2018 = 182854;
            int ndEspecesQuidisparait = 26000;
            int nbEspecesEn2019 = nbEspecesEn2018 - ndEspecesQuidisparait;

            System.out.println("Chaque année, 26000 espèces disparaissent de la surface de la planète.");
            System.out.println("En 2018, elles étaient au nombre de " + nbEspecesEn2018 + ".");
            System.out.println("En 2019 elles n’étaient plus que " + (nbEspecesEn2018 - ndEspecesQuidisparait) + ".");

            int maVariable = 4;
            int maVariable2 = 7;

        }


    }
}