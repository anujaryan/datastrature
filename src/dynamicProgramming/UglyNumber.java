package dynamicProgramming;

/* ***********************   Ugly Numbers *******************************
 Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
 The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … 
shows the first 11 ugly numbers. By convention, 1 is included*/
public class UglyNumber {

	static void findUgly(int n, int nth) {

		int arr[] = new int[n + 1];
		// System.out.print(1 + " ");
		int k = 1;
		arr[k] = 1;
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				// System.out.print(i + " ");
				arr[++k] = i;

			}
		}

		System.out.println("Nth ugly number is :" + arr[nth]);

	}

	public static void main(String[] args) {

		int n = 15;
		findUgly(n, 7);
	}
}
