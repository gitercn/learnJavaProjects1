package demo.sleepwait;

class Thread1 implements Runnable {

	@Override
	public void run() {
		synchronized (TestSleepaWait.class) {
			System.out.println("Thread1 is start...");
			try {
				//，调用wait方法，线程会放弃对象锁，进入等待对象的等待锁定
				System.out.println("Thread1 is wait...");
				TestSleepaWait.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread1 is go on...");
			System.out.println("Thread1 is over!");
		}

	}

}
