package a01_ThreadErzeugen;

public class StartMyThread {
	
public static void main(String[] args) {
		//beginn main Thread
		System.out.println("Main Thread gestartet");

		//Thread Objekt erzeugen
		MyThread a = new MyThread("a",100,10);
		MyThread b = new MyThread("b",500,40);
	
		a.start();
		b.start();
	
		System.out.println("Main Thread zuende");
	}
}
