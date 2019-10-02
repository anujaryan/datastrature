package math;

/**
 * @author Anuj Pachauri
 *
 *         9:35:13 pm
 */
public class PerfectNumber {

	public static boolean perfectNumber(int n) {

		int sum = 0;
		for (int i = 1; i < n; i++) {

			if (n % i == 0) {
				sum += i;
			}
			if (sum == n) {
				return true;
			}

		}

		return false;

	}

	public static void main(String[] args) {
		int n = 28;
		int n1 = 33550336;
		int n2 = 99999996;
		long start = System.currentTimeMillis();
		System.out.println("Is Perfect Number :" + perfectNumber(n2));

		long end = System.currentTimeMillis();
		System.out.println("Time Taken : " + (end - start));
		// long start = System.currentTimeMillis();
		System.out.println("Is Perfect Number :" + perfectNumberOptimal(n2));

	}

	public static boolean perfectNumberOptimal(int n) {

		if (n < 5) {
			return false;
		}

		if (n == 6) {
			return true;
		}
		int sum = 0;

		for (int i = 1; i < Math.sqrt(n); i += 2) {

			sum += Math.pow(i, 3);
			if (sum == n && sum % 9 == 1) {
				return true;
			}
			if (sum > n) {
				return false;
			}
		}

		return false;
	}
}
