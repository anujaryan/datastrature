package array;

import java.util.Arrays;

public class Merge2ArrWtCons {

	public static void main(String str[]) {
		int x[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
		int y[] = { 1, 8, 9, 10, 15 };
		// output
		// x[]={1,2,3,5,6,8,9,10,15}
		rearrangeArray(x, y);
		System.out.println(Arrays.toString(x));

	}

	private static void rearrangeArray(int[] x, int[] y) {

		int k = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				x[k++] = x[i];
			}
		}

		merge(x, y, k - 1, y.length - 1);

	}

	private static void merge(int[] x, int[] y, int m, int n) {

		int k = m + n + 1;

		while (m >= 0 && n >= 0) {
			if (x[m] > y[n])
				x[k--] = x[m--];
			else
				x[k--] = y[n--];
		}

		while (n >= 0) {
			x[k--] = y[n--];
		}

	}

}
