import java.util.Set;
import java.util.HashSet;

public class Sets2 {
    public static void main(String[] args) {
        Set<Schueler> schueler = new HashSet<>();

        //Objekte erstellen
        Schueler s1 = new Schueler("maier", "max");
        Schueler s2 = new Schueler("meier", "peter");
        
        //Objekte dem Set hinzufügen
        schueler.add(s1);
        schueler.add(s2);

        //Entfernen
        schueler.remove(s2);

        //Ausgabe über toString()
        System.out.println(schueler.toString());

        //Ausgabe über iterieren
        for (Schueler s : schueler) {
            System.out.println(s);
        }
    }
}
