/**
11-Aug-2019
Anuj Pachauri

 * 
 */
package java8;

/**
 * @author Anuj Pachauri
 *
 *         10:20:02 am
 */
public class Java8Features {

	public static void main(String str[]) {

		new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Hello anonymous Function...");
			}
		}).start();

		new Thread(() -> System.out.println("LAMDA EXPRESSION HERE...")).start();

	}
}
