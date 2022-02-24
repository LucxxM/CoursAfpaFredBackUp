package com.mycompany.boatAndCo;
import com.mycompany.boatAndCo.entity.Adress;
import com.mycompany.boatAndCo.entity.Passager;
import com.mycompany.boatAndCo.entity.Port;

public class TutoConstructeurs {
    public static void main(String[] args) {
        Passager passagerDupont = new Passager();
        Passager passagerDurand = new Passager();

        Passager passagerAvecNom = new Passager("Dupuis");
        System.out.println("Le passager créé avec le constructeur qui prend en paramètre" +
                " le nom du passager est " + passagerAvecNom.nom);

        Passager passagerAvecNomEtPrenom = new Passager("Dupuis", "René");
        System.out.println("Le passager créé avec le constructeur qui prend en paramètre" +
                " le nom et le prénom du passager est " + passagerAvecNomEtPrenom.nom + " " + passagerAvecNomEtPrenom.prenom );


        Adress adressOfDupont = new Adress(7, "Rue Emile Zola", 59000, "Lille");
        passagerDupont.adress = adressOfDupont;
        passagerDupont.nom = "Dupont";

        System.out.println("L'adresse de M." + passagerDupont.nom + " est "
        + passagerDupont.adress.number + " " + passagerDupont.adress.street + " "+ passagerDupont.adress.cp + " " +
                 passagerDupont.adress.city);

        Passager pasagerToto = new Passager("Toto", "René", 8, "rue Verte", 59000, "Lille");
        System.out.println("L'adresse de M." + pasagerToto.nom + " est "
                + pasagerToto.adress.number + " " + pasagerToto.adress.street + " "+ pasagerToto.adress.cp + " " +
                pasagerToto.adress.city);


        System.out.println(Passager.nbPassagersCréés + " passagés ont été créés.");




    }
}
