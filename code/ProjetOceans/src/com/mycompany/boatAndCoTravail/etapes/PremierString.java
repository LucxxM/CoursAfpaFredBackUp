package com.mycompany.travail.etapes;

public class PremierString {
    public static void main(String[] args) {

        int nbEspecesEn2018 = 182854;
        int ndEspecesQuidisparait = 26000;
        int nbEspecesEn2019 = nbEspecesEn2018 - ndEspecesQuidisparait ;

        String texteAAfficher;
        texteAAfficher ="Chaque année, 26000 espèces disparaissent de la surface de la planète.";
        System.out.println(texteAAfficher);

        texteAAfficher = "En 2018, elles étaient au nombre de ";
        System.out.println(texteAAfficher + nbEspecesEn2018 + ".");

        texteAAfficher = "En 2019 elles n’étaient plus que ";
        System.out.println(texteAAfficher + (nbEspecesEn2018 -ndEspecesQuidisparait ) + ".");

    }
}
