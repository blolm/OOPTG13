import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class kNN {

    public static void main(String[] args) {
        Dataobjekt testDaten[] = initTestdaten();
        int k = 5;
        int x = 2;
        int y = 5;
        Dataobjekt neu = new Dataobjekt(x, y);
        int klasseNeu = kNN(neu, testDaten, k);
        System.out.println(klasseNeu);
    }


    public static int kNN(Dataobjekt neu, Dataobjekt[] testDaten, int k) {
        int klasse0 = 0;
        int klasse1 = 0;

        Map<Double, Dataobjekt> abstaende = new TreeMap<>();
        for (Dataobjekt o : testDaten) {
            double dist = getDistance(neu, o);
            abstaende.put(dist, o);
        }

        List<Dataobjekt> knns = new ArrayList<>(abstaende.values());

        for (int i = 0; i < k; i++) {
            int klasseDesNachbarn = knns.get(i).klasse;
            if (klasseDesNachbarn == 0) {
                klasse0++;
            } else {
                klasse1++;
            }
        }
        if (klasse0 > klasse1) {
            neu.klasse = 0;
        } else {
            neu.klasse = 1;
        }
        return neu.klasse;
    }


    private static int getDistance(Dataobjekt neu, Dataobjekt o) {
        // Berechnung der euklidischen Distanz (ohne Quadratwurzel, da wir nur den Vergleich der Distanzen wollen)
        int dx = neu.x - o.x;
        int dy = neu.y - o.y;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }


    private static Dataobjekt[] initTestdaten() {
        return new Dataobjekt[] {
            new Dataobjekt(1, 5, 0),  // Punkt (1, 2) der Klasse 0
            new Dataobjekt(2, 6, 0),  // Punkt (2, 3) der Klasse 0
            new Dataobjekt(1, 8, 0),  // Punkt (3, 3) der Klasse 1
            new Dataobjekt(2, 5, 0),  // Punkt (5, 4) der Klasse 1
            new Dataobjekt(6, 2, 1),  // Punkt (6, 5) der Klasse 0
            new Dataobjekt(7, 1, 1),  // Punkt (7, 8) der Klasse 1
            new Dataobjekt(8, 2, 1),  // Punkt (8, 7) der Klasse 1
            new Dataobjekt(8, 1, 1),  // Punkt (1, 4) der Klasse 0
            new Dataobjekt(4, 1, 1),  // Punkt (4, 6) der Klasse 1
            new Dataobjekt(6, 3, 1)   // Punkt (6, 2) der Klasse 0
        };
    }
}
