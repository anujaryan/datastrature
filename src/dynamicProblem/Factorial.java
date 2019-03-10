package dynamicProblem;

public class Factorial {

	static int fact_rec(int n) {
		if (n == 1)
			return 1;
		return n * fact_rec(n - 1);
	}

	static int fact_dp(int n) {
		int fact[] = new int[n + 1];
		fact[0] = 1;
		for (int i = 1; i <= n; i++) {
			fact[i] = fact[i - 1] * i;
		}
		return fact[n];
	}

	static int top_down_dp(int n) {
		int[] dp = new int[n + 1];
		dp[n] = -1;
		if (n == 0)
			return 1;
		if (dp[n] != -1)
			return dp[n];
		return (dp[n] = n * top_down_dp(n - 1));
	}

	public static void main(String[] args) {
		int fact_num = 5;
		System.out.println("Factorial of number by recursion is " + fact_rec(fact_num));

		System.out.println("Factorial of number by  bottom  up dp is " + fact_rec(fact_num));

		System.out.println("Factorial of number by dp top down approach is " + top_down_dp(fact_num));

	}

}
