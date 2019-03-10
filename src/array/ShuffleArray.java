package array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	/**
	 * @param arr
	 * 
	 *            time complexity for this program is o(n) and space complexity
	 *            is o(1) fisher yates shuffle algorithm
	 */
	static void shuffle(int[] arr) {
		int n = arr.length;
		Random rand = new Random();
		for (int i = n - 1; i >= 1; i--) {
			int j = rand.nextInt(i + 1);
			swap(arr, i, j);

		}

	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 *            utilities function for swap to integer
	 */
	private static void swap(int[] arr, int i, int j) {

		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void main(String str[]) {
		int arr[] = { 15, 6, 9, 10, 11 };
		System.out.println("Before Shuffle....");
		System.out.println(Arrays.toString(arr));
		shuffle(arr);
		System.out.println("After shuffle");
		System.out.println(Arrays.toString(arr));
	}

}
