/**
04-Aug-2019
Dell

 * 
 */
package array;

import java.util.Random;

/**
 * @author Dell
 *
 *         2:35:39 pm
 */
public class StockPrice {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };
		// int prices[] = { 7, 6, 4, 3, 2, 1 };
		// prices = createData();

		System.out.println("Max  Profit of Stock is :" + maxProfit(prices));
		System.out.println("Min Profit of Stock is :" + minProfit(prices));

		System.out.println("Max Element in arrays is :" + maxELement(prices));

		System.out.println("Min Eement of Arrays is :" + minElement(prices));

		System.out.println("Max Profit at multiple transaction : " + maxProfitinMultiTransaction(prices));
	}

	/**
	 * @param prices
	 * @return
	 */
	private static int maxProfitinMultiTransaction(int[] prices) {
		int buy = 0;
		int sell = 0;
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {

			if (prices[i] < prices[i + 1]) {
				buy = prices[i];
				sell = prices[i + 1];
				profit += sell - buy;
			}

		}

		return profit;
	}

	/**
	 * @param prices
	 * @return
	 */
	private static int minElement(int[] prices) {

		int min = Integer.MAX_VALUE;

		for (int price : prices) {
			min = Integer.min(min, price);

		}

		return min;
	}

	/**
	 * @param prices
	 * @return
	 */
	private static int maxELement(int[] prices) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {
			max = Integer.max(max, prices[i]);

		}
		return max;
	}

	private static int[] createData() {
		Random random = new Random();
		int nums[] = new int[100000];

		for (int i = 0; i < nums.length; i++) {

			nums[i] = random.nextInt(100000) - 5000;

		}

		return nums;
	}

	/**
	 * @param prices
	 * @return
	 */
	private static int maxProfit(int[] prices) {

		int maxProfit = 0;
		int minProfit = Integer.MAX_VALUE;

		for (int price : prices) {

			minProfit = Integer.min(price, minProfit);
			maxProfit = Integer.max(maxProfit, price - minProfit);
		}

		return maxProfit;
	}

	/**
	 * @param prices
	 * @return
	 */
	private static int minProfit(int[] prices) {

		int maxProfit = 0;
		int minProfit = Integer.MAX_VALUE;

		for (int price : prices) {

			minProfit = Integer.min(price, minProfit);
			maxProfit = Integer.max(maxProfit, price - minProfit);
		}

		return minProfit;
	}

}
