package searching;

/**
 * @author Anuj Pachauri
 *
 *         2:58:45 pm
 */
public class RotatedSearch {

	public static int rotateSearch(int nums[], int target) {

		int l = 0;
		int r = nums.length - 1;

		while (l <= r) {

			int mid = l + (r - l) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (isOnLeftSide(nums, l, mid, r, target)) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}

		}

		return -1;
	}

	/**
	 * @param nums
	 * @param l      low
	 * @param mid
	 * @param r      high
	 * @param target
	 * @return
	 */
	private static boolean isOnLeftSide(int[] nums, int l, int mid, int r, int target) {

		if (nums[l] < nums[mid]) { // left side is sorted ...

			return nums[l] <= target && nums[mid] >= target;

		} else {
			return nums[r] > nums[mid] && !(target >= nums[mid] && nums[r] >= target);
		}

	}

	public static void main(String[] args) {
		int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		System.out.println("Index of Element in Rotated arrays .." + rotateSearch(nums, target));
	}
}
