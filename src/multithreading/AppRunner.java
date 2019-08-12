/**
21-Jul-2019
Dell

 * 
 */
package multithreading;

/**
 * @author Dell
 *
 *         1:52:45 pm
 */
class Runner1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("Runner 1 = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Runner2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println("Runner 2 = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class AppRunner {
	public static void main(String[] args) {

//		Runner1 t1 = new Runner1();
//		Runner2 t2 = new Runner2();
//
//		t1.start();
//		t2.start();
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Worker w = new Worker();

		Thread t1 = new Thread(w);

		t1.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		w.setTerminate(true);

		System.out.println("Task Finished........");
	}

}

class Worker implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */

	private volatile boolean isTerminate = false;

	public boolean isTerminate() {
		return isTerminate;
	}

	public void setTerminate(boolean isTerminate) {
		this.isTerminate = isTerminate;
	}

	@Override
	public void run() {

		while (!isTerminate) {
			System.out.println("Task Executing...");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
