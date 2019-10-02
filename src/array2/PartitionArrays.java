package array2;

/**
 * @author Anuj Pachauri
 *
 *         2:21:56 am
 */
public class PartitionArrays {

	public static boolean canThreePartsEqualsSum(int nums[]) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

		}
		int countpart = 0;
		if (sum % 3 == 0) {

			int parsum = sum / 3;
			int pararrsum = 0;
			for (int i = 0; i < nums.length; i++) {
				pararrsum += nums[i];
				if (pararrsum == parsum) {
					countpart++;
					pararrsum = 0;
				}

			}

		} else {
			return false;
		}

		if (countpart == 3) {
			return true;
		} else {

			return false;
		}
	}

	public static void main(String[] args) {

		int nums[] = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 };
		int nums1[] = { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 };
		int nums2[] = { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 };
		System.out.println(canThreePartsEqualsSum(nums));
		System.out.println(canThreePartsEqualsSum(nums1));
		System.out.println(canThreePartsEqualsSum(nums2));

	}
}
