import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        //HashSet erstellen
        Set<String> mitarbeiterSet = new HashSet<>(); //Set<String> oder HashSet<String> ist egal wenn man ein HashSet erstellen möchte
        
        //Einträge in HashSet einfügen
        mitarbeiterSet.add("Alex");  
        mitarbeiterSet.add("Paul");  
        mitarbeiterSet.add("Anna");  
        mitarbeiterSet.add("Peter");  
        mitarbeiterSet.add("Reiner");  

        //HashSet ausgeben
        System.out.println(mitarbeiterSet);
    
        //Größe eines Sets bestimmen
        int SetGoesse = mitarbeiterSet.size();
        System.out.println(SetGoesse);

        //Element in einem Sets suchen
        if (mitarbeiterSet.contains("Paul")) {
            System.out.println("Paul ist ein mitarbeiter");
        }


        
    }
}
