
public class MyThreadByRunnable implements Runnable{
	@Override
	public void run() {
		MainClass.class.notify();
		System.out.println("thread1 by implements Runnable");
	}

}
