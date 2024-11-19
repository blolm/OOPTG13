import java.util.Stack;

public class MyStack {
	
	public static void main(String[] args) {
	
		Stack<String> tiere = new Stack<>();
		tiere.add("Hund");
		tiere.add("Katze");
		tiere.add("Vogel");
		System.out.println("Stack:		" + tiere);
		
		System.out.println();
		
		//Element auf den Stack legen (an die Spitze)
		//.push();
		System.out.println("Element an die Spitze des Stacks:		.push()");
		tiere.push("Fisch");
		System.out.println("Updatet Stack:	" + tiere);
		
		System.out.println();
		
		//Element an oberste Stelle des Stacks l�schen
		//.pop();
		System.out.println("Element an der Spitze des Stacks l�schen:	.pop()");
		System.out.println("Stack:		" + tiere);
		tiere.pop();
		System.out.println("Updatet Stack:	" + tiere);
		
		System.out.println();
		
		//Element an der Spitze des Stacks abfragen
		//.peek()
		System.out.println("Element an der Spitze des Stacks abfragen:	.peek()");
		System.out.println("Oberstes Element des Stacks:	" + tiere.peek());
		
		System.out.println();
		
		//Elementposition im Stack suchen
		//.search()
		System.out.println("Elementposition im Stack suchen:		.search()");
		System.out.println("Stack:		" + tiere);
		System.out.println("An welcher position ist das Element Katze im Stack?:	" + tiere.search("Katze"));
		
		System.out.println();
		
		//�berpr�fen ob Stack leer ist
		//.empty();
		System.out.println("�berpr�fen ob Stack leer ist:			.empty()");
		System.out.println("ist der Stack leer? "+tiere.empty());
	}
}
