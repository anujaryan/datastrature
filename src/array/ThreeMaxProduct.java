package array;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         11:36:55 pm
 */
public class ThreeMaxProduct {

	public static int maximumProduct(int nums[]) {

		// int product = 1;
		Arrays.sort(nums);

		return Math.max(nums[0] * nums[1] * nums[2],
				nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
	}

	public static int maximumProduct1(int nums[]) {

		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MAX_VALUE, max3 = Integer.MAX_VALUE;

		for (int n : nums) {

			if (n <= min1) {
				min2 = min1;
				min1 = n;
			} else if (n <= min2) {
				min2 = n;
			}
			if (n >= max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (n >= max2) {
				max3 = max2;
				max2 = n;
			} else if (n >= max3) {
				max3 = n;

			}

		}
		return Math.max(min1 * min2 * max1, max1 * max2 * max3);

	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3 };
		int nums1[] = { 1, 2, 3, 4 };
		int nums2[] = { -4, -3, -2, -1, 60 };
		System.out.println(maximumProduct(nums));
		System.out.println(maximumProduct(nums1));
		System.out.println(maximumProduct(nums2));

		System.out.println(maximumProduct1(nums));
		System.out.println(maximumProduct1(nums1));
		System.out.println(maximumProduct1(nums2));

	}
}
