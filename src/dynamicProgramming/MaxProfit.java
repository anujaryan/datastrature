package dynamicProgramming;

/**
 * @author Anuj Pachauri
 *
5:54:48 pm
 */
public class MaxProfit {

	// Since our memoization array dp[profits.length][capacity+1] stores the results
	// for all the subproblems,
	// we can conclude that we will not have more than N*CN∗C subproblems (where ‘N’
	// is the number of items and ‘C’ is the knapsack capacity).
	// This means that our time complexity will be O(N*C)O(N∗C).

	public int maxProfitMemoization(int[] profits, int[] weight, int capacity) {

		int dp[][] = new int[profits.length][capacity + 1];
		return maxProfitMemoization(dp, profits, weight, capacity, 0);

	}

	/**
	 * @param profits
	 * @param weight
	 * @param capacity
	 * @param i
	 * @return
	 */
	private int maxProfitMemoization(int dp[][], int[] profits, int[] weight, int capacity, int currentIndex) {

		if (capacity <= 0 || currentIndex >= profits.length) {
			return 0;
		}

		// if we have alreat solved a similar problem, return it
		if (dp[currentIndex][capacity] != 0) {
			return dp[currentIndex][capacity];
		}

		int profit1 = 0;
		if (weight[currentIndex] <= capacity) {
			profit1 = profits[currentIndex]
					+ maxProfitRecu(profits, weight, capacity - weight[currentIndex], currentIndex + 1);
		}

		// recursive call after excluding the element at the c

		int profit2 = maxProfitRecu(profits, weight, capacity, currentIndex + 1);

		dp[currentIndex][capacity] = Math.max(profit1, profit2);
		return dp[currentIndex][capacity];
	}

	public int maxProfit(int[] profits, int[] weight, int capacity) {


		return maxProfitRecu(profits, weight, capacity, 0);

	}

	/**
	 * @param profits
	 * @param weight
	 * @param capacity
	 * @param i
	 * @return
	 */
	private int maxProfitRecu(int[] profits, int[] weight, int capacity, int currentIndex) {

		if (capacity <= 0 || currentIndex >= profits.length) {
			return 0;
		}

		int profit1 = 0;
		if (weight[currentIndex] <= capacity) {
			profit1 = profits[currentIndex]
					+ maxProfitRecu(profits, weight, capacity - weight[currentIndex], currentIndex + 1);
		}

		// recursive call after excluding the element at the c

		int profit2 = maxProfitRecu(profits, weight, capacity, currentIndex + 1);

		return Math.max(profit1, profit2);
	}

	public static void main(String[] args) {

		MaxProfit mp = new MaxProfit();
		int[] profits = { 1, 6, 10, 16 };
		int[] weight = { 1, 2, 3, 5 };

		int maxProfit = mp.maxProfit(profits, weight, 7);

		System.out.println("Total profits------->" + maxProfit);
		maxProfit = mp.maxProfitMemoization(profits, weight, 7);
		System.out.println("Total profits------->" + maxProfit);

		maxProfit = mp.maxProfit(profits, weight, 6);
		System.out.println("Total profits------->" + maxProfit);

		maxProfit = mp.maxProfitMemoization(profits, weight, 6);
		System.out.println("Total profits------->" + maxProfit);

	}
}
