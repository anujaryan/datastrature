package array2;

/**
 * @author Anuj Pachauri
 *
 *         3:28:16 pm
 */
public class GenerateMatrix {

	public static int[][] generateMatrix(int n) {

		// int m = n * n;

		int arr[][] = new int[n][n];
		int e = 1;
		for (int row = 0; row < n; row++) {

			for (int col = 0; col < n; col++) {
				arr[row][col] = e++;

			}

		}

		return arr;

	}

	public static void main(String[] args) {
		int arr[][] = generateMatrix(3);
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");

			}
			System.out.println();

		}

	}
}
