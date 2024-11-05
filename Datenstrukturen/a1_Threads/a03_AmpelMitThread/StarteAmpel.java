package a03_AmpelMitThread;

public class StarteAmpel {
	public static void main(String[] args) {
		System.out.println("Threads gestartet");
		
		Ampel a = new Ampel("a",10000,1000,3000,10000);
		Ampel b = new Ampel("b",10000,1000,3000,10000);
		
		a.start();
		b.start();
	}
}
