/**
27-Aug-2019
Anuj Pachauri

 * 
 */
package array;

/**
 * @author Anuj Pachauri
 *
 *         12:23:46 am
 */
public class FibonacciNumber {

	public static int fibonacci(int n) {

		int a = 0;
		int b = 1;
		int c = 0;

		if (n == 0)
			return a;
		if (n == 1)
			return b;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;

		}
		return c;
	}

	public static void main(String args[]) {

		int n = 7;
		System.out.println("F(n) number is :" + fibonacci(n));
		System.out.println("F(n) number is :" + fiboRecursion(n));

	}

	public static int fiboRecursion(int n) {

		if (n == 0) {
			return 0;
		}

		if (n == 1)
			return 1;

		return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
