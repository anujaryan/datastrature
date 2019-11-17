/**
12-Aug-2019
Anuj Pachauri

 * 
 */
package leetcode;

/**
 * @author Anuj Pachauri
 *
 *         10:54:32 pm
 */
public class SqrtImpl {

	public static void main(String str[]) {

		int n = 8;
		System.out.println("Sqrt of Number is : " + mySqrt(n));
	}

	/**
	 * @param n
	 * @return
	 */
	private static int mySqrt(int n) {
		int sqrt = (int) Math.sqrt(n);
		return sqrt;
	}
}
