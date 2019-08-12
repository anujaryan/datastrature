/**
28-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Dell
 *
 *         3:32:27 pm
 */
public class BlockingQueueSimulator {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

		new Thread(new BlockingFirstWorker(queue)).start();

		new Thread(new BlockingSecondWorker(queue)).start();

	}

}

class BlockingSecondWorker implements Runnable {

	BlockingQueue<Integer> queue;

	BlockingSecondWorker(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	int val = 0;

	@Override
	public void run() {

		while (true) {
			try {
				Integer item = queue.take();
				System.out.println("Taking Item from queue :" + item);
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class BlockingFirstWorker implements Runnable {

	BlockingQueue<Integer> queue;

	BlockingFirstWorker(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	int val = 0;

	@Override
	public void run() {

		while (true) {
			try {
				queue.put(val);
				System.out.println("Putting Item into queue :" + val);
				val++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
