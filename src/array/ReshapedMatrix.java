package array;

/**
 * @author Anuj Pachauri
 *
 *         9:41:12 pm
 */
public class ReshapedMatrix {

	public static int[][] reshapedMatrix(int[][] arr, int r, int c) {

		int result[][] = new int[r][c];

		int rold = arr.length;
		int cold = arr[0].length;

		if (rold * cold != r * c) {
			return arr;
		}

		int k = 0;
		int l = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = arr[k][l];
				if (l == cold - 1) {
					l = 0;
					k++;
				} else {
					l++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2 }, { 3, 4 } };
		int r = 1, c = 4;
		arr = reshapedMatrix(arr, r, c);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

		}

	}
}
