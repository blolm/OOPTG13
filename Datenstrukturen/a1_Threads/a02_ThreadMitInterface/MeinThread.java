package a02_ThreadMitInterface;

public class MeinThread implements Runnable{

	int wait;
	String name;
	Thread t;
	
		
	public MeinThread(String name, int wait) {
		this.name = name;
		this.wait = wait;
		t = new Thread(this);
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name+" "+i);
			
			try {
				Thread.sleep(wait);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void start() {
		t.start();		
	}
	
	
}
