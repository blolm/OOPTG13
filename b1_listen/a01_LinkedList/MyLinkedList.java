package a01_LinkedList;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		
		//LinkedList erstellen
		LinkedList<String> tiere = new LinkedList<>();
		
		tiere.add("Hund");
		tiere.add("Katze");
		tiere.add("Vogel");
		System.out.println("LinkedList:		" + tiere);
		

		System.out.println();
		//Element hinzufügen
		//.add
		System.out.println("Element hinzufügen 	.add()");
		tiere.add(1,"Fisch");	// An der zweiten Stelle, also Position 1 wird Fisch Hinzugefügt
		System.out.println("UpdatedLinkedList:	" + tiere);
		
		System.out.println();
		
		//Element abfragen
		//.get()
		System.out.println("Element abfragen 	.get()");
		System.out.println("Element der LinkedList an position 1(nachdem Fisch hinzugefügt wurde): " + tiere.get(1));
		
		
		System.out.println();
		//Element ändern
		//.set()
		System.out.println("Element ändern 		.set()");
		System.out.println("LinkedList:		" + tiere);
		tiere.set(1,"Hase");
		System.out.println("UpdatedLinkedList:	" + tiere);
		
		
		System.out.println();
		//Element entfernen 
		//.remove()
		System.out.println("Element entfernen 	.remove()");
		System.out.println("LinkedList:		" + tiere);
		tiere.remove("Hase");
		System.out.println("UpdatedLinkedList:	" + tiere);
		
		
		System.out.println();
		//Über die Liste Iterieren (jedes Element auf etwas überprüfen/durchgehen)
		System.out.println("Über Liste Iterieren:	foreach Schleife");
		for (String tier : tiere) {
		System.out.println("Enthält die Liste an dieser Position das Element Katze? " + tier.contains("Katze"));
		}
	}
}