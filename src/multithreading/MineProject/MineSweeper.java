/**
03-Aug-2019
Dell

 * 
 */
package multithreading.MineProject;

import java.util.Random;

/**
 * @author Dell
 *
 *         2:57:00 pm
 */
public class MineSweeper implements Runnable {

	private int id;
	private Board board;
	private volatile boolean sweeperRunning;

	public MineSweeper(int id, Board board) {

		this.id = id;
		this.board = board;
		this.sweeperRunning = true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

		Random random = new Random();

		while (sweeperRunning) {

			if (Thread.currentThread().isInterrupted()) {
				return;
			}

			int index = random.nextInt(Constants.BOARD_ROWS * Constants.BOARD_COLUMNS);

			board.sweepMine(index);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void setSweeperRunning(boolean sweeperRunning) {

		this.sweeperRunning = sweeperRunning;

	}
}
