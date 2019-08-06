/**
28-Jul-2019
Dell

 * 
 */
package multithreading.diningPhilophosher;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dell
 *
 *         6:57:11 pm
 */
public class Chopsticks {

	private int id;
	private Lock lock;

	public Chopsticks(int id) {
		super();
		this.id = id;
		this.lock = new ReentrantLock();
	}

	public boolean pickUp(Philospher philospher, State state) throws InterruptedException {

		if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
			System.out.println("Philospher " + philospher + " Pick up " + state.toString() + " " + this);
			return true;
		}
		return false;

	}

	public void putDown(Philospher philopsher, State state) {
		lock.unlock();
		System.out.println(philopsher + " put down " + this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return " Chopstick " + id;
	}

}
