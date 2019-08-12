/**
28-Jul-2019
Dell

 * 
 */
package multithreading.diningPhilophosher;

import java.util.Random;

/**
 * @author Dell
 *
 *         6:57:50 pm
 */
public class Philospher implements Runnable {

	private int id;
	private Chopsticks left;
	private Chopsticks right;
	private Random random;
	private int eatingCounter;
	private volatile boolean isFull = false;

	public Philospher() {
		super();
	}

	public Philospher(int id, Chopsticks left, Chopsticks right) {
		super();
		this.id = id;
		this.left = left;
		this.right = right;
		this.random = new Random();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		try {

			while (!isFull) {
				think();

				if (this.left.pickUp(this, State.LEFT)) {

					if (this.right.pickUp(this, State.RIGHT)) {
						eat();
						this.right.putDown(this, State.RIGHT);
					}
					this.left.putDown(this, State.LEFT);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @throws InterruptedException
	 * 
	 */
	private void eat() throws InterruptedException {

		System.out.println(this + " is eating....");
		this.eatingCounter++;
		Thread.sleep(random.nextInt(1000));

	}

	/**
	 * @throws InterruptedException
	 * 
	 */
	private void think() throws InterruptedException {
		System.out.println(this + " is Thinking ....");
		Thread.sleep(this.random.nextInt(1000));

	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Philosopher " + id;
	}

	public int getEatingCounter() {
		return this.eatingCounter;
	}

}
