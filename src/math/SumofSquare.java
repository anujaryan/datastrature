/**
21-Aug-2019
Anuj Pachauri

 * 
 */
package math;

/**
 * @author Anuj Pachauri
 *
 *         2:50:14 am
 */
public class SumofSquare {

	public static boolean sumOfSquare(int c) {

		for (int a = 0; a < Math.sqrt(c); a++) {

			int b2 = c - a * a;
			int b = (int) Math.sqrt(b2);

			if (b * b == b2) {
				return true;
			}

		}
		return false;
	}

	public static void main(String str[]) {
		int c = 10;
		System.out.println("Sum of Square is :" + sumOfSquare(c));
	}
}
