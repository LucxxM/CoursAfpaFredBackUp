package com.mycompany.boatAndCo.entity;

public class Bateau {
    public String marque;
    public String couleur;
    public Moteur moteur;

    public void naviguer(){
        System.out.println("Je navigue");
    }

    public void rentrerAuPort(Port port){
        boolean restePlaceDisponible = port.restePlaceDisponible(port.emplacements);

        if (restePlaceDisponible == false) {
            System.out.println("Il n'y a plus de places disponibles, je ne peux par rentrer au port");
        }
        else {
            System.out.println("Je rentre au port");
        }

    }



}