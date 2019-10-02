package searching;

/**
 * @author Anuj Pachauri
 *
 *         2:26:19 pm
 */
public class ExactSearch {

	public static int exactSearch(int[] nums, int target) {

		int l = 0;
		int r = nums.length;
		while (l < r) {

			int mid = l + (r - l) / 2;

			if (target == nums[mid]) {
				return mid;
			} else if (target > nums[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		int nums[] = { 20, 50, 60, 70, 80 };
		int target = 10;
		System.out.println("Search Element found at indext :" + exactSearch(nums, target));

		int nums1[] = { 0, 1, 1, 1, 1, 1 };
		int target1 = 1;

		System.out
				.println("Search First Position which value val>=target at indext :" + bisect_Left_raw(nums1, target1));

	}

	public static int bisect_Left_raw(int nums[], int target) {

		int l = 0;
		int r = nums.length;

		while (l < r) {
			int mid = l + (r - l) / 2;
			if (target < nums[mid]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return l;
	}

}
