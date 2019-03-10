package array;

public class EquilibriumIndexArray {

	static void findEquilibriumIndex(int arr[]) {

		int n = arr.length;

		int left[] = new int[n];
		left[0] = 0;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] + arr[i - 1];
		}

		int right = 0;

		for (int j = arr.length - 1; j >= 0; j--) {

			if (left[j] == right) {
				System.out.println("Equilibrium Found  at index :" + j);
			}

			right += arr[j];
		}

	}

	public static void main(String str[]) {
		int arr[] = { 3, 2, 0, 5 };
		findEquilibriumIndex(arr);

	}
}
