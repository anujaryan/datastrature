package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         11:24:16 pm
 */
public class NextGreaterNum {

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		int res[] = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			int nums = nums1[i];
			boolean flag = false;
			for (int j = i + 1; j < nums2.length; j++) {

				if (nums < nums2[j]) {
					flag = true;
					nums = nums2[j];
					break;
				}
			}

			if (flag) {
				res[i] = nums;
			} else {
				res[i] = -1;
			}

		}

		return res;

	}

	public static void main(String[] args) {

		int[] nums1 = { 2, 4 }, nums2 = { 1, 2, 3, 4 };
		Arrays.stream(nextGreaterElement(nums1, nums2)).forEach(x -> System.out.print(x));
	}
}
