package array;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         1:23:39 am
 */
public class EvenOdd {

	public static void evenOdd(int arr[]) {

		int nextEven = 0, nextOdd = arr.length - 1;

		while (nextEven < nextOdd) {
//{ 1, 3, 5, 4 };
			if (arr[nextEven] % 2 == 0) {
				nextEven++;
			} else {
				int temp = arr[nextEven];
				arr[nextEven] = arr[nextOdd];
				arr[nextOdd--] = temp;
			}
		}
		System.out.println();
		Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

	}

	// brute force alog

	public static void oddEven(int arr[]) {

		int evenodd[] = new int[arr.length];

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenodd[counter] = arr[i];
				counter++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				evenodd[counter] = arr[i];
				counter++;
			}
		}

		Arrays.stream(evenodd).forEach(x -> System.out.print(x + " "));

	}

	public static void main(String args[]) {
		int arr[] = { 1, 3, 5, 4 };
		oddEven(arr);
		evenOdd(arr);
	}
}
