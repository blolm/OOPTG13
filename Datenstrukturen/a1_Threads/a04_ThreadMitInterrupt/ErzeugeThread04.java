package a04_ThreadMitInterrupt;

import java.util.Scanner;

import a02_ThreadMitInterface.MeinThread;

public class ErzeugeThread04 {
	

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Thread mit Interface erstellen gestartet");
		
		//Threadobjekt erzeugen
		MeinThread04 a = new MeinThread04("a", 3000);
		MeinThread04 b = new MeinThread04("b", 1000);
		
		//Threads nebenläufig starten
		a.start();
		b.start();
		
		if(Sc.nextInt()==0) {
			a.interrupt();
			System.out.println("Thread a ist unterbrochen");
		}
		}
}
