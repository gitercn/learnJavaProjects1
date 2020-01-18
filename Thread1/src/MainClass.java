
public class MainClass {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThreadByThread testThreadByThread = new MyThreadByThread();
		testThreadByThread.start();
		
//		MyThreadByThread2 testThreadByThread2 = new MyThreadByThread2();
//		testThreadByThread2.start();
		
		Thread testThreadByRunnable = new Thread(new MyThreadByRunnable());
		testThreadByRunnable.start();
		
//		MyThreadByRunnable2 testThreadByRunnable2 = new MyThreadByRunnable2();
//		testThreadByRunnable2.run();
	}

}
