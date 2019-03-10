package array;

import java.util.Arrays;

public class MoveZeroRight {

	// time complexity for this solution o(n) and space complexity o(n)
	static void shiftZeroRight(int arr[]) {
		int len = arr.length;
		int k = 0;
		for (int i : arr) {
			if (i != 0) {
				arr[k++] = i;
			}
		}
		while (k < len) {
			arr[k++] = 0;
		}

		System.out.println("Zero shift to end Now array is .." + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 3, 0, 5 };
		shiftZeroRight(arr);

	}
}
