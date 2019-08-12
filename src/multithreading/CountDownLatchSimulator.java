/**
28-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dell
 *
 *         10:45:11 am
 */
public class CountDownLatchSimulator {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(5);
		ExecutorService threadService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {

			threadService.execute(new CountDownWorker(i + 1, latch));

			try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("All Thread Performed prerequisites.....");
		threadService.shutdown();
	}
}

class CountDownWorker implements Runnable {

	private int id;
	private CountDownLatch latch;

	/**
	 * 
	 */
	public CountDownWorker(int id, CountDownLatch latch) {
		this.id = id;
		this.latch = latch;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		doWork();
		latch.countDown();

	}

	/**
	 * 
	 */
	private void doWork() {
		System.out.println("Thread of Id " + this.id + " Start working...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
