package dynamicProgramming;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
11:18:52 pm
 */
public class SubSet {

	public boolean subSetSum(int[] arr) {
		int s = Arrays.stream(arr).sum();
		if (s % 2 != 0)
			return false;
		return subSetSum(arr, s / 2, 0);
	}

	/**
	 * @param arr
	 * @param s
	 * @return
	 */
	private boolean subSetSum(int[] arr, int sum, int currentIndex) {

		if (sum == 0)
			return true;
		if (arr.length == 0 || currentIndex >= arr.length) {
			return false;
		}

		if (arr[currentIndex] <= sum) {
			if (subSetSum(arr, sum - arr[currentIndex], currentIndex + 1)) {
				return true;
			}
		}

		// recusive call after exclusive the number at the currentIndex
		return subSetSum(arr, sum, currentIndex + 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 9, 3, 4 };
		SubSet set = new SubSet();
		System.out.println(set.subSetSum(arr));

	}
}
