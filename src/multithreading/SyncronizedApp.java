/**
21-Jul-2019
Dell

 * 
 */
package multithreading;

/**
 * @author Dell
 *
 *         3:21:48 pm
 */
public class SyncronizedApp {
	public static int counter = 0;

	public synchronized static void increment() {
		counter++;
	}

	public static void m1() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 5000; i++)
					increment();

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 5000; i++)
					increment();

			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		m1();
		System.out.println(counter);
	}
}

class Process {

}
