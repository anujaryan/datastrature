/**
11-Aug-2019
Dell

 * 
 */
package multithreading;

/**
 * @author Dell
 *
 *         9:50:38 am
 */
public class PrintOddEven implements Runnable {

	private static int PRINT_NUMBER_UPTO = 10000000;

	private int remainder = 1;
	private static int number = 1;

	private static Object lock = new Object();

	/**
	 * 
	 */
	public PrintOddEven(int remainder) {

		this.remainder = remainder;
	}

	public static void main(String[] args) {

		PrintOddEven odd = new PrintOddEven(1);
		PrintOddEven even = new PrintOddEven(0);

		Thread t1 = new Thread(odd, "Odd");

		Thread t2 = new Thread(even, "Even");

		t1.start();
		t2.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		while (number < PRINT_NUMBER_UPTO) {

			synchronized (lock) {

				while (number % 2 != remainder) {

					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notify();

			}

		}

	}
}
