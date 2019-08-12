/**
28-Jul-2019
Dell

 * 
 */
package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dell
 *
 *         12:00:31 am
 */
public class ExecutorSimulator {

	public static void main(String[] args) {

		ExecutorService tf = Executors.newCachedThreadPool();

		for (int i = 1; i <= 12; i++) {
			tf.submit(new Runnable() {

				@Override
				public void run() {
					new ExecutirWorker().task();

				}
			});
		}

	}

}

class ExecutirWorker {

	public void task() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
