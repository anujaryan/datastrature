package array;

import java.util.Arrays;

public class AltHighLow {

	// time complexity is o(n) and space complexity is o(1)
	/**
	 * @param arr
	 */
	static void rearrangeArray(int arr[]) {

		for (int i = 1; i < arr.length; i += 2) {

			// if prev element greater than current element than swap them
			if (arr[i - 1] > arr[i]) {
				swap(arr, i - 1, i);
			}
			// if next element greater than current element than swap them..
			if (i + 1 < arr.length && arr[i] < arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}

	}

	// utilities function for swap two integer ....................
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	// time complexity is o(nlog n)
	static void rearrangArray(int arr[]) {

		// array sort
		Arrays.sort(arr);
		// create a auxilary array here..................
		int A[] = new int[arr.length];

		int k = 0;
		int i = 0, j = arr.length - 1;
		while (i < j) {
			A[k++] = arr[i++];
			A[k++] = arr[j--];
		}
		if (i == j) {
			A[k] = arr[i];
		}
		System.out.println(Arrays.toString(A));
	}

	public static void main(String[] args) {
		int arr[] = { 15, 6, 9, 10, 11, 25 };
		System.out.println("Before Shuffle....");
		System.out.println(Arrays.toString(arr));
		System.out.println("After shuffle");
		// rearrangArray(arr);
		rearrangeArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
