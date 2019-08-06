/**
31-Jul-2019
Dell

 * 
 */
package multithreading.studentLibrarySimulation;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Dell
 *
 *         10:53:46 pm
 */
public class Book {

	private int id;
	private Lock lock;

	public Book(int id) {
		this.id = id;
		lock = new ReentrantLock();
	}

	public void read(Student student) throws InterruptedException {
		this.lock.tryLock(1, TimeUnit.MINUTES); // true false condition use if
		// clause
		// lock.lock();
		System.out.println(student + " start reading the Book" + this);
		Thread.sleep(2000);
		this.lock.unlock();
		System.out.println(student + " finished the book " + this);
	}

	@Override
	public String toString() {
		return "Book " + id;
	}
}
