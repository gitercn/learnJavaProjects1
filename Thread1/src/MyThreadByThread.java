
public class MyThreadByThread extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("I will sleep 10s");
			Thread.sleep(10000);
			System.out.println("I will wakeup");
			System.out.println("I will wait");
			MainClass.class.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread1 by extends Thread");
	}

}
