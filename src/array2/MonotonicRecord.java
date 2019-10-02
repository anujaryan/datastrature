package array2;

/**
 * @author Anuj Pachauri
 *
 *         11:29:29 pm
 */
public class MonotonicRecord {

	public static boolean isMonotonic(int nums[]) {

		return increaseArr(nums) || descrease(nums);

	}

	/**
	 * @param nums
	 * @return
	 */
	private static boolean descrease(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1])
				return false;
		}
		return true;
	}

	/**
	 * @param nums
	 * @return
	 */
	private static boolean increaseArr(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] > nums[i + 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 2, 3 };// true
		int nums1[] = { 6, 5, 4, 4 };// true
		int nums2[] = { 1, 3, 2 };// false
		int nums3[] = { 11, 11, 9, 4, 3, 3, 3, 1, -1, -1, 3, 3, 3, 5, 5, 5 };// false
		int nums4[] = { 2, 2, 2, 1, 4, 5 };// fasle
		int nums5[] = { 3, 3, 3, 5, 5, 5, -1, -1, -1, -2, };// false
		System.out.println(isMonotonic(nums));

		System.out.println(isMonotonic(nums1));

		System.out.println(isMonotonic(nums2));
		System.out.println(isMonotonic(nums3));
		System.out.println(isMonotonic(nums4));
		System.out.println(isMonotonic(nums5));
	}
}
