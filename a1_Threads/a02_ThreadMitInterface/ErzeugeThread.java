
package a02_ThreadMitInterface;

public class ErzeugeThread {
	
	public static void main(String[] args) {
	System.out.println("Thread mit Interface erstellen gestartet");
	
	//Threadobjekt erzeugen
	MeinThread a = new MeinThread("a", 3);
	MeinThread b = new MeinThread("b", 10);
	
	//Threads nebenläufig starten
	a.start();
	b.start();
	}
}
