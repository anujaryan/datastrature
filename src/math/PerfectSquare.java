/**
19-Aug-2019
Anuj Pachauri

 * 
 */
package math;

/**
 * @author Anuj Pachauri
 *
 *         11:31:57 pm
 */
public class PerfectSquare {

	public static boolean isPerfectSquare(int num) {

		if (num < 2)
			return true;

		int low = 2, high = num / 2;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (mid * mid < num) {
				low = mid + 1;
			} else if (mid * mid > num) {
				high = mid - 1;
			} else {
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {

		int num = 14;
		System.out.println("Is Given Number Perfect Square ? :" + isPerfectSquare(num));
	}
}
