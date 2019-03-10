package sorting;

import java.util.Arrays;

public class BubbleSorting {

	/**
	 * @param arr
	 *            Time complexity is o(n2) and space complexity is 0(1)
	 */
	static void bubbleSort(int arr[]) {

		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 67, 20, 40, 28, 80, 70 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);

		System.out.println("After sorting ...");
		System.out.println(Arrays.toString(arr));

	}

}
