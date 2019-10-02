/**
01-Sep-2019
Anuj Pachauri

 * 
 */
package binarysearch;

/**
 * @author Anuj Pachauri
 *
 *         3:56:33 pm
 */
public class ArrangeCoins {

	// Brute force algo..
	public static int arrangCoins(int n) {

		int sum = 0;

		for (int i = 1; i < n; i++) {

			sum += i;
			if (sum > n)
				return i - 1;
			if (sum == n)
				return i;
		}

		return 0;
	}

	public static int arrangeCoinsBs(int n) {

		return binarySearch(n, 0, n);
	}

	/**
	 * @param n
	 * @param i
	 * @param n2
	 * @return
	 */
	private static int binarySearch(int n, int l, int r) {

		int mid = l + (r - l) / 2;
		long sum = (1 + (long) mid) * mid / 2;
		if (sum == n)
			return mid;
		if (sum < n && sum + mid + 1 > n)
			return mid;
		if (sum < n)
			return binarySearch(n, mid + 1, r);

		return binarySearch(n, l, mid - 1);
	}

	// Pure Math

	public static int arrangeCoinsMath(int n) {
		long p1 = 1 + 8 * (long) n;
		return (int) (-1 + Math.sqrt(p1 + 1)) / 2;
	}

	public static void main(String args[]) {

		int n = 8;
		System.out.println(" Brute Force Total Staircase Ladder  : " + arrangCoins(n));
		System.out.println("Binary Total Search Staircase Ladder  : " + arrangeCoinsBs(n));
		System.out.println(" Math Total  Staircase Ladder  : " + arrangeCoinsMath(n));
	}
}
