package array;

/**
 * @author Anuj Pachauri
 *
 *         12:26:12 am
 */
public class MaxiKSumAverage {

	public static double findMaxAverage(int nums[], int k) {

		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		double res = sum;

		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			res = Math.max(res, sum);
		}

		return res / k;

	}

	public static void main(String[] args) {

		int nums[] = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println("Average Sum is :" + findMaxAverage(nums, k));
	}
}
