package multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Anuj Pachauri
 *
 *         5:29:42 pm
 */
public class CountDownSimulator {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(2);

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 3; i++) {

			service.submit(new Processor(latch));
		}

		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed...");

	}
}

class Processor implements Runnable {

	private CountDownLatch countDown;

	Processor(CountDownLatch countDown) {
		this.countDown = countDown;
	}

	@Override
	public void run() {

		System.out.println("Start..");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		countDown.countDown();
	}

}
