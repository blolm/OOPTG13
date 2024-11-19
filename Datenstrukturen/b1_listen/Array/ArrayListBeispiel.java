package b1_listen.Array;

import java.util.ArrayList;

public class ArrayListBeispiel {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //ArrayListe erstellen
        ArrayList<Integer> primzahl = new ArrayList<>();

        //Objekte hinzufügen
        primzahl.add(2);
        primzahl.add(3);
        primzahl.add(5);
        primzahl.add(11);

        //Liste ausgeben 
        System.out.println(primzahl);

        //Objekt entfernen 
        primzahl.remove(Integer.valueOf(2)); //Entfernt eintrag mit dem Wert 2
        primzahl.remove(2); //Entfernt eintrag mit dem Index 2

         //Liste ausgeben 
        System.out.println(primzahl);

        //Über Liste iterieren
        for (Integer i : primzahl) {
            System.out.println(i);
        }

        //prüfen ob Wert in Liste sind 
        if(primzahl.contains(5)){
            System.out.println("5 ist in der Liste");
        } 

        //Wert aus Liste holen
        Integer i1 = primzahl.get(Integer.valueOf(1));   
        System.out.println(i1+" an Index 1");
        
        System.out.println(primzahl);
    }
    
}
