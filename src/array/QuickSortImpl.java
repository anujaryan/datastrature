package array;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         11:58:09 am
 */
public class QuickSortImpl {

	public static void quickSort(int arr[], int low, int high) {

		if (low > high) {
			return;
		}

		int i = low;
		int j = high;
		int mid = low + (high - low) / 2;
		int pivot = arr[mid];

		while (i <= j) {

			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;

			if (i <= j) {

				int temp = arr[i];
				arr[j] = arr[j];
				arr[j] = temp;
				i++;
				j--;

			}

		}

		if (j > low) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}

	}

	public static void main(String arg[]) {

		int arr[] = { 10, 67, 20, 40, 28, 80, 70 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);

		System.out.println("After sorting ...");
		System.out.println(Arrays.toString(arr));

	}
}
