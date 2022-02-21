package main.travail.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_List {
    public static void main(String[] args){

        // création de l'ArrayList
        ArrayList<String> outils = new ArrayList<>();

        // Ajout d'éléments dans l'ArrayList
        outils.add("hadoop");
        outils.add("Scala");
        outils.add("Spark");

        System.out.println(outils);  // affiiche [hadoop, Scala, Spark]
        System.out.println(outils.get(2));  // affiche Spark
        outils.set(1, "Java");

        System.out.println(outils);// affiiche [hadoop, Java, Spark]
        outils.remove(1);

        System.out.println( outils);  // affiiche [hadoop, Spark]

        System.out.println();

        //itération sur la liste outil
        System.out.println("itération sur la liste outil");
        //affiche hadoop , Scala
        for(String outil: outils){
            System.out.print(outil + " , ");
        }

        System.out.println();

        // tri
        System.out.println("ArrayList avant trie :"+  outils);
        Collections.sort(outils);
        System.out.println("ArrayList après trie :"+  outils);

        System.out.println();

        // tableau 2 dimensions
        System.out.println("tableau 2 dimensions");

        ArrayList<String> innerArraylist;

        innerArraylist = new ArrayList<String>();

        List<ArrayList<String>> outerArrayList = new ArrayList<>();

        innerArraylist.add("String One");
        innerArraylist.add("String Two");
        innerArraylist.add("String Three");

        outerArrayList.add(innerArraylist);
        outerArrayList.add(innerArraylist);

        System.out.println("Travail");

        for (ArrayList<String> boucle1 : outerArrayList)
            System.out.println( boucle1);

        for (int i = 0; i <outerArrayList.size(); ++i){
            System.out.println(innerArraylist);

        }

        //System.out.println(outerArrayList);
    }
}
