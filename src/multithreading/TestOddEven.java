/**
18-Aug-2019
Anuj Pachauri

 * 
 */
package multithreading;

/**
 * @author Anuj Pachauri
 *
 *         11:57:18 am
 */
public class TestOddEven implements Runnable {

	private int remainder = 1;
	private static int number = 1;

	private static Object lock = new Object();

	public TestOddEven(int remainder) {

		this.remainder = remainder;
	}

	@Override
	public void run() {

		while (number < 10) {

			synchronized (lock) {

				while (number % 2 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " : " + number);
				number++;
				lock.notify();

			}

		}

	}

	public void even() {

	}

	public void odd() {

	}

	public static void main(String[] args) {

		TestOddEven even = new TestOddEven(0);
		TestOddEven odd = new TestOddEven(1);
		Thread t1 = new Thread(even, "Even");

		Thread t2 = new Thread(odd, "Odd");

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
