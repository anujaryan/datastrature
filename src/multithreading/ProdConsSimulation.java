/**
27-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dell
 *
 *         10:02:53 pm
 */
public class ProdConsSimulation {

	public static void main(String[] args) {

		ProducerAndConsumer object = new ProducerAndConsumer();

		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					object.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					object.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		producer.start();
		consumer.start();

	}

}

class ProducerAndConsumer {

	private Object lock = new Object();
	List<Integer> list = new ArrayList<>();
	final int LIMIT = 5;
	final int bottom = 0;
	int value = 0;

	public void producer() throws InterruptedException {
		synchronized (lock) {

			while (true) {

				if (list.size() == LIMIT) {
					System.out.println("Waiting for Remove Item....");
					lock.wait();
				} else {
					System.out.println("Adding Item to List " + value);
					list.add(value);
					value++;
					lock.notify();
				}
				Thread.sleep(500);
			}

		}

	}

	public void consumer() throws InterruptedException {

		synchronized (lock) {

			while (true) {

				if (list.size() == bottom) {
					System.out.println("Waiting for Add Item....");
					lock.wait();
				} else {
					System.out.println("Remove Item from List " + list.remove(--value));
					lock.notify();
				}
				Thread.sleep(500);
			}

		}

	}
}