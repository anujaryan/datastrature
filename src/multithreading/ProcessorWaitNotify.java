/**
27-Jul-2019
Dell

 * 
 */
package multithreading;

/**
 * @author Dell
 *
 *         9:43:48 pm
 */
public class ProcessorWaitNotify {

	public static void main(String[] args) {

		WaitNotify object = new WaitNotify();

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

class WaitNotify {

	public void producer() throws InterruptedException {
		synchronized (this) {

			System.out.println("I am producing something");
			wait(1000);
			System.out.println("I am again producing .....");
		}

	}

	public void consumer() throws InterruptedException {

		Thread.sleep(100);
		synchronized (this) {

			System.out.println("I am consuming something");

			notify();
			Thread.sleep(1000);

		}
	}
}
