package dynamicProgramming;

public class RecursionDP_Fibo {

	public static int recursionItr(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return recursionItr(n - 1) + recursionItr(n - 2);
	}

	public static int dp_recursion(int n) {

		int fibo[] = new int[n + 1];
		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 2; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}

		return fibo[n];
	}

	public static void main(String[] args) {

		int fiboele = 5;
		System.out.println(" Through Recursion  :  " + recursionItr(fiboele));
		System.out.println(" \n Through DP  :  " + dp_recursion(fiboele));

	}

}
