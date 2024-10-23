package b1_listen.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Schueler_Parkplatz {
    public static void main(String[] args) {
        
        Schueler s1 = new Schueler("Auer", "Niklas", 18);
        Schueler s2 = new Schueler("Niklas", "Tjorben", 18);
        Schueler s3 = new Schueler("Giner", "Dirk", 18);

        SchuelerParkplatz p1 = new SchuelerParkplatz("a1");
        SchuelerParkplatz p2 = new SchuelerParkplatz("a2");
        SchuelerParkplatz p3 = new SchuelerParkplatz("a3");

        Map<Schueler, SchuelerParkplatz> Parkplatzzuweisung = new HashMap<Schueler, SchuelerParkplatz>();
        Parkplatzzuweisung.put(s1,p2);
        Parkplatzzuweisung.put(s2,p3);
        Parkplatzzuweisung.put(s3,p1);

        Set<Schueler> schuelerSet = Parkplatzzuweisung.keySet();
        
        for (Schueler schueler : schuelerSet) {
        
            System.out.println(schueler.getName());
        }

        System.out.println(schuelerSet);
    }
}
