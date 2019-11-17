package searching;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         5:45:34 pm
 */
public class TriangleNumber {

	public static int trianleNumber(int nums[]) {

		int count = 0;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			int k = i + 2;
			for (int j = i + 1; j < nums.length - 1; j++) {
				k = binarySearch(nums, k, nums.length - 1, nums[i] + nums[j]);
				count += k - j - 1;
			}
		}

		return count;
	}

	/**
	 * @param nums
	 * @param k
	 * @param length
	 * @param i
	 * @return
	 */
	private static int binarySearch(int[] nums, int l, int r, int x) {

		while (r >= l && r < nums.length) {

			int mid = l + (r - l) / 2;
			if (nums[mid] >= x) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return l;
	}

	public static void main(String[] args) {

		int nums[] = { 2, 2, 3, 4 };

		System.out.println("Valid triangle :" + trianleNumber(nums));
	}
}
