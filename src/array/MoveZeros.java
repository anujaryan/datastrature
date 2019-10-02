/**
10-Aug-2019
Dell

 * 
 */
package array;

import java.util.Arrays;

/**
 * @author Dell
 *
 *         4:49:15 pm
 */
public class MoveZeros {

	private static void movesZero(int[] arr) {

		int i;
		int j = 0;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[j++] = arr[i];
			}

		}
		while (j < arr.length) {
			arr[j] = 0;
			j++;
		}

		Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
		;

	}

	public static void main(String[] args) {
		int[] arr0 = { 0, 1, 0, 3, 12 };
		int[] arr = { 0, 1, 0, 3, 12 };
		int[] arr1 = { 1, 0, 4, 5, 0, 14, 67, 0, 25, 0 };
		movesZero(arr0);
	}
}
