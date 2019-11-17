package array2;

/**
 * @author Anuj Pachauri
 *
 *         9:50:31 pm
 */
public class FrequencyOfTargetNum {

	// private final String ="Hello";

	public static int countFrequencyOfNum(int nums[], int target) {

		int freq = 0;

		loop: while (freq <= 3) {
			for (int j = 0; j < 4; j++) {
				if (j == 3) {
					break loop;
				} else {
					System.out.println(j);
				}

			}

		}

		loop: for (int i = 0; i < nums.length; i++) { // o(n)
			if (target == nums[i]) {
				freq++;
			}

		}

		return freq;
	}

	public static void main(String[] args) {
		int i = 0;
		loop: while (i <= 3) {
			for (int j = 0; j < 4; j++) {
				if (j == 3) {
					break loop;
				} else {
					System.out.println(j);
				}

			}

		}
		int nums[] = { 1, 1, 2, 2, 3 };
		int target = 2;

		// System.out.println("Frequency of Number : " + countFrequencyOfNum(nums,
		// target));
		// binarySearch(nums, target);
		int num[] = searchRange(nums, target);
		// Arrays.stream(num).forEach(x -> System.out.println(x));
		FrequencyOfTargetNum et = new FrequencyOfTargetNum();
		// et.binarySearch();

	}

	public static void binarySearch(int nums[], int target) {

		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] < target) {
				low = mid + 1;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				System.out.println("Element found..");
				break;
			}
		}

	}

	public static int[] searchRange(int nums[], int target) {

		int res[] = new int[2];
		int low = 0;
		int index = 0;
		int high = nums.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (nums[mid] < target) {
				low = mid + 1;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				res[index] = mid;
			}
		}
		return res;
	}

}
