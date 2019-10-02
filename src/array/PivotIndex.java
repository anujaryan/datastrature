package array;

/**
 * @author Anuj Pachauri
 *
 *         1:38:51 am
 */
public class PivotIndex {

	public static int pivotIndex(int nums[]) {

		int pivot = -1;
		if (nums.length == 0)
			return pivot;

		int sum = 0;
		for (int i : nums)
			sum += i;

		double temp = 0;
		for (int j = 0; j < nums.length; j++) {

			if (temp == ((sum - nums[j]) / 2)) {
				pivot = j;
				return pivot;
			} else {
				temp += nums[j];
			}

		}

		return pivot;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 7, 3, 6, 5, 6 };

		System.out.println("Pivot Element is :" + pivotIndex(nums));

	}
}
