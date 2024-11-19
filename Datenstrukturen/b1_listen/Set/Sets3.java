import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets3 {
    public static void main(String[] args) {
        
    Set<Integer> erstesSet = new HashSet<Integer>();
    erstesSet.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 0 }));
    Set<Integer> zweitesSet = new HashSet<Integer>();
    zweitesSet.addAll(Arrays.asList(new Integer[] {1, 3, 4, 5, 6, 7, 5})); 

    //Sets ausgeben
    System.out.println(erstesSet);
    System.out.println(zweitesSet);

    //Sets vereinigen
    Set<Integer> union = new HashSet<Integer>(erstesSet);   //erstesSet wird hier direkt übergeben
    union.addAll(zweitesSet);
    System.out.println(union);


    //Schnittmengen
    Set<Integer> schnittmenge = new HashSet<>();    //erstesSet wird hier erst über .addAll hinzugefügt
    schnittmenge.addAll(erstesSet);
    schnittmenge.retainAll(zweitesSet);
    System.out.println(schnittmenge);

    //Schnittmenge entfernen aus einem Set ohne .retainAll
    Set<Integer> differenz = new HashSet<>(erstesSet);
    differenz.removeAll(zweitesSet);
    System.out.println(differenz);

    }
}
