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
 *         12:00:15 pm
 */
public class MineLayer implements Runnable {

	private int id;
	private Board board;
	private volatile boolean layerRunning;

	public MineLayer(int id, Board board) {

		this.id = id;
		this.board = board;
		this.layerRunning = true;

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

		while (layerRunning) {

			if (Thread.currentThread().isInterrupted()) {
				return;
			}

			int index = random.nextInt(Constants.BOARD_ROWS * Constants.BOARD_COLUMNS);

			board.setMine(index);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void setLayerRunning(boolean layerRunning) {

		this.layerRunning = layerRunning;

	}

}
