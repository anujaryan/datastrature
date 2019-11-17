/**
31-Aug-2019
Anuj Pachauri

 * 
 */
package leetcode;

/**
 * @author Anuj Pachauri
 *
 *         2:19:01 pm
 */
public class Dptest {

	public static void main(String[] args) {

		System.out.println("Factorial Of number is : " + fact(5));
		System.out.println("Fibonacci Of number is : " + fibo(5));
		System.out.println("Reverese String " + reveString("anuj"));
	}

	public static int fact(int n) {

		if (n == 1)
			return 1;
		return n * fact(n - 1);
	}

	public static int fibo(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibo(n - 1) + fibo(n - 2);

	}

	public static String reveString(String str) {
		if (str.isEmpty())
			return str;

		return reveString(str.substring(1)) + str.charAt(0);
	}
}
