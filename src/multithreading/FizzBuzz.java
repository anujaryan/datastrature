package multithreading;

import java.util.ConcurrentModificationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

/**
 * @author Anuj Pachauri
 *
 *         10:56:38 pm
 */
public class FizzBuzz {

	private int n;

	private final AtomicInteger counter;

	public FizzBuzz(int n) {
		this.n = n;
		counter = new AtomicInteger(1);
	}

	private void updateToNext(int count) {
		if (!counter.compareAndSet(count, count + 1))
			throw new ConcurrentModificationException();
	}

	// printFizz.run() outputs "fizz".
	public void fizz(Runnable printFizz) throws InterruptedException {

		int count;
		while ((count = counter.get()) <= n) {
			if (count % 3 == 0 && count % 5 != 0) {
				printFizz.run();
				updateToNext(count);
			}
		}
	}

	// printBuzz.run() outputs "buzz".
	public synchronized void buzz(Runnable printBuzz) throws InterruptedException {

		int count;
		while ((count = counter.get()) <= n) {
			if (count % 3 != 0 && count % 5 == 0) {
				printBuzz.run();
				updateToNext(count);
			}
		}

	}

	// printFizzBuzz.run() outputs "fizzbuzz".
	public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {

		int count;
		while ((count = counter.get()) <= n) {
			if (count % 3 == 0 && count % 5 == 0) {
				printFizzBuzz.run();
				updateToNext(count);
			}
		}

	}

	// printNumber.accept(x) outputs "x", where x is an integer.
	public void number(IntConsumer printNumber) throws InterruptedException {

		int count;
		while ((count = counter.get()) <= n) {
			if (count % 3 != 0 && count % 5 != 0) {
				printNumber.accept(count);

				updateToNext(count);
			}
		}
	}

	public static void main(String[] args) {

		FizzBuzz fizzbuzz = new FizzBuzz(15);

		IntConsumer printNumber = x -> System.out.print(x + " , ");
		Runnable fizzrun = () -> System.out.println("fizz");
		Runnable buzzrun = () -> System.out.println("buzz");
		Runnable fizzbuzzrun = () -> System.out.println("fizzbuzz");
		// Runnable print

		Thread fizz = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					fizzbuzz.fizz(fizzrun);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		fizz.start();
		Thread buzz = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					fizzbuzz.buzz(buzzrun);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		buzz.start();

		Thread fizzbuzzprint = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					fizzbuzz.fizzbuzz(fizzbuzzrun);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		fizzbuzzprint.start();

		Thread printNuber = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					fizzbuzz.number(printNumber);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		printNuber.start();

	}
}
