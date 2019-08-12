/**
28-Jul-2019
Dell

 * 
 */
package multithreading.diningPhilophosher;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dell
 *
 *         6:56:09 pm
 */
public class App {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService threadService = null;
		Philospher[] philosopher = null;

		try {
			philosopher = new Philospher[Constants.PHILOSHPER];
			Chopsticks[] chopstick = new Chopsticks[Constants.CHOPSTICKS];
			for (int i = 0; i < chopstick.length; i++) {
				chopstick[i] = new Chopsticks(i);
			}

			threadService = Executors.newFixedThreadPool(Constants.PHILOSHPER);
			for (int i = 0; i < Constants.PHILOSHPER; i++) {
				philosopher[i] = new Philospher(i, chopstick[i], chopstick[(i + 1) % Constants.CHOPSTICKS]);
				threadService.execute(philosopher[i]);
			}
			Thread.sleep(Constants.SIMULATION_RUNTIME_TIME);
			for (Philospher p : philosopher) {
				p.setFull(true);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			threadService.shutdown();

			while (!threadService.isTerminated()) {
				Thread.sleep(1000);

			}
			for (Philospher p : philosopher) {
				System.out.println(p + "  eats " + p.getEatingCounter());
			}
		}

	}
}
