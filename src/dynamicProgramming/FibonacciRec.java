package dynamicProgramming;

/**
 * @author Anuj Pachauri
 *
5:01:00 pm
 */
public class FibonacciRec {

	// it is overlapping problem here so we can dynamic problem here..
	public int calculateFibo(int n) {

		if (n < 2) {
			return n;
		}
		return calculateFibo(n - 1) + calculateFibo(n - 2);
	}

	public int calculateFiboUsingIterator(int n) {

		int a = 0;
		int b = 1;
		int c = 0;
		if (n < 2)
			return n;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	// tabular approach to solve problem bottom up

	public int calclucateBottomUpTabulation(int n) {
		int dp[] = new int[n + 1];

		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

	// top down with memoization Dynamic problems time complexity o(n)
	public int dpCalculateFibo(int n) {

		int memoization[] = new int[n + 1];
		return calculateDp(memoization, n);
	}

	/**
	 * @param memoization
	 * @param n
	 * @return
	 */
	private int calculateDp(int[] memoization, int n) {

		if (n < 2)
			return n;

		// we already solved this problem ,so simply return this result from cached...

		if (memoization[n] != 0) {
			return memoization[n];
		}

		memoization[n] = calculateDp(memoization, n - 1) + calculateDp(memoization, n - 2);

		return memoization[n];
	}

	public static void main(String[] args) {
		FibonacciRec f = new FibonacciRec();
		// System.out.println("1000th fibonacci term : " + f.calculateFibo(1000));
		// System.out.println("1000th fibonacci term : " + f.dpCalculateFibo(1000));
		// System.out.println("1000th fibonacci term : " +
		// f.calculateFiboUsingIterator(1000));
		System.out.println("1000th fibonacci term : " + f.calclucateBottomUpTabulation(1000));

	}
}
