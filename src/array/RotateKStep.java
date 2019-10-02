/**
11-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         6:31:26 pm
 */
public class RotateKStep {

	public static void rotate(int[] nums, int k) {

		int len = nums.length;
		if (k > len)
			k = k % len;

		if (k != 0) {

			int temp[] = nums.clone();
			for (int i = 0; i < temp.length; i++) {
				nums[i] = temp[(len + i - k) % len];
			}
		}
		Arrays.stream(nums).forEach(x -> System.out.print(x + " "));

	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
	}

}
