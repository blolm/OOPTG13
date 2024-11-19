package b1_listen.Maps.Uebung;

import java.util.ArrayList;
import java.util.HashMap;

public class Hauptstädte {
        public static void main(String[] args) {
        
        //map erstellen
        HashMap<String, String> germany = new HashMap<>();

        //objekte hinzufügen
        germany.put("Baden-Württemberg", "Stuttgart");
        germany.put("Bayern", "München");
        germany.put("Berlin", "Berlin");
        germany.put("Brandenburg", "Potsdam");
        germany.put("Bremen", "Bremen");
        germany.put("Hamburg", "Hamburg");
        germany.put("Hessen", "Wiesbaden");
        germany.put("Mecklenburg-Vorpommern", "Schwerin");
        germany.put("Niedersachsen", "Hannover");
        germany.put("Nordrhein-Westfalen", "Düsseldorf");
        germany.put("Rheinland-Pfalz", "Mainz");
        germany.put("Saarland", "Saarbrücken");
        germany.put("Sachsen", "Dresden");
        germany.put("Sachsen-Anhalt", "Magdeburg");
        germany.put("Schleswig-Holstein", "Kiel");
        germany.put("Thüringen", "Erfurt");


        //map ausgeben
        System.out.println(germany);

        ArrayList<String> bundesländer = new ArrayList<>(germany.keySet());
        System.out.println("Bundesländer: " + bundesländer);

        ArrayList<String> haupstädte = new ArrayList<>(germany.values());
        System.out.println("Hauptstädte: " + haupstädte);

    }
}
