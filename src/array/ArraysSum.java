/**
31-Jul-2019
Dell

 * 
 */
package array;

/**
 * @author Dell
 *
 *         11:55:47 pm
 */
public class ArraysSum {
	public int[] productExceptSelf(int[] nums) {

		int ret[] = new int[nums.length];
		ret[0] = 1;
		for (int i = 0; i < nums.length; i++) {
			int index = i;
			for (int j = 0; j < nums.length; j++) {
				if (index == j) {

				} else {
					ret[index] = ret[index] * nums[j];
				}
			}
		}

		return ret;

	}

}
