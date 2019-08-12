/**
27-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author Dell
 *
 *         11:23:27 pm
 */

enum SemaphoresTest {
	INSTANCE;

	private Semaphore semaphore = new Semaphore(3, true);

	public void downloadData() throws InterruptedException {

		semaphore.acquire();
		try {

			download();
		} finally {
			semaphore.release();
		}

	}

	private void download() {
		System.out.println("Downloading data from web....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class SemaphoreSimulation {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();

		for (int i = 0; i < 12; i++) {
			service.execute(new Runnable() {

				@Override
				public void run() {
					try {
						SemaphoresTest.INSTANCE.downloadData();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
			});
		}

	}
}
