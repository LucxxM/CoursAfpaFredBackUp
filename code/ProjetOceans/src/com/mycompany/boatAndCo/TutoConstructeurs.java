package com.mycompany.boatAndCo;
import com.mycompany.boatAndCo.entity.Adress;
import com.mycompany.boatAndCo.entity.Moteur;
import com.mycompany.boatAndCo.entity.Passager;
import com.mycompany.boatAndCo.entity.Port;

public class TutoConstructeurs {
    public static void main(String[] args) {
        Passager passagerDupont = new Passager();
        Passager passagerDurand = new Passager();

        Passager passagerAvecNom = new Passager("Dupuis");
        System.out.println("Le passager créé avec le constructeur qui prend en paramètre" +
                " le nom du passager est " + passagerAvecNom.getNom());

        Passager passagerAvecNomEtPrenom = new Passager("Dupuis", "René");
        System.out.println("Le passager créé avec le constructeur qui prend en paramètre" +
                " le nom et le prénom du passager est " + passagerAvecNomEtPrenom.getNom() + " " + passagerAvecNomEtPrenom.getPrenom());


        Adress adressOfDupont = new Adress(7, "Rue Emile Zola", 59000, "Lille");
        passagerDupont.setAdress(adressOfDupont);
        passagerDupont.setNom("Dupont");

        System.out.println("L'adresse de M." + passagerDupont.getNom() + " est "
        + passagerDupont.getAdress().getNumber() + " " + passagerDupont.getAdress().getNumber() + " "+ passagerDupont.getAdress().getCp() + " " +
                 passagerDupont.getAdress().getCity());

        Passager pasagerToto = new Passager("Toto", "René", 8, "rue Verte", 59000, "Lille");
        System.out.println("L'adresse de M." + pasagerToto.getNom() + " est "
                + pasagerToto.getAdress().getNumber() + " " + pasagerToto.getAdress().getStreet() + " "+ pasagerToto.getAdress().getCp() + " " +
                pasagerToto.getAdress().getCity());

        System.out.println(Passager.nbPassagersCréés + " passagés ont été créés.");

        System.out.println();

        // Utilisation des Getters & Setters
        System.out.println("Utilisation des Getters & Setters");
        Moteur moteurTest = new Moteur();

        moteurTest.setNbCylindres(4);
        // remplace
        // moteurTest.NbCylindres = 4;

        moteurTest.setAnneeFabricationMoteur("1987");
        // remplace
        //moteurTest.anneeFabricationMoteur = "1987";

        System.out.println(moteurTest.getAnneeFabricationMoteur());
        // remplace
        // System.out.println(moteurTest.anneeFabricationMoteur);




    }
}
