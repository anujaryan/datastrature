/**
31-Jul-2019
Dell

 * 
 */
package multithreading.studentLibrarySimulation;

import java.util.Random;

/**
 * @author Dell
 *
 *         10:53:38 pm
 */
public class Student implements Runnable {

	private int id;
	private Book[] book;

	public Student(int id, Book[] book) {

		this.id = id;
		this.book = book;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {

		Random random = new Random();

		while (true) {

			int bookid = random.nextInt(Constants.NUMBER_OF_BOOKS);

			try {
				book[bookid].read(this);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Override
	public String toString() {
		return "Student" + id;
	}
}
