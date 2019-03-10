package array;

import java.util.Arrays;

public class MaxProdTwoInt {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 6, 7, 10 };

		findMaxProd(arr);
		findMaxProd_bySort(arr);
		findMaxProd_Linear(arr);
	}

	public static void findMaxProd_Linear(int A[]) {

		int max1 = A[0], max2 = Integer.MIN_VALUE;
		int min1 = A[0], min2 = Integer.MAX_VALUE;

		for (int i = 1; i < A.length; i++) {

			if (A[i] > max1) {
				max2 = max1;
				max1 = A[i];
			} else if (A[i] > max2) {
				max2 = A[i];
			}

			if (A[i] < min1) {
				min2 = min1;
				min1 = A[i];
			} else if (A[i] < min2) {
				min2 = A[i];
			}

		}

		if (max1 * max2 > min1 * min2) {
			System.out.println("Max Prod :" + "(" + max1 + " ," + max2 + " )");

		} else {
			System.out.println("Max Prod :" + "(" + min1 + " ," + min2 + " )");
		}

	}

	/**
	 * @param arr
	 *            this method time complexity is 0(n log n) and auxilary space
	 *            is o(1)
	 */
	public static void findMaxProd_bySort(int arr[]) {

		int n = arr.length;

		Arrays.sort(arr);

		if ((arr[0] * arr[1]) > (arr[n - 1] * arr[n - 2]))
			System.out.println("Pair is (" + arr[0] + " ," + arr[1] + ")");
		else
			System.out.println("Pair is (" + arr[n - 1] + " ," + arr[n - 2] + ")");

	}

	/**
	 * @param arr
	 *            This method time complexity is o(n2) and auxilary space used
	 *            by the program is o(1)
	 */
	private static void findMaxProd(int[] arr) {

		int maxprod = Integer.MIN_VALUE;
		int max_i = -1;
		int max_j = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (maxprod < arr[i] * arr[j]) {
					maxprod = arr[i] * arr[j];
					max_i = i;
					max_j = j;
				}
			}

		}
		System.out.println(
				"Max Product Pair are and their Product  :" + "{" + arr[max_i] + "," + arr[max_j] + "}  : " + maxprod);
	}

}
