package a01_ThreadErzeugen;

public class MyThread extends Thread {

	String name;
	int wait;
	int end;
	
	public MyThread(String name, int wait, int end) {
		this.name = name;
		this.wait = wait;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < end; i++) {
			System.out.println(name+": "+i);
		}
		
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
