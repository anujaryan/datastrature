/**
28-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dell
 *
 *         3:02:42 pm
 */
public class CyclicBarrierSimulator {

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

		ExecutorService threadService = Executors.newFixedThreadPool(5);

		CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {

			@Override
			public void run() {
				System.out.println("Cyclic Barrier Finished its work..");

			}
		});

		for (int i = 0; i < 5; i++) {

			threadService.execute(new CyclicWorker(i + 1, barrier));
			// barrier.await();

		}
		threadService.shutdown();

	}
}

class CyclicWorker implements Runnable {

	int id;
	CyclicBarrier barrier;

	CyclicWorker(int id, CyclicBarrier barrier) {
		this.id = id;
		this.barrier = barrier;
	}

	@Override
	public void run() {

		doWork();
		try {
			barrier.await();

			System.out.println("After Await method....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	private void doWork() {
		System.out.println("Thread id :" + this.id + " Start Working...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread id :" + this.id + " Finished....");
	}

}
