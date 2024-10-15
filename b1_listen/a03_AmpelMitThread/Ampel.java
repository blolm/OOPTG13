package a03_AmpelMitThread;

public class Ampel implements Runnable{

	int waitrot;
	int waitrotgelb;
	int waitgelb;
	int waitgruen;
	String name;
	Thread t;
	public static final int ROT=1;
	public static final int ROTGELB=2;
	public static final int GELB=3;
	public static final int GRUEN=4;
	int zustand = ROT;
	
	public Ampel(String name, int waitrot, int waitrotgelb, int waitgelb, int waitgrün) {
		this.name = name;
		this.waitrot = waitrot;
		this.waitrotgelb = waitrotgelb;
		this.waitgelb = waitgelb;
		this.waitgruen = waitgrün;
		t = new Thread(this);
	}
	
	@Override
	public void run() {
		while(true) {
			switch(zustand) {
			case ROT:
			System.out.println(name+"      Rot");
			wait(waitrot);
			zustand = ROTGELB;
			break;
			
			case ROTGELB:
			System.out.println(name+"      Rot-Gelb");
			wait(waitrotgelb);
			zustand = GELB;
			break;
			
			case GELB:
			System.out.println(name+"      Gelb");
			wait(waitgelb);
			zustand = GRUEN;
			break;
			
			case GRUEN:
			System.out.println(name+"      Grün");
			wait(waitgruen);
			zustand = ROT;
			break; 
			}
		}		
	}

	private void wait(int w) {
		try {
			Thread.sleep(w);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		t.start();
	}
}
