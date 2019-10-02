/**
31-Aug-2019
Anuj Pachauri

 * 
 */
package dynamicProgramming;

/**
 * @author Anuj Pachauri
 *
 *         5:50:24 pm
 */
public class MinCost {

	public static void main(String[] args) {

		int cost[] = { 10, 15, 20 };

		int cost1[] = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };

		System.out.println(" Recusive Solution Min Cost is : " + minCost(cost));

		System.out.println(" Recursive Solution Min Cost is : " + minCost(cost1));

		System.out.println(" Greedy Solution Min Cost is : " + minCost1(cost));

		System.out.println(" Greedy Solution Min Cost is : " + minCost1(cost1));

	}

	// Greedy Solution
	public static int minCost1(int cost[]) {

		int n = cost.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return cost[0];

		int min[] = new int[n];

		min[0] = cost[0];
		min[1] = cost[1];

		for (int i = 2; i < n; i++) {

			min[i] = Math.min(min[i - 1] + cost[i], min[i - 2] + cost[i]);

		}

		return Math.min(min[n - 1], min[n - 2]);
	}

	// Recursive Solutin

	private static int minCost(int cost[]) {

		Integer memo[] = new Integer[cost.length + 1];
		return Math.min(minClimb(cost, 0, memo), minClimb(cost, 1, memo));
	}

	/**
	 * @param cost
	 * @param i
	 * @param memo
	 * @return
	 */
	private static int minClimb(int[] cost, int index, Integer[] memo) {

		if (index >= cost.length) {
			return 0;
		}

		if (memo[index] == null) {
			memo[index] = Math.min(minClimb(cost, index + 1, memo), minClimb(cost, index + 2, memo)) + cost[index];

		}
		return memo[index];
	}
}
