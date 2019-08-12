/**
11-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         8:15:05 PM
 */
public class NthFibonacciTerm {

	public static int findNthFibonacciTerm(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n > 1) {
			return findNthFibonacciTerm(n - 1) + findNthFibonacciTerm(n - 2);
		} else {
			return -1;
		}

	}

	public static int iterativeFibo(int n) {

		if (n < 0) {
			return -1;
		}
		if (n == 0)
			return 0;
		int a = 1, b = 1;

		for (int i = 3; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}

		return b;

	}

	public static void main(String[] args) {

		int n = 5;

		System.out.println(" Nth  Recursive Fibonacci Term is " + findNthFibonacciTerm(2));
		System.out.println(" Nth  Iterative Fibonacci Term is " + findNthFibonacciTerm(2));

	}
}
