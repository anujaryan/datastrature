/**
14-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

import java.util.Arrays;

/**
 * @author anuj
 *
 *         9:23:36 PM
 */
public class SortingDriver {

	public static void bubbleSort(int sort[]) {

		int n = sort.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 1; j < (n - i); j++) {
				if (sort[j - 1] > sort[j]) {
					temp = sort[j - 1];
					sort[j - 1] = sort[j];
					sort[j] = temp;
				}

			}
		}

	}

	public static void selectionSort(int sort[]) {

		int n = sort.length;

		for (int i = 0; i < n; i++) {

			int temp = sort[i];
			for (int j = i + 1; j < n; j++) {

			}
		}

	}

	public static void main(String str[]) {

		int sort[] = { 3, 5, 2, 9, 7, 6 };
		System.out.println("Before sorting array.....");
		Arrays.stream(sort).forEach(x -> System.out.print(x + " ,"));

		System.out.println("After bubble sorting....... ");

		bubbleSort(sort);
		Arrays.stream(sort).forEach(x -> System.out.print(x + " , "));
	}
}
