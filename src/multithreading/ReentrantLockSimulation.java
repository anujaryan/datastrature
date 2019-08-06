/**
27-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dell
 *
 *         10:56:38 pm
 */
public class ReentrantLockSimulation {

	static int counter = 0;
	private static Lock lock = new ReentrantLock();

	public static int increment() {

		lock.lock();
		for (int i = 0; i < 5000; i++) {
			counter++;
		}
		lock.unlock();
		return counter;
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				increment();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				increment();
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Counter is " + counter);
	}

}
