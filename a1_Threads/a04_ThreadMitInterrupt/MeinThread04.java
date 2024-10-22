package a04_ThreadMitInterrupt;

public class MeinThread04 implements Runnable {

	int wait;
	String name;
	Thread t;

	public MeinThread04(String name, int wait) {
		this.name = name;
		this.wait = wait;
		t = new Thread(this);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + i);
			if (t.isInterrupted()) {
				break;
			}	
			
			try {
				Thread.sleep(wait);
			} catch (InterruptedException e) {
				interrupt();
			}
			
			
		}
		
	}

	public void start() {
		t.start();
	}

	public void interrupt() {
		t.interrupt();
	}

}
