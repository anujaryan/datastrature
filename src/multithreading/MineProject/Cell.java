/**
03-Aug-2019
Dell

 * 
 */
package multithreading.MineProject;

import java.awt.GridLayout;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.JPanel;

/**
 * @author Dell
 *
 *         11:16:12 am
 */
public class Cell extends JPanel {

	private int id;
	private Lock lock;
	private State state;
	private boolean hasBomb;

	public Cell(int id) {
		initVariables(id);
		setLayout(new GridLayout());

	}

	/**
	 * @param id2
	 */
	private void initVariables(int id) {
		this.id = id;
		this.lock = new ReentrantLock();
		this.state = State.EMPTY;
		this.hasBomb = false;

	}

	public void lock() {
		try {
			this.lock.tryLock(10, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void unlock() {
		this.lock.unlock();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.awt.Component#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.id + " - " + state.toString() + " - " + hasBomb;
	}
}
