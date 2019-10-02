package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anuj Pachauri
 *
 *         1:46:50 pm
 */
public class Kdiff {

	public static void main(String args[]) {

		int arr[] = { 3, 1, 4, 1, 5 };
		int k = 2;
		System.out.println("K-Diff : " + findPairs(arr, k));
		int arr1[] = { 1, 2, 3, 4, 5 };
		int k1 = 1;

		System.out.println("K-Diff : " + findPairs(arr1, k1));

		int arr2[] = { 3, 1, 4, 1, 5 };
		int k2 = 2;

		System.out.println("K-Diff : " + findPairs(arr2, k2));

		System.out.println("K-Diff : " + findPairsOther(arr, k));

		System.out.println("K-Diff : " + findPairsOther(arr1, k1));

		System.out.println("K-Diff : " + findPairsOther(arr2, k2));

	}

	public static int findPairsOther(int arr[], int k) {

		if (arr.length == 0 || k < 0) {
			return 0;
		}

		Set<Integer> set = new HashSet<>();

		Set<Integer> repeat = new HashSet<>();

		for (int num : arr) {
			if (set.contains(num)) {
				repeat.add(num);
			} else {
				set.add(num);
			}
		}

		if (k == 0)
			return repeat.size();
		else {

			int res = 0;
			for (int num : set) {
				if (set.contains(num - k)) {
					res++;
				}
			}
			return res;
		}

		// return res;
	}

	public static int findPairs(int arr[], int k) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (Math.abs(Math.subtractExact(arr[i], arr[j])) == k) {
					count++;
				}

			}
		}

		return count;
	}
}
