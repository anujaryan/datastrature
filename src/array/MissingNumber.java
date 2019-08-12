/**
04-Aug-2019
Dell

 * 
 */
package array;

/**
 * @author Dell
 *
 *         7:57:31 pm
 */
public class MissingNumber {
	public static void main(String[] args) {

		int nums[] = { 3, 0, 1, 4 };
		System.out.println("Missing number is :" + missingNumber(nums));
	}

	/**
	 * @param nums
	 * @return
	 */
	private static int missingNumber(int[] nums) {

		int len = nums.length;
		int actualsum = (len * (len + 1)) / 2;

		for (int num : nums) {
			actualsum = actualsum - num;

		}

		return actualsum;
	}

}
