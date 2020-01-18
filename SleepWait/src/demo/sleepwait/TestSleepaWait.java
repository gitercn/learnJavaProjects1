package demo.sleepwait;

public class TestSleepaWait {
	public static void main(String[] args) {
		new Thread(new Thread1()).start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(new Thread2()).start();
		
	}

}
