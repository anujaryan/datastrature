package multithreading;

import java.util.function.IntConsumer;

/**
 * @author Anuj Pachauri
 *
 *         9:52:11 pm
 */
public class ZeroEvenOdd {

	private int n;

	private static volatile int state;

	ZeroEvenOdd(int n) {
		this.n = n;
	}

	public synchronized void next() {
		state = (state + 1) % 4;
	}

	public synchronized void zero(IntConsumer printNumber) throws InterruptedException {

		for (int i = 0; i < n; i++) {

			while (state != 0 && state != 2) {
				wait();
			}

			printNumber.accept(0);
			next();
			notifyAll();
		}

	}

	public synchronized void even(IntConsumer printNumber) throws InterruptedException {

		for (int i = 2; i <= n; i += 2) {
			while (state != 3) {
				wait();
			}

			printNumber.accept(i);
			next();
			notifyAll();
		}

	}

	public synchronized void odd(IntConsumer printNumber) throws InterruptedException {

		for (int i = 1; i <= n; i += 2) {
			while (state != 1) {
				wait();
			}

			printNumber.accept(i);
			next();
			notifyAll();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		IntConsumer printNumber = x -> System.out.print(x);

		// printNumber.accept(3);
		ZeroEvenOdd threads = new ZeroEvenOdd(10);

		Thread A = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					threads.zero(printNumber);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		A.start();

		Thread B = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					threads.even(printNumber);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		B.start();

		Thread C = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					threads.odd(printNumber);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		C.start();

	}

}
