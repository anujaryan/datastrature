package math;

/**
 * @author Anuj Pachauri
 *
 *         11:00:13 pm
 */
public class UglyNumber {

	// ugly number is whose prime factor only include 2, 3, and 5 only ex.6

	public static boolean checkUglyNumber(int nums) {
		
		if (nums <= 0)
			return false;
		if (nums == 1)
			return true;


		if (nums % 2 == 0) {
			return checkUglyNumber(nums / 2);
		}

		if (nums % 3 == 0) {
			return checkUglyNumber(nums / 3);
		}

		if (nums % 5 == 0) {
			return checkUglyNumber(nums / 5);
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(checkUglyNumber(6));
	}
}
