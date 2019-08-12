/**
11-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         4:29:13 PM
 */
public class ConvertInte {

	public static int bitSwapRequired(int a, int b) {

		int count = 0;

		for (int c = a ^ b; c != 0; c = c >> 1) {
			count += c & 1;
		}

		return count;
	}

	public static void main(String str[]) {

		int a = 31;
		int b = 14;
		System.out.println("Bit Required to Swap :" + bitSwapRequired(a, b));

	}

}
