package sorting;

import java.util.Arrays;

public class SelectionSorting {

	/**
	 * @param A
	 *            Time complexity is o(n2) and space complexity is 0(1)
	 */
	static void selectionSort(int A[]) {

		int n = A.length;

		for (int i = 0; i < n - 1; i++) {
			int index = i;

			for (int j = i + 1; j < n; j++) {
				if (A[j] < A[index]) {
					index = j;
				}
			}

			if (index != i) {
				int temp = A[index];
				A[index] = A[i];
				A[i] = temp;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 67, 20, 40, 28, 80, 70 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);

		System.out.println("After sorting ...");
		System.out.println(Arrays.toString(arr));

	}
}
