package array;

import java.util.Arrays;

public class SortArrayLinear {

	// time comlexity of application is o(n) and auxilary space o(1)

	static void swapArray(int arr[]) {

		int x = -1, y = -1, prev = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (prev > arr[i]) {

				if (x == -1) {
					x = i - 1;
					y = i;
				} else {
					y = i;
				}
			}

			prev = arr[i];
		}
		swap(arr, x, y);

	}

	private static void swap(int[] arr, int x, int y) {
		// TODO Auto-generated method stub

		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;

	}

	public static void main(String[] args) {

		int arr[] = { 3, 8, 6, 7, 5, 9 };
		System.out.println("Arrays before sort.." + Arrays.toString(arr));
		swapArray(arr);
		System.out.println("Arrays After sort.." + Arrays.toString(arr));
	}
}
