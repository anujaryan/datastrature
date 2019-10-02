package array;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         2:45:52 am
 */
public class ArrayPartitionMaxSum {

	public static int MaxSum(int nums[]) {

		int n = nums.length / 2;

		Arrays.sort(nums);

		int sum = 0;
		for (int i = 0; i < nums.length - 1;) {

			sum += Math.min(nums[i], nums[i + 1]);
			i += 2;

		}

		return sum;

	}

	public static void main(String[] args) {

		int nums[] = { 1, 4, 3, 2 };
		System.out.println("Max Sum : " + MaxSum(nums));
	}
}
