package multithreading;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.CountDownLatch;

import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
 *         7:15:45 pm
 */
public class MaximumParallelism {

	@Test
	public void shouldCreateOnlySingleIntsanceOfAClassWhenTestedWithParallelThreads() throws InterruptedException {

		final ObjectFactory factory = new ObjectFactory();
		final CountDownLatch startSignal = new CountDownLatch(1);
		class MyThread extends Thread {
			ObjectFactory instance;

			@Override
			public void run() {

				try {
					startSignal.await();
					instance = factory.getInstance();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		int threadCount = 1000;

		MyThread[] threads = new MyThread[threadCount];

		for (int i = 0; i < threads.length; i++) {

			threads[i] = new MyThread();
			threads[i].start();
		}
		startSignal.countDown();
		for (MyThread thread : threads) {
			thread.join();
		}

		ObjectFactory instance = factory.getInstance();

		for (MyThread thread : threads) {
			assertEquals(instance, thread.instance);
		}

	}

}

class ObjectFactory {

	private volatile ObjectFactory instance;

	public ObjectFactory getInstance() {

		if (instance == null) {

			synchronized (this) {
				if (instance == null) {

					instance = new ObjectFactory();

				}

			}
		}
		return instance;
	}

}
