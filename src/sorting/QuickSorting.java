package sorting;

import java.util.Arrays;

public class QuickSorting {

	/**
	 * @param arr
	 * @param low
	 * @param high
	 * 
	 *            time complexity is o(n2) and space comploxity is o(log n)
	 */
	static void QuickSort(int arr[], int low, int high) {

		if (low > high)
			return;

		int mid = low + (high - low) / 2;
		int pivot = arr[mid];

		int i = low;
		int j = high;

		while (i <= j) {

			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}

		}

		if (low < j) {
			QuickSort(arr, low, j);
		}
		if (high > i) {
			QuickSort(arr, i, high);
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 67, 20, 40, 28, 80, 70 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		QuickSort(arr, 0, arr.length - 1);

		System.out.println("After sorting ...");
		System.out.println(Arrays.toString(arr));

	}

}
