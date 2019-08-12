/**
31-Jul-2019
Dell

 * 
 */
package multithreading.studentLibrarySimulation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dell
 *
 *         10:53:22 pm
 */
public class App {

	public static void main(String[] args) {
		Student[] student = null;
		Book[] book = null;

		ExecutorService threadService = Executors.newFixedThreadPool(Constants.NUMBER_OF_STUDENTS);

		try {
			book = new Book[Constants.NUMBER_OF_BOOKS];
			student = new Student[Constants.NUMBER_OF_STUDENTS];
			for (int i = 0; i < book.length; i++) {
				book[i] = new Book(i);

			}

			for (int i = 0; i < student.length; i++) {
				student[i] = new Student(i, book);
				threadService.execute(student[i]);

			}
		} catch (Exception e) {

			e.printStackTrace();
			threadService.shutdown();
		} finally {
			threadService.shutdown();
		}

	}

}
