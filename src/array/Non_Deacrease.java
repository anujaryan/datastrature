/**
27-Aug-2019
Anuj Pachauri

 * 
 */
package array;

/**
 * @author Anuj Pachauri
 *
 *         10:17:46 pm
 */
public class Non_Deacrease {

	public static boolean checkPossibility(int nums[]) {

		int change = 0;
		int k = 0;
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] < nums[i - 1]) {
				change++;
				k = i;
			}
		}

		if (change > 1) {
			return false;
		}

		if (change == 0) {
			return true;
		}

		if (k == 1 || k == nums.length - 1) {
			return true;
		}

		if (nums[k + 1] < nums[k - 1] && nums[k] < nums[k - 2]) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {

		int nums[] = { 4, 2, 3 };
		int nums1[] = { 1, 2, 3, 1, 2 };
		int nums2[] = { 1, 3, 4, 1, 2 };
		System.out.println("Possibility is : " + checkPossibility(nums));
		System.out.println("Possibility is : " + checkPossibility(nums1));
		System.out.println("Possibility is : " + checkPossibility(nums2));

	}

}
