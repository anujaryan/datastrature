package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         2:07:13 am
 */
public class SortedSquare {

	public static int[] sortedSquare(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		Arrays.sort(A);

		return A;
	}

	public static void main(String[] args) {
		// Input: [-4,-1,0,3,10]
		// Output: [0,1,9,16,100]

		int nums[] = { -4, -1, 0, 3, 10 };
		System.out.println(Arrays.toString(sortedSquare(nums)));
	}
}
