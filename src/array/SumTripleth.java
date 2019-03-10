package array;

public class SumTripleth {

	static boolean sumtripleth(int arr[], int len, int sum, int count) {

		if (count == 3 && sum == 0) {
			return true;
		}
		// return false if sum is not possible with current configuration

		if (count == 3 || len == 0 || sum < 0) {
			return false;
		}

		// recurse with
		// 1. include current element
		// 2. exclude current element
		return sumtripleth(arr, len - 1, sum - arr[len - 1], count++) || sumtripleth(arr, len - 1, sum, count);

	}

	public static void main(String[] args) {

		int arr[] = { 2, 7, 0, 1, 5, 4, 3 };
		int sum = 6;

		if (sumtripleth(arr, arr.length, sum, 0)) {
			System.out.println("Triplet exists ...");
		} else {
			System.out.println("Triplet don't exists ...");
		}

	}
}
