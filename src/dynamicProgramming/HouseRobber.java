/**
31-Aug-2019
Anuj Pachauri

 * 
 */
package dynamicProgramming;

/**
 * @author Anuj Pachauri
 *
 *         4:56:53 pm
 */
public class HouseRobber {

	public static int rob(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];

		}

		return sum;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		int[] nums1 = { 2, 7, 9, 3, 1 };
		int[] nums2 = { 2, 7, 9, 3, 1, 12 };
		System.out.println("Rob Money " + rob(nums));
		System.out.println("Rob Money " + rob(nums1));
		System.out.println("Rob Money " + rob(nums2));

		System.out.println("Rob Money " + rob1(nums));
		System.out.println("Rob Money " + rob1(nums1));
		System.out.println("Rob Money " + rob1(nums2));
	}

	public static int rob1(int[] nums) {

		int ans = 0;
		int ppval = 0;
		int pval = 0;
		for (int i = 0; i < nums.length; i++) {

			nums[i] = nums[i] + ppval;
			ans = Math.max(nums[i], pval);

			ppval = pval;
			pval = ans;

		}
		return ans;
	}
}
