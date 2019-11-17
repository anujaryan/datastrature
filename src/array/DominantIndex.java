package array;

/**
 * @author Anuj Pachauri
 *
 *         1:22:45 am
 */
public class DominantIndex {

	public static int dominantIndex(int nums[]) {

		int largest = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
				index = i;
			}
		}

		for (int i = 0; i < nums.length; i++) {

			if (i != index) {

				if (!(largest >= nums[i] * 2)) {
					return -1;
				}
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 6, 1, 0 };
		int[] nums1 = { 1, 2, 3, 4 };

		System.out.println("Dominant Index : " + dominantIndex(nums));
		System.out.println("Dominant Index : " + dominantIndex(nums1));
	}
}
