package math;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
7:37:37 pm
 */
public class Largest3AnglePerimeter {

	public static int largest3Triangle(int A[]) {

		Arrays.sort(A);

		for (int i = A.length - 3; i >= 0; i--) {

			if (A[i] + A[i + 1] > A[i + 2]) {
				return A[i] + A[i + 2] + A[i + 1];
			}

		}
		return 0;

	}

	public static void main(String[] args) {

		int A[] = { 1, 2, 2 };
		System.out.println(largest3Triangle(A));

	}
}
