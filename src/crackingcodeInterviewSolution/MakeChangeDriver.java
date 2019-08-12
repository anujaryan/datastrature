/**
12-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         6:46:04 PM
 */
public class MakeChangeDriver {

	public static int makeChange(int n, int denom) {

		int next_denom = 0;

		int ways = 0;

		switch (denom) {

		case 25:
			next_denom = 10;
			break;
		case 10:
			next_denom = 5;
			break;
		case 5:
			next_denom = 1;
			break;
		case 1:
			return 1;

		}

		for (int i = 0; i * denom <= n; i++) {
			ways += makeChange(n - i * denom, next_denom);
		}

		return ways;

	}

	public static void main(String str[]) {

		int n = 100;
		System.out.println("Make change of 100 :  " + makeChange(n, 25));
	}
}
