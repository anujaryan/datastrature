/**
01-Sep-2019
Anuj Pachauri

 * 
 */
package binarysearch;

/**
 * @author Anuj Pachauri
 *
 *         3:39:30 pm
 */
public class BinarySearchImpl {

	public static int SearchNumber(int nums[], int target) {

		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		while (low <= high) {

			mid = low + (high - low) / 2;

			if (nums[mid] > target) {
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {

				return mid;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int nums[] = { 2, 46, 8, 12, 56, 80, 123 };

		System.out.println(SearchNumber(nums, 12));
		int i = Integer.MAX_VALUE + 10;
		System.out.println(i);
		// System.out.println(chec(null));

		int j = 10;
		j <<= 2;
		j = (j - 1) >>> 3;
		System.out.println(" j" + j);

	}

	public static int chec(String s) {
		try {

			return s.toString().length();
		} catch (Exception e) {
			// TODO: handle exception
			return -1;
		} finally {
			return 0;
		}
	}
}
