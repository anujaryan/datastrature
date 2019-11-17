package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         11:53:31 pm
 */
public class SumOfEvenQuery {

	public static int[] sumofEvenQuery(int[] A, int[][] queries) {

		int sumofarray[] = new int[A.length];

		for (int row = 0; row < queries.length; row++) {

			int val = queries[row][0];
			int index = queries[row][1];
			int i = sumofeven(val, index, A);
			sumofarray[row] = i;

		}

		return sumofarray;

	}

	/**
	 * @param val
	 * @param index
	 * @param a
	 * @return
	 */
	private static int sumofeven(int val, int index, int[] a) {

		int j = a[index];
		a[index] = j + val;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };
		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };

		System.out.println(Arrays.toString(sumofEvenQuery(A, queries)));
	}
}
