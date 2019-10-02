package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         1:13:13 pm
 */
public class MaxConsecutiveOne {

	public static int consecutiveMaxOne(int arr[]) {

		List<Integer> countOne = new ArrayList<>();

		int count = 0;
		for (int i : arr) {

			if (i == 1) {
				count++;
			} else {
				countOne.add(count);
				count = 0;
			}
		}
		countOne.add(count);
		int max = Integer.MIN_VALUE;
		for (int i : countOne) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	public static int maxConsecutiveSol(int nums[]) {
		int max = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				max = Math.max(max, count);
				count = 0;
			} else {
				count++;
			}
		}
		return Math.max(max, count);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 1, 1, 1 };// output 3
		System.out.println("Max Consecutive One : " + consecutiveMaxOne(arr));
		System.out.println("Max Consecutive One : " + maxConsecutiveSol(arr));
	}

}
